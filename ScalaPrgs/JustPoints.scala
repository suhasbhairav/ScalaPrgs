class Mammal{
 
  def cat(){
    println("Cat is a mammal")

  }
  def platypus(){

     println("Platypus is an egg laying mammal")
  }

  def whale(){
     println("Whale is the largest mammal.")

  }


}


object JustPoints{
  def main(args: Array[String]){
    println("Program begins...")

     val mammal = new Mammal()
     mammal.cat()
     mammal.platypus()
     mammal.whale()
    println("Program ends....")
  }



}
