object FunctionsAsObjects{
 


 def callMe(){
   println("Time flies...")

  }

 def callMeAgain(callback: () => Unit){
  while(true){
   callback();
   Thread sleep 1000
  }

 }
 def main(args: Array[String]){
     callMeAgain(callMe)

 }





}
