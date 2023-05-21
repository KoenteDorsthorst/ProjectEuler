

# Problem 1
#
# If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
# The sum of these multiples is 23.
#
# Find the sum of all the multiples of 3 or 5 below 1000.

class Problem1:
    def solve(self):
        # For number BELOW 1000
        max_number = 1000 - 1
        sum = 0
        for i in range(1, max_number):
            if i % 3 == 0 or i % 5 == 0:
                sum += i

        return(sum)

    # alternate solution. More complicated and specific, but faster.
    def solve2(self):
        # For number BELOW 1000
        max_number = 1000 - 1

        sum_5 = self.calculate_divisible_sum(5, max_number)
        sum_3 = self.calculate_divisible_sum(3, max_number)
        total_sum = sum_5 + sum_3

        # sum_3 and sum_5 both contain number divisible by 15. One of these instances needs to be removed
        sum_15 = self.calculate_divisible_sum(15, max_number)
        total_sum -= sum_15
        return total_sum

    def calculate_divisible_sum(self, divisible_number, max_number):
        # Get the nearest number from max_number that's divisible by divisible_number
        nearest_div = max_number - ((max_number) % divisible_number)
        # Get amount of times divisble number appears in nearest_div
        appear_amount = nearest_div / divisible_number
        # Calculate the sum of all the numbers divisible by divisible_number. Use the following principle:
        # Calculating sum of divisible 5 in 30:
        # 30 + 5 = 35; 35 / 2 = 17.5; 30 / 5 = 6; 17.5 * 6 = 105
        sum = ((nearest_div + divisible_number) / 2) * appear_amount
        return sum


