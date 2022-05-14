class Factorial {

    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Int]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil, namun bisa di improv lagi tanpa menggunakan temporary value [variable result]
     * untuk mendapatkan performa yang lebih baik
     */
    fun factorialWithLooping(n: Int): Long {
        var result = 1L

        if (n <= 0) return result
        else for (i in result.rangeTo(n)) result *= i
        return result
    }

    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Int]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil, namun jika n mempunyai value yang besar
     * hasil yang akan terjadi adalah error [java.lang.StackOverflowError]
     */
    fun factorialWithRecursive1(n: Int): Long {
        return if (n <= 0) 1L
        else n * factorialWithRecursive1(n - 1)
    }

    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Int]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil, namun jika n mempunyai value yang besar
     * hasil yang akan terjadi adalah error [java.lang.StackOverflowError]
     */
    fun factorialWithRecursive2(n: Int): Long {
        return when (n) {
            0 -> 1L
            else -> n * factorialWithRecursive2(n - 1)
        }
    }

    /**
     * @param [value] adalah nilai yang akan di factorialkan dengan tipe data [Int]
     * @param [tailNumberRecursive] adalah nilai akhir
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil, menggunakan fitur kotlin tail recursive
     * tail adalah terakhir
     * recursive function adalah sebuah function yang akan memanggil dirinya sendiri
     * @param [tailNumberRecursive] adalah nilai akhir dari recursive yaitu 1
     * @param [value] adalah nilai yang akan di berikan, nanti dari value akan mengalikan kebawah
     * @sample tailNumberRecursive = 1
     * @sample value = 4
     * factorialWithTailRecursive(tailNumberRecursive = 1, value = 4)
     * factorialWithTailRecursive(tailNumberRecursive = 4, value = 3)
     * factorialWithTailRecursive(tailNumberRecursive = 12, value = 2)
     * factorialWithTailRecursive(tailNumberRecursive = 24, value = 1)
     * factorialWithTailRecursive(tailNumberRecursive = 24, value = 0)
     * namun jika n mempunyai value yang besar
     * hasil yang akan terjadi adalah error [java.lang.StackOverflowError]
     */
    fun factorialWithTailRecursive(tailNumberRecursive: Long, value: Int): Long {
        return if (value <= 0) tailNumberRecursive
        else factorialWithTailRecursive(tailNumberRecursive = tailNumberRecursive * value, value - 1)
    }


    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Int]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil, namun bisa di improv lagi tanpa menggunakan temporary value [variable result]
     * untuk mendapatkan performa yang lebih baik
     */
    fun factorialWithTransformation(n: Int): Long {
        var result = 1L
        (1.rangeTo(n)).map {
            result *= it
        }
        return result
    }

    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Long]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil menggunakan fitur extension function [Collection.reduce] di kotlin collection
     */
    fun factorialWithReduce(n: Long) = (1.rangeTo(n)).reduce { a, b ->
        a * b
    }

    /**
     * @param n adalah nilai yang akan di factorialkan dengan tipe data [Long]
     * @return [Long] untuk mendapatkan konversi nilai range terbesar
     * Solusi berhasil menggunkan fitur extension function [Collection.fold] di kotlin collection
     */
    fun factorialWithFold(n: Long) = (2..n).fold(1L, Long::times)
}