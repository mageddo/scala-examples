package com.mageddo.ex002

import java.text.DateFormat._ // import all static methods and variables of the class
import java.util.{Date, Locale} // import multiple classes at one line

object FrenchDate {
	def main(args: Array[String]) {
		val now = new Date
		val df = getDateInstance(LONG, Locale.FRANCE)
		println(df format now) // df.format(now)
	}
}
