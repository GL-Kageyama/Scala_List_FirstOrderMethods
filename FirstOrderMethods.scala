object FirstOrderMethods extends App {

    val abcde = List("a", "b", "c", "d", "e") // List(a, b, c, d, e)
    val oneToFive = List(1, 2, 3, 4, 5) // List(1, 2, 3, 4, 5)
    val zeroArray = new Array[Int](10) // Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)

    // :::
    val con = List(1, 2) ::: List(3, 4, 5)
    println(con) // List(1, 2, 3, 4, 5)

    // length
    val len = List(1, 2, 3).length
    println(len) // 3

    // last
    println(abcde.last) // e

    // init
    println(abcde.init) // List(a, b, c, d)

    // reverse
    println(abcde.reverse) // List(e, d, c, b, a)

    // drop
    println(abcde drop 2) // List(c, d, e)

    // take
    println(abcde take 2) // List(a, b)

    // splitAt
    println(abcde splitAt 2) // (List(a, b),List(c, d, e))

    // indices
    println(abcde.indices) // Range 0 until 5

    // flatten
    val flat = List(List(1, 2), List(3), List(), List(4, 5)).flatten
    println(flat) // List(1, 2, 3, 4, 5)

    // zip
    val ziped = oneToFive zip abcde
    println(ziped) // List((1,a), (2,b), (3,c), (4,d), (5,e))

    // unzip
    val unziped = ziped.unzip
    println(unziped) // (List(1, 2, 3, 4, 5),List(a, b, c, d, e))

    // toString
    println(abcde.toString) // List(a, b, c, d, e)

    // mkString
    println(abcde.mkString) // abcde

    // toArray
    val arr = zeroArray.toArray
    arr.foreach(print) // 0000000000
    println()

    // copyToArray
    oneToFive.copyToArray(zeroArray)
    zeroArray.foreach(print _) // 1234500000
    println()

    // iterator
    val ite = abcde.iterator
    println(ite.next()) // a
    println(ite.next()) // b
    println(ite.next()) // c
    println(ite.next()) // d
    println(ite.next()) // e
}


// ============================================
//              Output Sample
// ============================================
// $ scalac FirstOrderMethods.scala 
// $ scala FirstOrderMethods
// List(1, 2, 3, 4, 5)
// 3
// e
// List(a, b, c, d)
// List(e, d, c, b, a)
// List(c, d, e)
// List(a, b)
// (List(a, b),List(c, d, e))
// Range 0 until 5
// List(1, 2, 3, 4, 5)
// List((1,a), (2,b), (3,c), (4,d), (5,e))
// (List(1, 2, 3, 4, 5),List(a, b, c, d, e))
// List(a, b, c, d, e)
// abcde
// 0000000000
// 1234500000
// a
// b
// c
// d
// e