# @author: Jugal Chauhan

cube = lambda x: x**3
# complete the lambda function 

def fibonacci(n):
    # return a list of fibonacci numbers
    t1 = 0 
    t2 = 1
    l = []
    for i in range(n):
        l.append(t1)
        nextt = t1 + t2
        t1 = t2
        t2 = nextt
    return(l)

if __name__ == '__main__':
    n = int(input())
    print(list(map(cube, fibonacci(n))))