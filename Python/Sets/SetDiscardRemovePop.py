# @author: Jugal Chauhan

n = int(input())
s = set(map(int, input().split()))
m = int(input())
for i in range(0,m):
    q = list(input().split())
    if q[0] == "pop":
        s.pop()
    elif q[0] == "remove":
        s.remove(int(q[-1]))
    elif q[0] == "discard":
        s.discard(int(q[-1]))
    else:
        pass
print(sum(list(s)))