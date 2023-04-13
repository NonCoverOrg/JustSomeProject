object Fruits {

  def fruits(list: List[Int]): List[String] = {
    list.map {
      case 1 => "apple"
      case 2 => "banana"
      case 3 => "peach"
      case 4 => "orange"
      case 5 => "grapes"
      case 6 => "apple"
      case 7 => "banana"
      case 8 => "peach"
      case 9 => "orange"
      case 10 => "grapes"
      case _ => "unknown fruit"
    }
  }
}
