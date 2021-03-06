package com.mageddo.ex006;

abstract class Tree
case class Sum(l: Tree, r: Tree) extends Tree
case class Var(n: String) extends Tree
case class Const(v: Int) extends Tree



object CaseClassesAndPatternMatching {

	type Environment = String => Int

	def eval(t: Tree, env: Environment) : Int = t match {
		case Sum(l, r) => eval(l, env) + eval(r, env)
		case Var(n) => env(n)
		case Const(v) => v
	}

	def derive(t: Tree, v: String): Tree = t match {
		case Sum(l, r) => Sum(derive(l, v), derive(r, v))
		case Var(n) if v == n => Const(1)
		case _ => Const(0)

	}

	def main(args: Array[String]): Unit ={
		val exp : Tree = Sum(Sum(Var("x"), Var("x")), Sum(Const(7), Var("y")))
		val env : Environment = { case "x" => 5 case "y" => 7}

		println(s"Expression ${exp}")
		println(s"Evaluation with x=5, y=7: ${eval(exp, env)}")
		println(s"Derivative relative to x:\n ${derive(exp, "x")}")
		println(s"Derivative relative to y:\n ${derive(exp, "y")}")
	}
}
