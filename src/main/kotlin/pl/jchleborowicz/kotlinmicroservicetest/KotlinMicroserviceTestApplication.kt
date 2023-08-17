package pl.jchleborowicz.kotlinmicroservicetest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinMicroserviceTestApplication

fun main(args: Array<String>) {
    runApplication<KotlinMicroserviceTestApplication>(*args)
}
