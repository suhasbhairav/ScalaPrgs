object AnotherFO{


 def giveMeACall( callback: () => Unit){
  while(true){
   callback();
   Thread sleep 1000;
  }


 }
 def callMeTonight(){

  println("I'm trying to call you...")

 }
 def main(args: Array[String]){

   giveMeACall(callMeTonight)

 }





}
