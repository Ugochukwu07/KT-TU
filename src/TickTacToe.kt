
var board = arrayListOf<ArrayList<String>>()

fun main (args: Array<String>) {
    for(i in 0..2){
        val row = arrayListOf<String>()
        for(j in 0..2)
            row.add(" ")
        board.add(row)
    }

    printBoard()

    var continueGame = true

    do{
        println("Enter your move (row and column, eg. 1, 1) or 'q' to quit:")
        var input = readLine()?:""
        if(input.lowercase() == "q"){
            continueGame = false
            println("Thanks for playing!")
            break
        }
        var row: Int = 0
        var col: Int = 0
        var skipRound: Boolean = false

        try {
            val parts = input.split(",")
            if (parts.size != 2) {
                println("Invalid input. Please enter row and column separated by a comma.")
                continue
            }
            row = parts[0].trim().toInt()
            col = parts[1].trim().toInt()

            if(board[row-1][col-1] != " "){
                println("Cell already occupied. Try again.")
                skipRound = true
                continue
            } else {
                board[row-1][col-1] = "X"
                printBoard()
            }

            if(!skipRound){
                var playerWon: Boolean = checkWiner(true)
                if(playerWon){
                    println("\uD83C\uDF7E Congratulations! You've won the game! \uD83C\uDF89")
                    continueGame = false
                }

                var boardFull: Boolean = checkBoardFull()
                if(!playerWon && boardFull){
                    println("\uD84C Game over! It's a draw! \uD83D\uDE10")
                    continueGame = false
                }

                if(continueGame) {
                    placeComputerMove()
                    val computerWon: Boolean = checkWiner(false)
                    if (computerWon) {
                        println("\uD83D\uDCBB Computer wins! Better luck next time! \uD83D\uDE14")
                        continueGame = false
                    }
                }
            }

        } catch (exception: Exception) {
            println("Invalid input. Please enter row and column as numbers.")
            println{"Exception: ${exception.message}"}
            continue
        }
    } while (continueGame)
}

fun checkWiner(player: Boolean): Boolean {
    var checkSymbol: String = if (player) "X" else "O"

    // Check rows and columns
    for(i in 0..2){
        //Horizontal win
        if(board[i][0] == checkSymbol && board[i][1] == checkSymbol && board[i][2] == checkSymbol){
            println("Player ${checkSymbol} wins!")
            return true
        }

        //Vertical win
        if(board[0][i] == checkSymbol && board[1][i] == checkSymbol && board[2][i] == checkSymbol){
            println("Player ${checkSymbol} wins!")
            return true
        }
    }
    // Check diagonals
    if(board[0][0] == checkSymbol && board[1][1] == checkSymbol && board[2][2] == checkSymbol){
        println("Player ${checkSymbol} wins!")
        return true
    }
    if(board[0][2] == checkSymbol && board[1][1] == checkSymbol && board[2][0] == checkSymbol){
        println("Player ${checkSymbol} wins!")
        return true
    }
    return false
}

fun checkBoardFull(): Boolean{
    for(i in 0..2){
        for(j in 0..2){
            if(board[i][j] == " ")
                return false
        }
    }
    println("It's a draw!")
    return true
}

fun placeComputerMove(){
    var moveMade: Boolean = false
    do{
        var row: Int = (0..2).random()
        var col: Int = (0..2).random()
        if(board[row][col] == " "){
            board[row][col] = "O"
            moveMade = true
            println("Computer placed O at (${row+1}, ${col+1})")
            printBoard()
        }
    } while (!moveMade)
}

fun printBoard(){
    println("-------------")
    for(i in 0..2){
        for(j in 0..2){
            when(board[i][j]){
                "X" -> print("\u001B[31m| X \u001B[31m") // Red color for X
                "O" -> print("\u001B[34m| O \u001B[34m") // Blue color for O
                else -> print("\u001B[0m|   \u001B[0m") // Reset color for empty
            }
        }
        println("\u001B[0m|   \u001B[0m") // Reset color at the end of the row
        println("-------------")
    }
}