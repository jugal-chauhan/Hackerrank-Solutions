# @author: Jugal Chauhan

def merge_the_tools(string, k):
    # your code goes here
    n = len(string)
    for i in range(0, n, k):
        dic = {}
        res = ""
        for c in string[i:i+k]:
            if c not in dic:
                dic[c] = 1
                res += c
        print(res)  

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)