# sum of multiples of 3 or 5 upto 1000

sum_of_multiples = 0

for i in range(0, 1000):
    if i%3==0 or i%5==0:
        sum_of_multiples += i

print(sum_of_multiples)