
# Problem 3
# The prime factors of 13195 are 5, 7, 13 and 29.
#
# What is the largest prime factor of the number 600851475143 ?
class Problem3:
    def solve(self):
        factor_number = 600851475143
        biggest_factor = 0

        # Anything above factor_number ^ 0.5 has already been checked
        # by dividing the factor_number with the number that's currently being checked.
        for i in range(2, int(factor_number**0.5) + 1):
            if factor_number % i == 0:
                if self.check_if_prime(i):
                    biggest_factor = i

                if self.check_if_prime(factor_number // i):
                    biggest_factor = factor_number // i

        return biggest_factor

    def check_if_prime(self, number):
        for i in range(2, int(number**0.5) + 1):
            if number % i == 0:
                return False
        return True

