# @author: Jugal Chauhan

arr = list(map(int, input().split()))
n = arr[0]
m = arr[1]
l = map(int, input().split())
a = set(map(int, input().split()))
b = set(map(int, input().split()))
happiness = 0
for i in l:
    if i in a:
        happiness += 1
    elif i in b:
        happiness += -1
    else: 
        pass
print(happiness)