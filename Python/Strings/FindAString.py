# @author: Jugal Chauhan

def count_substring(string, sub_string):
    counter = 0
    st = len(string)
    sub = len(sub_string)
    for i in range(0, st):
        if string[i:i+sub] == sub_string:
            counter += 1
    return counter

if __name__ == '__main__':
    string = input().strip()
    sub_string = input().strip()
    
    count = count_substring(string, sub_string)
    print(count)