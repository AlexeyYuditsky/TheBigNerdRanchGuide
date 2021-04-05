package TheBigNerdRanchGuide

import kotlin.Int.Companion.MAX_VALUE

fun main() {

    val name = "Madrigal"
    var healthPoints = 99
    val isBlessed = true
    val isImmortal = false

    /*val auraColor = auraColor(isBlessed, healthPoints, isImmortal)

    val status = formatHealthStatus(healthPoints, isBlessed)

    printPlayerStatus(auraColor = auraColor, name = name, isBlessed = isBlessed, healthStatus = status)*/

    castFireball(10)

}

/*private fun printPlayerStatus(auraColor: String,
                              isBlessed: Boolean,
                              name: String,
                              healthStatus: String) {
    println("(Aura: $auraColor) (Blessed: ${if (isBlessed) "Yes" else "No"}) ")
    println("$name $healthStatus")
}

private fun auraColor(isBlessed: Boolean,
                      healthPoints: Int,
                      isImmortal: Boolean): String {
    val auraVisible = isBlessed && healthPoints > 50 || isImmortal
    return if (auraVisible) "GREEN" else "NONE"
}

private fun formatHealthStatus(healthPoints: Int, isBlessed: Boolean) = when (healthPoints) {
    100 -> "is in excellent condition!"
    in 90..99 -> "has a few scratches!"
    in 75..89 -> if (isBlessed) "has some minor wounds but is healing quite quickly!" else "has some minor wounds!"
    in 15..74 -> "looks pretty hurt!"
    else -> "is in awful condition!"
}*/

private fun castFireball(numFireballs: Int = 2) {
    val result = when (numFireballs) {
        1 -> 5
        2 -> 10
        3 -> 15
        4 -> 20
        5 -> 25
        6 -> 30
        7 -> 35
        8 -> 40
        9 -> 45
        in 10..MAX_VALUE -> 50
        else -> 0
    }

    val newResult = when (result) {
        in 1..10 -> "Tipsy"
        in 11..20 -> "Sloshed"
        in 21..30 -> "Soused"
        in 31..40 -> "Stewed"
        in 41..50 -> "t0aSt3d"
        else -> "Unknown"
    }

    println("Stupefying result: $newResult")
}
