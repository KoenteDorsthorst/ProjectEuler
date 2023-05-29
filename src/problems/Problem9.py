# A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
#
# a^2 + b^2 = c^2
# For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
#
# There exists exactly one Pythagorean triplet for which a + b + c = 1000.
# Find the product abc.

class Problem9:

    def solve(self):
        for c in range(1000, 0, -1):
            for b in range(1000 - (c + 1), 0, -1):
                a = 1000 - (c + b)
                if a**2 + b**2 == c**2:
                    return a * b * c
        return None