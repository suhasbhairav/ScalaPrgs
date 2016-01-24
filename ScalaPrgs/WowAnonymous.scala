object WowAnonymous{

 def CallMeAgain( callback: () => Unit){
  callback();
 } 

 def main(args: Array[String]){

   CallMeAgain( () => println("Really ..? Wow!..."))
  }



}
