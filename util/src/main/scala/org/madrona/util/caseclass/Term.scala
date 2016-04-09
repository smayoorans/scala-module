package org.madrona.util.caseclass

abstract class Term {

}


case class Var(name: String) extends Term

case class Fun(arg: String, body: Term) extends Term

case class App(f: Term, v: Term) extends Term



