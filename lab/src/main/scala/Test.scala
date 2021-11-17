import HelloWorld.convertToDate

import java.util.Date

object Test extends App {

val trade = new Trade(12,"FGT",new Date("11/08/2020"),7,78.8,987)
println(trade)
  println(trade.value())

}
