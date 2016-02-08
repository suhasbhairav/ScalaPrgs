class TestClass{

    def method1(){

      println("Empty method....")
    }

    def method2(xc: Int, yc: Int){

     println("xc:"+xc+";yc:"+yc)
     println("xc*yc:"+xc*yc)
    }

}




object NewClass{

    def main(args: Array[String]){
    val tc = new TestClass()
    tc.method1()
    tc.method2(100,200)
    }





}
