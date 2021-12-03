package problems;

//Problem 4
//A palindromic number reads the same both ways.
//The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
//
//Find the largest palindrome made from the product of two 3-digit numbers.

public class Problem4 {


    public Problem4(){
        solve();
    }

    void solve(){
        int highestPalindrome = 0;

        for(int i = 1; i < 1000; i++){
            for(int n = 1; n < 1000; n++){
                if(isPalindrome(i * n)){
                    if(i * n > highestPalindrome){
                        highestPalindrome = i * n;
                    }
                }
            }
        }
        System.out.println("Problem 4 solution: " + highestPalindrome);
    }

    boolean isPalindrome(int number){
        char[] numberArray = String.valueOf(number).toCharArray();
        for(int i = 0; i < numberArray.length; i++){
            if(numberArray[i] != numberArray[numberArray.length - i - 1]){
                return false;
            }
        }
        return true;
    }
}
