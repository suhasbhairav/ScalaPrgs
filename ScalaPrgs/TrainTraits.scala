trait Trains{
 def speed(x: Int)
 def country(x: String)
 def traintype(x: Int)
}


class Types(x: Int, y: String, z: Int) extends Trains{

  var xSpeed: Int = x
  var yCountry: String = y
  var zType: Int = z
  def speed(x: Int){
    if(x> xSpeed) { println("Superfast...") }
  }

  def country(x: String){ 
    if(yCountry.equals(x)){
    println("Europe...")
    }
 }
  def traintype(x: Int){
   if(x > 500){
     println("ICE...")
   }
  }
	
}


object TrainTraits{

  def main(args: Array[String]){

    println("Program begins...")
    val train = new Types(1000, "Germany", 3000)
    train.speed(4000)
    train.country("Germany")
    train.traintype(6000)
    println("Program ends...")

   }




}






