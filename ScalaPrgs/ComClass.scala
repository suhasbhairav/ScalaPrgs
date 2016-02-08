class Complex(iVal: Int, jVal: Int, dVal: Double, fVal: Double){

   var i : Int = iVal;
   var j: Int = jVal;
   var d: Double = dVal;
   var f: Double = fVal;


   def cal(di: Int, dj: Int, dd: Double, df: Double){
     println(di+i)
     println(dj+j)
     println(dd+d)
     println(df+f)
   }

}


object ComClass{


   def main(args: Array[String]){
   println("Program begins...")

   val complex = new Complex(100,200,2.515,3.11244)
   complex.cal(400,500,3654.1542,1.4685)
   println("Program ends....")
   }

}
