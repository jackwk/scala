/*
https://github.com/karan/Projects
Find e to the Nth Digit - Just like the previous problem, but with e instead of PI. Enter a number and have the program generate e up to that many decimal places. Keep a limit to how far the program will go.

String input will act as 0
*/

import math.BigDecimal
import math.E
import scala.util

object eToTheNth {
  def main(args: Array[String]) {
    println("Enter a number (up to 14): ")
    val input = scala.io.StdIn.readLine()
    val inputInt = util.Try(input.toInt).getOrElse(0)

    if (inputInt > 14) {
      println("Please enter a number lower than 14")
    } else if (inputInt == 0){
      println("You entered: " + inputInt + " please enter a number higher than 0")
    } else {
      println("e is " + BigDecimal(E).setScale(inputInt, BigDecimal.RoundingMode.HALF_UP).toDouble)
     }
  }
}
