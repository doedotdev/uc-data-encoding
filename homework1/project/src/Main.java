
import java.io.*;

public class Main extends Numbers {

    public static void main(String[] args) {
        System.out.println("Data Encoding: Homework 1");

        Numbers other = new Numbers();

        System.out.println("Question 1");
        System.out.println(other.gcd(1160718174, 316258250)); // 1078

        System.out.println("Question 2");
        System.out.println("1989: " + other.myDivisors(1989));
        System.out.println("2017: " + other.myDivisors(2017));

        System.out.println("Question 3");
        int count = 0;
        for (int i = 2000; i < 3001; i++) {
            if (other.isPrime(i)) {
                count++;
            }
        }
        System.out.println("Primes: " + count);

        System.out.println("Question 4 - eulers totient");
        System.out.println("255: " + other.eulerTotient(255));
        System.out.println("256: " + other.eulerTotient(256));
        System.out.println("257: " + other.eulerTotient(257));

        System.out.println("Question 5 - MODULO 8 TABLES");
        System.out.println("Addition");
        other.addTable(8);

        System.out.println("Multiplication");
        other.multTable(8);

        System.out.println("Powers");
        other.powTable(8);

        System.out.println("Question 6 - Primitive Roots");
        for (int i = 0; i < 42; i++) {
            System.out.print(i + ": ");
            other.primitiveRoots(i);
            System.out.println();
        }
        System.out.println("Question 7 - Primitive Roots + log table");
        System.out.println("13 as chosen primitive root of 19");
        System.out.println("list of all discrete logs from 1 -18 using base 13");

        other.discreteLog(19, 13);
    }
}
