# @author: Jugal Chauhan

# Enter your code here. Read input from STDIN. Print output to STDOUT
import math
c = float(input())
a = float(input())
h = math.sqrt(c**2+a**2)
h = h/2.0
adj = a/2.0
print(str(int(round(math.degrees(math.acos(adj/h)))))+"°")