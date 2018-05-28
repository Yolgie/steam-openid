package at.cnoize.playground.steamopenid

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SteamOpenidApplication

fun main(args: Array<String>) {
    runApplication<SteamOpenidApplication>(*args)
}
