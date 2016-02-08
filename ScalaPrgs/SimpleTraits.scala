trait Mammal{

   def place(x: Any)

   def color(x: Any)

}

class Animals extends Mammal{

   def place(x: Any){
     println("Water")
     println(x.toString())
   }

   def color(x: Any){
    println("Color")
    println(x.toString())

  }



}


object SimpleTraits{


  def main(args: Array[String]){
   println("Program begins...")
     val animal = new Animals()
     animal.place("Oceans")
     animal.color("Dark Blue")


   println("Program ends...")

   
  }


}
