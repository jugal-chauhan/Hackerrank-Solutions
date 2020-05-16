# @author: Jugal Chauhan

def average(array):
    # your code goes here
    sum = 0
    s = set(arr)
    a = list(s)
    for i in range(len(a)):
        sum = sum + a[i]
    return float(sum/len(a))

if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)