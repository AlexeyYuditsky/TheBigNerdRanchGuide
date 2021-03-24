package TheBigNerdRanchGuide

const val MAX_EXPERIENCE: Int = 5000

fun main() {

    val playerName = "Estragon"
    val hasSteed = false
    val experiencePoints = 5
    val tavernName = "Unicorn horn"
    val innkeeperName = "Ivan"
    val numberCoins = 50
    val drinksMenu = mapOf("wine" to 30, "beer" to 25, "honey" to 15)

    println("Player name: $playerName\n" +
            "The presence of a horse: ${if (hasSteed) "there is" else "there is none"}\n" +
            "Experience points: $experiencePoints\n" +
            "Name of the tavern: $tavernName\n" +
            "Innkeeper's name: $innkeeperName\n" +
            "Number of coins: $numberCoins\n")

    println("Drinks menu:")
    for ((key, value) in drinksMenu)
        println("Drink: $key, Cost: $value")

    println("\nReverse name: ${playerName.reversed()}")

}