package hashmap

fun uniqueOccurrences(arr: IntArray): Boolean {
    val hashMap = HashMap<Int, Int>()
    arr.forEach { item ->
        hashMap[item] = (hashMap[item] ?: 0 ) + 1
    }
    return hashMap.size == hashMap.values.toSet().size;
}