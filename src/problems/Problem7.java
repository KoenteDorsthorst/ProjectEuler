package problems;

//Problem 7
//By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
//
//What is the 10 001st prime number?

import java.util.ArrayList;

public class Problem7 {


    ArrayList<Integer> primeList = new ArrayList<Integer>();

    public Problem7(){
        solve();
    }

    void solve(){
        //primeCounter starts at 1 because number 2 is included
        int primeCounter = 1;
        int prime10001;
        //Primes are never even (except 2) so steps of two are taken to keep values odd
        for(int i = 3; true; i+=2){
            if(checkIfPrime(i)){
                primeCounter++;
                if(primeCounter == 10001){
                    prime10001 = i;
                    break;
                }
            }
        }

        System.out.println("Problem 7 solution: " + prime10001);
    }

    boolean checkIfPrime(int number){
        for (int i = 0; i < primeList.size(); i++) {
            if(number % primeList.get(i) == 0){
                return false;
            }
        }
        primeList.add(number);
        return true;
    }

}
