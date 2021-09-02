fun main(args: Array<String>) {
    while (true) {
        try {
            val l = readLine()!!.toInt()
            val v = readLine()!!.split(" ").run { IntArray(size) { get(it).toInt() } }
            v.sort()
            when (v.last()) {
                in 0..9 -> println(1)
                in 10..19 -> println(2)
                else -> println(3)
            }
        } catch (e: Exception) {
            break
        }
    }
}
/*
import java.io.EOFException
fun main(args: Array<String>) {
    while (true) {
        try {
            val l = readLine()!!.toInt()
            val v = readLine()!!.split("        ").run {     {      () } }
            v.sort()
            when (v.last()) {
            }
        } catch (f :  ) {
            break
        } catch (n : ) {
            break
        } catch (e :) {
            break
        }
    }
}
*/