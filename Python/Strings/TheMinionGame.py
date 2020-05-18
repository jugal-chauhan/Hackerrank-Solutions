# @author: Jugal Chauhan

def minion_game(string):
    # your code goes here
    N = len(string)
    kevin, stuart = 0, 0
    for i in range(N):
        if string[i] in 'AEIOU': 
            kevin += (N - i)
        else: 
            stuart += (N - i)
    
    if kevin > stuart:
        print("Kevin", kevin)
    elif stuart > kevin:
        print("Stuart", stuart)
    else:
        print("Draw")

if __name__ == '__main__':
    s = input()
    minion_game(s)