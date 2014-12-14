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

  def isSorted[A](a: Array[A], lessThanOrEqual: (A, A) => Boolean): Boolean = {
    @annotation.tailrec
    def go(idx: Int): Boolean = {
      if (idx >= a.length) true
      else if (idx == 0)
        go(idx + 1)
      else if (lessThanOrEqual(a(idx-1), a(idx)))
        go(idx + 1)
      else false
    }
    go(0)
  }

  // def main(args: Array[String]) {
  //   println("Hello World!!!")
  // }
}
