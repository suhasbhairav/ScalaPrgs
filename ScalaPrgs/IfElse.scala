class Test{

 def validate(x : Int){
  if(x < 100){
   println("Smaller")
  }else{
   println("Larger")

  }

 }

}

object IfElse{

 def main(args: Array[String]){
  (new Test().validate(100))

 }

}
