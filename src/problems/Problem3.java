package problems;

//Problem 3
//The prime factors of 13195 are 5, 7, 13 and 29.
//
//What is the largest prime factor of the number 600851475143 ?

public class Problem3 {

    public Problem3(){
        solve();
    }

    void solve() {
        long factorNumber = 600851475143L;
        long biggestFactor = 0;
        long[] factors = new long[2];

        for (long i = 2; i * i < factorNumber; i++) {
            if (factorNumber % i == 0) {
                if(checkIfPrime(i)){
                    if(i > biggestFactor){
                        biggestFactor = i;
                    }
                }
                if(checkIfPrime(factorNumber / i)){
                    if(factorNumber/i > biggestFactor){
                        biggestFactor = factorNumber/i;
                    }
                }

            }
        }
        System.out.println("Problem 3 solution: " + biggestFactor);
    }

    boolean checkIfPrime(long number){
        for (long i = 2; i < number; i++) {
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }
}
