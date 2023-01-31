class RomanNumerals {

  def fromRoman(roman: String): Int = {
    try {
      val voc: Map[Char, Int] = Map('M' -> 1000, 'D' -> 500, 'C' -> 100, 'L' -> 50, 'X' -> 10, 'V' -> 5, 'I' -> 1)

      roman.map(voc).foldLeft(0, 0) {
        case ((sum, last), curr) => (sum + curr + (if (last < curr) -2 * last else 0), curr)
      }._1
    }
  }

  def toRoman(number: Int): String = {
    val numeralsFor100 = List("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
    val numbersFor10 = List("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
    val numbersFor1 = List("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")

    "M" * (number / 1000) + {
      if (number % 1000 > 99) numeralsFor100(number % 1000 / 100 - 1) else ""
    } + {
      if (number % 100 > 9) numbersFor10(number % 100 / 10 - 1) else ""
    } + {
      if (number % 10 > 0) numbersFor1(number % 10 - 1) else ""
    }
  }

}
