package collections

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 24),Pair("Luis", 26))
    val namesToAges2 = mapOf(
        "Peter" to 24,
        "Luis" to 26
    )
    println(namesToAges == namesToAges2)
    println(namesToAges.keys)
    println(namesToAges.values)
    println(namesToAges.entries)

    val countryToInhabitants = mutableMapOf(
        "Germany" to 20_000_000,
        "India" to 1000_000_000
    )
    countryToInhabitants.put("USA", 30_000_000)
    countryToInhabitants.putIfAbsent("Germany", 10_000_000)

    println(countryToInhabitants)

    println(countryToInhabitants.contains("USA"))
    println(countryToInhabitants.containsKey("FRANCE"))
    println(countryToInhabitants.containsValue(20_000_000))

    println(countryToInhabitants.get("Germany"))
    println(countryToInhabitants.getOrDefault("France", 0))

    namesToAges.entries.forEach(){
        println("${it.key} is ${it.value} years old.")
    }
}