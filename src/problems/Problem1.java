package problems;


//Problem 1
//
//If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
//The sum of these multiples is 23.
//
//Find the sum of all the multiples of 3 or 5 below 1000.

public class Problem1 {
    int maxNumber = 1000;



    public void solve() {
        int sum = 0;
        for (int i = 1; i < maxNumber; i++) {
            if(i % 3 == 0|| i % 5 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
