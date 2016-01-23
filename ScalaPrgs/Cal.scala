object Cal{

    def main(args: Array[String]){
        var doubleVar : Double = 200.34;
        var anotherDouble : Double = 421.32;
        
        var a_string : String = "Suhas";
        var b_string : String = "Bhairav";

        println(a_string * 3);
        println(b_string + a_string);


       println((b_string+"\n") * 10 );

       a_string = "SS";
       println(a_string);
       
       val testVal : Int = 100;
       println(testVal)

       val (var1 : Int, var2: Int) = Pair(200, 300);
       val (var3 : Int, var4: Int) = Pair(400, 600);
       println(var1 * var4);
       println(var2 * var3);

      val (var10 : Int, var20: String) = Pair(10, "Suhas")      
    }




}
