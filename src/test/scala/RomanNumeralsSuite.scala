import org.junit.Assert.assertTrue
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.junit.Test

class RomanNumeralsSuite extends AnyFlatSpec with Matchers {
  @Test
  def testOneIsPositive {
    assertTrue(1 > 0)
  }

  "fromRoman" should "return correct number" in {
    val rom = new RomanNumerals
    assert(rom.fromRoman("MDCLXVI") == 1666)
  }

  "toRoman" should "return correct number" in {
    val rom = new RomanNumerals
    assert(rom.toRoman(1666) == "MDCLXVI")
  }

}