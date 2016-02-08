class WhaleTypes{

 def hump(){
    println("Wow! Hump-back whale..")
 }

 def blue(){
   println("Blue whale? Really..?")

 }
 def willy(){
    println("Free Willy movie..? Wow!!")
 }


}


object Whale{

   def main(args: Array[String]){

     println("Program begins....")
     val whales = new WhaleTypes()
     whales.hump()
     whales.blue()
     whales.willy()
     println("Program ends....")
   }

}
