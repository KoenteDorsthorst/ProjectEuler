package problems;

//Problem 10
//The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
//
//Find the sum of all the primes below two million.

import java.util.ArrayList;

//This solution is not really fast, damn...
public class Problem10 {

    ArrayList<Integer> primeList = new ArrayList<>();


    public Problem10(){
        solve();
    }

    void solve(){
        long primeSum = 2;
        for(int i = 3; i < 2000000; i += 2){
            if(checkIfPrime(i)){
                primeSum += i;
            }
        }

        System.out.println("Problem 10 solution: " + primeSum);
    }


    boolean checkIfPrime(int number){
        for (Integer integer : primeList) {
            if (number % integer == 0) {
                return false;
            }
        }
        primeList.add(number);
        return true;
    }
}
