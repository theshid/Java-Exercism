import java.util.Date

class Trade(val id: Int, val symbol: String, val date: Date, val quantity: Int, var initialPrice: Double,
            val timeStamp: Double) {
  private var _price = initialPrice //initialPrice is constructor parameter

  def price = _price //getter method

  def price_=(value: Double)= {
    if (value >= 0) _price = value else _price = 0
  } //setter method

  

  def value():Double = quantity * price

}
