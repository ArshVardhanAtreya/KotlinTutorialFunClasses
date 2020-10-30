package collections

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * A map is a collection of key/value pairs,
 * where each key is unique and is used to retrieve the corresponding value.
 * For creating maps, there are functions mapOf() and mutableMapOf().
 * Using the to infix function makes initialization less noisy.
 * A read-only view of a mutable map can be obtained by casting it to Map.
 * */

const val POINTS_X_PASS: Int = 15
val EZPassAccounts: MutableMap<Int, Int> =
    mutableMapOf(1 to 100, 2 to 100, 3 to 100)   // Creates a mutable Map.
val EZPassReport: Map<Int, Int> =
    EZPassAccounts                                        // Creates a read-only view of the Map.

fun updatePointsCredit(accountId: Int) {
    if (EZPassAccounts.containsKey(accountId)) {                                        // Checks if the Map's key exists.
        println("Updating $accountId...")
        EZPassAccounts[accountId] =
            EZPassAccounts.getValue(accountId) + POINTS_X_PASS  // Reads the corresponding value and increments it with a constant value.
    } else {
        println("Error: Trying to update a non-existing account (id: $accountId)")
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun accountsReport() {
    println("EZ-Pass report:")
    EZPassReport.forEach {                                                              // Iterates immutable Map and prints key/value pairs.
            (k, v) ->
        println("ID $k: credit $v")
    }
}

@RequiresApi(Build.VERSION_CODES.N)
fun main() {
    accountsReport()                                                                    // Reads the account points balance, before updates.
    updatePointsCredit(1)                                                    // Updates an existing account two times.
    updatePointsCredit(1)
    updatePointsCredit(5)                                                    // Tries to update a non-existing account: prints an error message.
    accountsReport()                                                                    // Reads the account points balance, after updates.
}










