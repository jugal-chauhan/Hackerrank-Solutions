# @author: Jugal Chauhan

list = []
N = int(input())
for i in range(0, N):
    tokens = input().split()

    if tokens[0] == 'insert':
        list.insert(int(tokens[1]), int(tokens[2]))
    elif tokens[0] == 'print':
        print(list)
    elif tokens[0] == 'remove':
        list.remove(int(tokens[1]))
    elif tokens[0] == 'append':
        list.append(int(tokens[1]))
    elif tokens[0] == 'sort':
        list.sort()
    elif tokens[0] == 'pop':
        list.pop()
    elif tokens[0] == 'reverse':
        list.reverse()