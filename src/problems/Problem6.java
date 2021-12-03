package problems;

//Problem 6
//The sum of the squares of the first ten natural numbers is, 1^2 + 2^2 + ... + 10^2 = 385
//
//The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10) ^2 = 55^2 = 3025
//
//Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
//3025 - 385 = 2640
//
//Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

public class Problem6 {

    public Problem6(){
        solve();
    }

    void solve(){
        //Variables have bad names because I think its funny
        int sumSquare = 0;
        int squareSum = 0;
        for(int i = 1; i <= 100; i++){
            sumSquare += Math.pow(i, 2);
        }
        for(int i = 1; i <= 100; i++){
            squareSum += i;
        }
        squareSum = (int) Math.pow(squareSum, 2);
        int solution = squareSum - sumSquare;
        System.out.println("Problem 6 solution: " + solution);
    }

}
