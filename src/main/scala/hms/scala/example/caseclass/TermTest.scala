package hms.scala.example.caseclass

object TermTest {

  def main(args: Array[String]) {

  }

  def printTerm(term: Term): Unit ={
    term match {
      case Var(n) => print(n)
      case Fun(x, b) =>
        print(x)
        printTerm(b)
      case  App(a, c) =>
        printTerm(a)
        printTerm(c)
    }
  }

}
