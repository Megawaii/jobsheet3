package coding.gamejanken

import kotlin.random.Random

object Game {
    private val rules = mapOf(
        "ROCK-SCISSORS" to true,
        "ROCK-PAPER" to false,
        "SCISSORS-PAPER" to true,
        "SCISSORS-ROCK" to false,
        "PAPER-ROCK" to true,
        "PAPER-SCISSORS" to  false,
    )

    private val option = listOf("ROCK", "SCISSORS", "PAPER")

    private val optionDrawable = mapOf(
        "ROCK" to R.drawable.Rock,
        "SCISSORS" to R.drawable.Scissor,
        "PAPER" to R.drawable.Papper,
    )

    fun pickRandomOption(): String = option[Random.nextInt(from = 0, until = 3)]
    fun pickDrawable(option: String): int = optionDrawable[option]!!
    fun isDraw(from: String, to: String): Boolean = from == to
    fun iswin(from: String, to: String): Boolean = rules["$from-$to"]!!
}