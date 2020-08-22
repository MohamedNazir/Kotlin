package mykotlin

import java.math.BigInteger

fun main() {
    print(fib(50, BigInteger("1"), BigInteger("0")))
  //  print(fib(100000, BigInteger("1"), BigInteger("0"))) // this will throw stack over flow exception, hence add tail recursive to the function.
    print(fib(100000, BigInteger("1"), BigInteger("0")))
}

tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger {
    return if (n==0) b else fib(n-1, a+b, a)
}