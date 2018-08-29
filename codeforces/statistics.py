import statistics as sta
import random 
import numpy as np
import matplotlib.pyplot as plt 

y = [random.random() * 100.0 for i in range (10)]
# print(y)
y.sort()
# print(y)

def avg(x):
    return sum(x) / len(x)

for i in range(len(y)):
    print("%.2f" % y[i])

objects = ('Python', 'C++', 'Java', 'Perl', 'Scala', 'Lisp')
y_pos = np.arange(len(objects))
performance = [10,8,6,4,2,1]
 
plt.bar(y_pos, performance, align='center', alpha=0.5)
plt.xticks(y_pos, objects)
plt.ylabel('Usage')
plt.title('Programming language usage')
 
plt.barh(y_pos, performance, align='center', alpha=0.5)
plt.yticks(y_pos, objects)
plt.xlabel('Usage')
plt.title('Programming language usage')

plt.show()

# plt.plot([1,2,3,4])
# plt.axis([0, 6, 0, 20])
# plt.show()

# print(max(y))
# print(min(y))
# print(avg(y))
# print(np.average(y))