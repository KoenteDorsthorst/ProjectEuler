package problems;

//Problem 5
//2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
//
//What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

public class Problem5 {

    public Problem5(){
        solve();
    }

    public void solve(){

        int smallestNumber = 0;

        for(int i = 1; true; i++){
            if(isDivisible(i)){
                smallestNumber = i;
                break;
            }
        }

        System.out.println("Problem 5 solution: " + smallestNumber);
    }

    boolean isDivisible(int number){
        for(int i = 1; i <= 20; i++){
            if(number % i != 0){
                return false;
            }
        }
        return true;
    }
}
