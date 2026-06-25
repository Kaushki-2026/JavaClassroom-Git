package com.kaushki.maths;

public class SieveOfEratosthenes {
    static void main() {
        int n=40;
        boolean[] primes = new boolean[n+1];
        sieve(n,primes);

    }
    static void sieve(int n, boolean[] primes){
        for(int i=2;i*i<=n;i++){
           if(!primes[i]){
               for(int j=i*2;j<=n ;j+=i){
                   primes[j] = true;
               }
           }
        }
        for (int i = 2; i <=n ; i++) {
            if(!primes[i]){
                System.out.print(i+" ");
            }

        }
    }
    /*
    Space complexity=O(n)

    Time complexity=O(n/2+n/3+n/5+n/7+....)
                     =O(log(logN))
                     =O(N*logN)
     */

}
