// Numbers.java CS5125/6025 2017 Cheng
// Various functions for Chapter 2 number theory concepts

import java.io.*;
import java.util.*;

public class Numbers{

    boolean divides(int a, int b){ return b % a == 0; }

    void divisors(int n){
        for (int i = 1; i <= n; i++) if (divides(i, n)) System.out.println(i);
    }

    String myDivisors(int a){
        if(a == 0){

        }

        StringBuilder my_str = new StringBuilder();
        my_str.append("1, ");
        if (a%2 == 0){
            my_str.append("2, ");
            for (int i = 3; i < (a/2)+1 ; i++){
                if(a%i == 0){
                    my_str.append(Integer.toString(i) + ", ");
                }
            }
        }
        else{
            // is odd

            for (int i = 3; i < (a/2)+1 ; i=i+2){
                if(a%i == 0){
                    my_str.append(Integer.toString(i) + ", ");
                }
            }


        }

        my_str.append(Integer.toString(a) + ";");


        return my_str.toString();
    }



    void listPrimes(){
        for (int i = 2; i < 2000; i++) if (isPrime(i)) System.out.println(i);
    }

    int eulerTotient(int a){
        int count = 0;
        for (int i = 1; i <= a; i ++){
            if (gcd(a, i) == 1){
                count++;
            }
        }
        return count;
    }

    void addTable(int mod){
        System.out.print("+");
        for (int i =0; i < mod; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        for(int i = 0 ; i < mod; i++){
            System.out.print(i); // prints left table index
            for(int j = 0 ; j < mod; j++){
                System.out.print(" " + ((i+j)%mod));

            }System.out.println();
        }
        System.out.println();
    }

    void multTable(int mod){
        System.out.print("*");
        for (int i =0; i < mod; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        for(int i = 0 ; i < mod; i++){
            System.out.print(i); // prints left table index
            for(int j = 0 ; j < mod; j++){
                System.out.print(" " + ((i*j)%mod));

            }System.out.println();
        }
        System.out.println();
    }

    void powTable(int mod){
        System.out.print("^");
        for (int i =2; i < mod; i++){
            System.out.print(" " + i);
        }
        System.out.println();
        for(int i = 1 ; i < mod; i++){
            int power = i;
            System.out.print(i); // prints left table index
            for(int j = 2 ; j < mod; j++){
                power = (power * i) % mod;
                System.out.print(" " + power);

            }System.out.println();
        }
        System.out.println();
    }


    int gcd(int a, int b){
        if(b == 0){
            return a; // when b is zero, a will be gcd
        }
        return gcd(b, a%b);

    }

    boolean relativelyPrime(int a, int b){ return gcd(a, b) == 1; }

    int order(int a, int modulus){
        int m = 1;
        int power = a;
        while (m < modulus && power > 1){ power = (power * a) % modulus; m++; }
        if (m < modulus) return m;
        return -1;
    }

    boolean isPrime(int num)
    {
        if (num < 2) // numbers less than 2 are a special case
            return false;
        boolean checkPrime = true; // change hxere
        double limit = Math.sqrt(num);
        for (int i = 2; i <= limit; i++)
        {
            if (num%i == 0)
            {
                checkPrime = false;
                break;
            }
        }
        return checkPrime;
    }


    int totient(int n){
        int relativelyPrimeNumbers = 1;
        for (int i = 2; i < n; i++) if (relativelyPrime(n, i)) relativelyPrimeNumbers++;
        return relativelyPrimeNumbers;
    }

    int getDiscreteLog(int x, int mod){
        for (int i = 0; i <= mod; i ++){
return 0;
        }

        return 0;
    }

    void primitiveRoots(int modulus){
        int phi = totient(modulus);
        for (int a = 1; a < modulus; a++) if (order(a, modulus) == phi)
            System.out.print(a + ", ");
    }

    void additionTable(int modulus){
        System.out.print("+");
        for (int i = 0; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 0; i < modulus; i++){
            System.out.print(i);
            for (int j = 0; j < modulus; j++) System.out.print(" " + ((i + j) % modulus));
            System.out.println();
        }
        System.out.println();
    }

    void multiplicationTable(int modulus){
        System.out.print("x");
        for (int i = 0; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 0; i < modulus; i++){
            System.out.print(i);
            for (int j = 0; j < modulus; j++) System.out.print(" " + ((i * j) % modulus));
            System.out.println();
        }
        System.out.println();
    }

    void powerTable(int modulus){
        System.out.print("^");
        for (int i = 2; i < modulus; i++) System.out.print(" " + i);
        System.out.println();
        for (int i = 1; i < modulus; i++){
            int power = i;
            System.out.print(i);
            for (int j = 2; j < modulus; j++){
                power = (power * i) % modulus;
                System.out.print(" " + power);
            }
            System.out.println();
        }
        System.out.println();
    }

    void discreteLog(int modulus, int base){
        int[] logs = new int[modulus];
        int power = base;
        logs[base] = 1;
        for (int i = 2; i < modulus; i++){
            power = (power * base) % modulus;
            logs[power] = i;
        }
        for (int i = 1; i < modulus; i++)
            System.out.println(i + " " + logs[i]);
    }

    public static void main(String[] args){
        Numbers numbers = new Numbers();
        numbers.additionTable(Integer.parseInt(args[0]));
        numbers.multiplicationTable(Integer.parseInt(args[0]));
        numbers.powerTable(Integer.parseInt(args[0]));
    }
}