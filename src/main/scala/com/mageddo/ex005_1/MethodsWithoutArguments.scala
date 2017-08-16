package com.mageddo.ex005_1

class Complex(real: Double, imaginary: Double ){

	def re = real
	def im = imaginary
}

object MethodsWithoutArguments {

	def main(args: Array[String])  {
		val c = new Complex(1.2, 3.4)
		println(s"imaginary part: ${ c.im }")
	}
}
