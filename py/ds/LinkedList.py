from Node import Node 

# https://www.youtube.com/watch?v=1yUFZMKY08E&list=PLib7LoYR5PuDxi8TxxGKxMgf8b-jtoS3i&index=5
# https://classroom.udacity.com/courses/cs215

class LinkedList(object):

    def __init__(self):
        self.head = None
        self.counter = 0
    
    def insertStart(self,data):
        nextNode = Node(data)

        if not self.head:
            self.head = newNode 
        else:
            newNode.nextNode = self.head
            self.head = newNode 
            
    def size(self):
        return self.counter
    
    def insertEnd(self,data):
        newNode = Node(data)
        actualNode = self.head
