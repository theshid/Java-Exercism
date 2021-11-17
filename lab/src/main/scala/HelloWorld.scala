import java.text.SimpleDateFormat
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.Calendar

object HelloWorld {

  def main(args: Array[String]): Unit = {
    //println("Hello Scala!")
    println((new java.io.File(".")).listFiles
      .filter(i => !i.getCanonicalPath.startsWith(".")).mkString("Array(", ", ", ")"))
    //convertToDate("01/02/15")
  }


  def convertToDate( strings:String): Unit ={
  val dateArray = strings.split("/");

    var result = "";
    for (i <- 0 until dateArray.length){
      i match {
        case 0 => result =  formatDay(dateArray(i))
        case 1 => result = result+formatMont(dateArray(i))
        case 2 => result = result+formatYear(dateArray(i))
      }
    };
    println(result)

  }

  def formatDay(value:String):String ={
  value match {
    case "01" => "1st "
    case "02" => "2nd "
    case "03" => "3rd "
    case "21" | "31" => value+ "st "
    case "22" => value +"nd "
    case "23"=> value +"rd "
    case _ => value +"th "
  }
  }

 def formatMont(value:String):String = {
   value match {
     case "01" => "January "
     case "02" => "February "
     case "03" => "March "
     case "04" => "April "
     case "05" => "May "
     case "06" => "June "
     case "07" => "July "
     case "08" => "August "
     case "09" => "September "
     case "10" => "October "
     case "11" => "November "
     case "12" => "December "
   }
 }

  def formatYear(value:String):String = "20"+value

}
