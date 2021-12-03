package problems;

//Problem 2
//Each new term in the Fibonacci sequence is generated by adding the previous two terms.
//By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million,
//find the sum of the even-valued terms.

public class Problem2 {
    int previous = 1;
    int current = 1;
    int sum = 0;
    int maxNumber = 4000000;

    public void solve() {
        while (current < maxNumber) {
            int newNumber = previous + current;
            if(newNumber % 2 == 0){
                sum += newNumber;
            }
            previous = current;
            current = newNumber;
        }
        System.out.println(sum);
    }
}
