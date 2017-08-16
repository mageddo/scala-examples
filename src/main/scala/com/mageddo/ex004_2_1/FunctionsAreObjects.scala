package com.mageddo.ex004_2_1

import java.util.Date

object FunctionsAreObjects {

	def main(Args : Array[String]) {
		oncePerSecond((now: Date, counter) => {
			println(s"time flies like an arrow... now=${now}, x=${counter}")
		})
	}

	def oncePerSecond(callback: (Date, Int) => Unit)  {
		// val is constant, var is a normal variable, to initialize with no value use _ (like golang)
		var counter: Int = 0
		while (true) {
			counter += 1
			callback(new Date(), counter)
			Thread sleep 1000
		}
	}

}
