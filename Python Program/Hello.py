import random as r
import string as str

letters = str.ascii_letters
numbers = str.digits
symbols = str.punctuation
all_chars =  letters + symbols + numbers

# for i in range(0, 100):
length = r.randint(4, 10)
temp = r.sample(all_chars, length)
random_string = "".join(temp)
print(random_string)