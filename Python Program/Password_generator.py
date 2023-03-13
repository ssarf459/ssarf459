import random as r
import string as str

letters = str.ascii_letters
symbols = str.punctuation
digits = str.digits
all_chars = letters + symbols + digits

length = 8
temp_pwd = r.sample(all_chars, length)
password_string = "".join(temp_pwd)
print(f"Generated password of length {length} is ---{password_string}---")
