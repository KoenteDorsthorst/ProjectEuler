package problems;

//Problem 9
//A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
//
//a2 + b2 = c2
//For example, 32 + 42 = 9 + 16 = 25 = 52.
//
//There exists exactly one Pythagorean triplet for which a + b + c = 1000.
//Find the product abc.

public class Problem9 {

    public Problem9() {
        solve();
    }

    void solve() {
        for (int a = 0; a < 1000; a++) {
            for (int b = 0; b < 1000; b++) {
                int c = 1000 - a - b;
                if (checkIfPythagorean(a, b, c)){
                    System.out.println("Problem 9 solution: " + a * b * c);
                    break;
                }
            }
        }
    }


    boolean checkIfPythagorean(int a, int b, int c) {
        if(a > 0 && b > 0 && c > 0) {
            return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
        }
        return false;

    }
}
