fun main (args: Array<String>){

    var course: KotlinCourse = KotlinCourse()
    course.getCourseInfo()

    KotlinCourse.getCourseDuration()
}

class KotlinCourse{
    fun getCourseInfo(){
        println("Kotlin is a java based programming language.")
    }

    companion object {
        fun getCourseDuration(){
            println("The course duration is 3 months.")
        }
    }
}