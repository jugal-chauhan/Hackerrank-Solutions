# @author: Jugal Chauhan

n = int(input())
a = set(map(int, input().split()))
m = int(input())
b = set(map(int, input().split()))
i = set(a.union(b))
j = set(a.intersection(b))
r = list(i.difference(j))
r.sort()
for i in range(len(r)):
    print(r[i])