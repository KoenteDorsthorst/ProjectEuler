# 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
#
# What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

class Problem5:

    def solve(self):
        # Using 380 as iteration number. It's the only unique number that can be divided by 20 and 19.
        iteration_number = 380
        iteration = iteration_number
        while(True):

            for i in range (20, 0, -1):
                if i == 1:
                    return iteration
                if iteration % i != 0:
                    break
            iteration += iteration_number
        return None