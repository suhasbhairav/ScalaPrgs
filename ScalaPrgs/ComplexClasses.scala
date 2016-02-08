class Names(xName:String, yName: String, zName: String){


   var x: String = xName
   var y: String = yName
   var z: String = zName
  
   def names(){
    println(x)
    println(y)
    println(z)

   }







}


object ComplexClasses{

  def main(args: Array[String]){
   println("Program begins...")
   val name = new Names("Dave", "Alex", "Scott")
   name.names()   
   println("Program ends...")
  }


}
