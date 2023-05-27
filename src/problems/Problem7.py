# By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
#
# What is the 10 001st prime number?

class Problem7:

    def solve(self):
        # Make sure that 2 is already in the list, so I can skip every even number.
        # This halves the amount of numbers needed to be checked.
        prime_list = [2]
        number = 3

        while True:
            if self.isPrime(number, prime_list):
                prime_list.append(number)
                if len(prime_list) >= 10001:
                    return number
            number += 2

    def isPrime(self, number, prime_list):
        for prime in  prime_list:
            if number % prime == 0:
                return False
        return True