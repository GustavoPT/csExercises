import matplotlib.pyplot as plt
import numpy as np
from matplotlib_venn import venn3,venn3_circles
from Tkinter import *

normal_set = set(["a","b","c"])
normal_set.add("d")
print(normal_set)
second_set = set(["x","w","r"])

frozen_set = frozenset(["e","f","g"])

# print("Frozen set")
# print(frozen_set)
# normal_set.add("r")
# print(normal_set)
# print(second_set.union(normal_set))
# print(normal_set.intersection(second_set))
# print(normal_set.difference(second_set))
# print(normal_set - second_set)
# print(normal_set.clear())
# # v = venn3(subsets=(1,1,0,1))
# v = venn3(subsets=(1,1,0,1,0,0,0))
# v.get_label_by_id('100').set_text('First')
# v.get_label_by_id('010').set_text('Second')
# v.get_label_by_id('001').set_text('Third')
# plt.show()

window = Tk()
window.title("Welcome to my app")
lbl = Label(window,text="Hello")
lbl.grid(column=0,row=0)
text = Entry(window,width=10)
btn.grid(column=1,row=0)
def clicked():
    lbl.configure(text="Button was clicked!!")

lbl = Label(window, text="Hello", font=("Arial Bold", 50))
# lbl = Label(window,text="hello",font("Arial Bold",50))
btn = Button(window,text="Click me",command=clicked)
window.geometry("350x200")
window.mainloop()
