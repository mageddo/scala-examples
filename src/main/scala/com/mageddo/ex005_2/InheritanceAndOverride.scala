package com.mageddo.ex005_2

class Complex(real: Double, imaginary: Double ){

	def re = real
	def im = imaginary

	override def toString: String = {
		return "" + re + (if (im < 0) "" else "+") + im + "i"
	}
}

object MethodsWithoutArguments {

	def main(args: Array[String])  {
		val c = new Complex(1.2, 3.4)
		println(s"imaginary part: ${ c }")
	}
}
