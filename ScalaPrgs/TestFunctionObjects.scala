object TestFunctionObjects{
 
 def callMe( callback: () => Unit){

  while(true){
   callback();
   Thread sleep 1000;

  }
 }

 def callMeAgain(){
  println("Print me...")

 }
 def main(args: Array[String]){

   callMe(callMeAgain);


 }





}
