package pesterhazy.com.scalaf

object ChapterTwo {
  /** Calaculates fibunacci numbers using naive recursion
    *
    *  Will blow the stack for high numbers
    */

  def fib2(n: Int): Int = {
    if (n == 0) 0
    else if (n == 1) 1
    else fib2(n-2) + fib2(n-1)
  }

  /** Calculates fibunacci numbers using tail recursion.
    *
    * Should not run out of stack space
    */

  def fib(n: Int): Int = {
    @annotation.tailrec
    def go(count: Int, m1: Int, m2: Int): Int = {
      val v = m1 + m2
      if (count == n) v
      else go(count + 1, m2, m1 + m2)
    }

    if (n == 0) 0
    else if (n == 1) 1
    else go(2, fib(0), fib(1))
  }

  // def main(args: Array[String]) {
  //   println("Hello World!!!")
  // }
}
