# @author: Jugal Chauhan

# Enter your code here. Read input from STDIN. Print output to STDOUT
a = set(map(int, input().split()))
n = int(input())
for i in range(n):
    x = set(map(int, input().split()))
    if a.issuperset(x) != True or len(a) == len(x): 
        print(False)
        break 
else:
    print(True)