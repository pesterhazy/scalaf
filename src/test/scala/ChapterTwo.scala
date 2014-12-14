package pesterhazy.com.scalaf

import org.scalatest.FunSpec

class ChapterTwoSpec extends FunSpec {
  describe("Fibunacci") {
    it("should equal 0"){
      assert(ChapterTwo.fib(0) == 0)
    }
    it("should equal 1"){
      assert(ChapterTwo.fib(1) == 1)
    }
    it("should equal 5"){
      assert(ChapterTwo.fib(5) == 5)
    }
    it("should equal 34"){
      assert(ChapterTwo.fib(9) == 34)
    }
  }
}

