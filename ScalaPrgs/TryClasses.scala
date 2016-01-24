object TryClasses{


  def main(args: Array[String]){
  val pt = new PrintNumbers(10, 20)
  pt.move()
  pt.simplyMove(20,40)


  }


}


class PrintNumbers(iX : Int, iY : Int){
 var x : Int = iX;
 var y : Int = iY;

 def move(){
  println(x)
  println(y)

 }
 
 def simplyMove(dx : Int, dy : Int){
  x = x + dx;
  y = y + dy;
  
 println(x + y)


 }





}

