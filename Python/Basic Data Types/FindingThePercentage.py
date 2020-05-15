# @author: Jugal Chauhan

n = int(input())
student_marks = {}
for _ in range(n):
    name, *line = input().split()
    scores = list(map(float, line))
    student_marks[name] = scores
query_name = input()
temp = list(student_marks[query_name])
a = (float(sum(temp)/len(temp)))
print("%.2f" % a)