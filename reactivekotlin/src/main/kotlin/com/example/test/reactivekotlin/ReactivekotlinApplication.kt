package com.example.test.reactivekotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import java.awt.PageAttributes
import java.time.Duration
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.concurrent.ThreadLocalRandom

@SpringBootApplication
class ReactivekotlinApplication

fun main(args: Array<String>) {
	runApplication<ReactivekotlinApplication>(*args)
}

@RestController
class RestController{

	@GetMapping(value= ["/stock/{symbol}"], produces = [MediaType.TEXT_EVENT_STREAM_VALUE])
	fun prices(@PathVariable symbol : String) : Flux<StockPrices>{
		return Flux.interval(Duration.ofSeconds(1))
				.map { StockPrices(symbol, randomStockPrices(), LocalDateTime.now() )	 }
	}

	private fun randomStockPrices(): Double {
		return ThreadLocalRandom.current().nextDouble(100.0)
	}
}

data class StockPrices(
		val symbol:String,
		val price:Double,
		val time: LocalDateTime
)