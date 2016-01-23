object FunctionObjects{
  
   def justMe( callback: () => Unit){
     while(true){
       callback();
       Thread sleep 1000
     }

   }
   def justAnotherMe(){
    println("Just Another Me...")

   }

 def main(args: Array[String]){
   justMe(justAnotherMe)

  }




}
