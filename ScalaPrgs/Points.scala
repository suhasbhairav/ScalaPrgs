class Marvel{

   def characters(xc: Int){
    println("Batman")
    if(xc == 1){


    println("Joker")
   }else if(xc == 2){

     println("Superman...")
   }
   else if(xc == 3){
     println("He-Man")

   }else{

     println("Spiderman...!")
   }
 }

}

object Points{

   def main(args: Array[String]){
    val marvel = new Marvel()
    marvel.characters(2)
    println("Hi...")
    println("Practising scala...")
   }

}
