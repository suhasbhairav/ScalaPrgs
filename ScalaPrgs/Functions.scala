object Functions{
 def fun_1(){
  var i: Int = 1
  while(i < 10){
   println(i)
   i = i + 1
  }
 }
 
 def fun_2(){
   fun_1()
  }

 def main(args: Array[String]){

   fun_2()
 }





}
