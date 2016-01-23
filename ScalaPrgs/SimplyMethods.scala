object SimplyMethods{
  def callme(){
    var i : Int = 0
    while(i < 10){
      println(i)
      i = i+1
    }

  }
  
 def callmeAgain() {
   callme()
   }

 def main(args: Array[String]){
    callmeAgain()
 }

}
