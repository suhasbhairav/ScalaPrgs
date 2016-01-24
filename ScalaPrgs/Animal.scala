class Lion (xName : String, iNumbers : Int){
 
 var sName : String = xName;
 var iNos : Int = iNumbers;

 def printInitialValues(){
  println("Name:"+sName)
  println("iNos:"+iNumbers)

 }

 def InitialEndangeredSpeciesNumber(xInit : Int){
  xInit match {

  case 0 => println("Extinct...")
  case 100 => println("Super endangered...")
  case 200 => println("Still endangered...")
  case 300 => println("Normal")

 }


 }

 def justPrint(){
  println(iNos * 1000)
  println("end...");

 }


}


object Animal{

 def main(args: Array[String]){
  println("Wow..Animal Class...")
  val lion = new Lion("Indian Lion", 200)
  lion.printInitialValues()
  lion.InitialEndangeredSpeciesNumber(200)
  lion.justPrint()


 }


}
