package specialclasses

fun main() {

    println(LanguageList.geLanguageNameList())
}

data class Language(val name: String, val code: String)

object LanguageList {

    private fun getLanguageList() = listOf(Language("English", "en"), Language("Portuguese", "po"))

    fun geLanguageNameList() = getLanguageList().map {
        it.hashCode()
    }

}