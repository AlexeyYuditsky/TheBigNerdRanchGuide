package NyetHack

fun main() {

    val name = "Madrigal"
    var healthPoints = 99
    val isBlessed = true
    val isImmortal = false

    val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    println(auraColor)

    // val status = formatHealthStatus(healthPoints, isBlessed)

    // printPlayerStatus(auraColor = auraColor, name = name, isBlessed = isBlessed, healthStatus = status)

    // castFireball()

}

/*private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              healthStatus: String) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "Yes" else "No"}) ")
    println("$name $healthStatus")
}*/

private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal: Boolean) = if (isBlessed && healthPoints > 50 || isImmortal) "GREEN" else "NONE"


/*private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
    100 -> "is in excellent condition!"
    in 90..99 -> "has a few scratches!"
    in 75..89 -> if (isBlessed) "has some minor wounds but is healing quite quickly!" else "has some minor wounds!"
    in 15..74 -> "looks pretty hurt!"
    else -> "is in awful condition!"
}

private fun castFireball(numFireballs: Int = 2) = println("A glass of Fireball springs into existence (x$numFireballs)")*/
