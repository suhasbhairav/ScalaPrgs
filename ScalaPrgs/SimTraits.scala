trait Jets{

 def name(x:String)
 def speed(y: Int)

}


class AirForce extends Jets{

   def name(x: String){
     println(x)
   }
  def speed(y: Int){
    println(y)
  }


}

object SimTraits{

   def main(args: Array[String]){
     println("Program begins....")
     val plane = new AirForce()
     plane.name("Hornet")
     plane.speed(1000)
 
     println("Program ends...")
  }



}
