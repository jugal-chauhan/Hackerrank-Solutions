# @author: Jugal Chauhan

s = input()
print(len([True for c in s if c.isalnum()]) != 0)
print(len([True for c in s if c.isalpha()]) != 0)
print(len([True for c in s if c.isdigit()]) != 0)
print(len([True for c in s if c.islower()]) != 0)
print(len([True for c in s if c.isupper()]) != 0)
