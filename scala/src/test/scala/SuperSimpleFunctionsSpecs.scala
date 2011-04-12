/**
 * Created by IntelliJ IDEA.
 * User: Matthew
 * Date: 12/04/11
 * Time: 19:00
 */

import org.specs.Specification

class SuperSimpleFunctionsSpec extends Specification {

  val simpleFunctions = new SuperSimpleFunctions

  "Addition" should {

    "work for positive numbers" in {
      simpleFunctions.addify(2, 3) mustBe 5
    }

    "work for negative numbers" in {
      simpleFunctions.addify(-2, -3) mustBe -5
    }

  }


  "Multiplication" should {

    "work for positive numbers" in {
      simpleFunctions.multiplificate(2, 3) mustBe 6
    }

    "work for negative numbers" in {
      simpleFunctions.multiplificate(-2, -3) mustBe 6
    }

  }

}