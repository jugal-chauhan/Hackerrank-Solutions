# @author: Jugal Chauhan

# Enter your code here. Read input from STDIN. Print output to STDOUT
n = input()
s1 = set(input().split(" "))
m = input()
s2 = set(input().split(" "))
s3 = s1.symmetric_difference(s2)
print(len(s3))