package com.mageddo.ex004_2

object FunctionsAreObjects {

	def main(Args : Array[String]) {
		oncePerSecond(timesFlies)
	}

	def oncePerSecond(callback: () => Unit)  {
		while (true) {callback(); Thread sleep 1000 }
	}

	def timesFlies() {
		println("time flies like an arrow...")
	}
}
