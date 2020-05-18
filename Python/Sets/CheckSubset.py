# @author: Jugal Chauhan

# Enter your code here. Read input from STDIN. Print output to STDOUT
t = int(input())
for i in range(t):
    n = input()
    s1 = set(input().split(" "))
    m = input()
    s2 = set(input().split(" "))
    print(s1.issubset(s2))