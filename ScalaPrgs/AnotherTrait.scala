trait University{

 def registration(xName : Any) : String
 def enroll(xClass : Any) : String
 def results(xMarks : Any) : String

 

}

class Student extends University{

 def registration(xName : Any) = xName.toString()
 def enroll(xClass : Any) = xClass.toString()
 def results(xMarks : Any) = xMarks.toString()

 


}


object AnotherTrait{

 def main(args: Array[String]){
  println("AnotherTrait...")
  val stud = new Student()
  println(stud.registration("Student name..."))
  println(stud.enroll("Master's program"))
  println(stud.results("2.2"))

 }

}

