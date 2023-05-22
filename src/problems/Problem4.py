# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
#
# Find the largest palindrome made from the product of two 3-digit numbers.


class Problem4:

    def solve(self):
        largest_palindrome = 0
        for i in range(999, 0, -1):
            for n in range(999, 0, -1):
                if self.isPalindrome(i * n) and i * n > largest_palindrome:
                    largest_palindrome = i * n
        return largest_palindrome

    def isPalindrome(self, number):
        number_string = str(number)
        # Evaluate the number at index i with the number at index -1. Stop halfway to prevent repeating.
        for i in range(0, len(number_string) // 2):
            # use reverse indexing. Index 0 should match index -1 if it is a palindrome.
            if number_string[i] != number_string[(-i) - 1]:
                return False
        return True
