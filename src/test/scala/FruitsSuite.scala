import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers


class FruitsSuite extends AnyFlatSpec with Matchers  {

  "one, two, three" should "return apple" in {
    assert(Fruits.fruits(List(1, 2, 3)) == List("apple","banana", "peach"))
  }

}
