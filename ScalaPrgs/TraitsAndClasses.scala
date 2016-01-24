trait Animal{

 def color(x: Any) : Boolean
 def height(x: Any) : Double
 def weight(x: Any) : Double
 def region() : String
}

class Mammals extends Animal{

 def color(x: Any) = x == "Red"

 def height(x:Any)  = 1.2

 def weight(x : Any) = 2.4

 def region() = "Greenland"


}


object TraitsAndClasses{


 def main(args: Array[String]){
   println("Traits...")
   val mammal = new Mammals()
   println(mammal.color("Red"))
   println(mammal.height(1.4))
   println(mammal.weight(2.4))
   println(mammal.region())

 }


}
