object Anonymous{

 def callingMe( callback: () => Unit){
  callback();
 }

 def main(args: Array[String]){

  callingMe( () => println("Anonymous call?...."))

 }




}
