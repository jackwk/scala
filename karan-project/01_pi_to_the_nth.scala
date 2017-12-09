/*
https://github.com/karan/Projects
Find PI to the Nth Digit - Enter a number and have the program generate PI up to that many decimal places. Keep a limit to how far the program will go.

Sloppy - crashes when input is different than int.
*/

import math.Pi
import math.BigDecimal

object PiToTheNth {
  def main(args: Array[String]) {
    println("Enter number (up to 15)")
    val input = readInt()
    println("You entered " + input)
    if (input <= 15) println("Pi is " + BigDecimal(Pi).setScale(input, BigDecimal.RoundingMode.HALF_UP).toDouble) else println("Enter lower number")
    }
  }
