object Fruits {

  def fruits(list: List[Int]): List[String] = {
    list.map {
      case 1 => "apple"
      case 2 => "banana"
      case 3 => "peach"
      case 4 => "orange"
      case 5 => "grapes"
      case 6 => "orange"
      case 7 => "grapes"
      case 8 => "grapes"
      case 9 => "grapes"
      case _ => "unknown fruit"
    }
  }
}
