import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers


class FruitsSuite extends AnyFlatSpec with Matchers  {

  "one, two, three" should "return apple and banana" in {
    assert(Fruits.fruits(List(1, 2)) == List("apple","banana"))
  }
//
//  "three" should "return peach" in {
//    assert(Fruits.fruits(List(3)) == List("peach"))
//  }
//
//  "four" should "return orange" in {
//    assert(Fruits.fruits(List(3)) == List("peach"))
//  }

}
