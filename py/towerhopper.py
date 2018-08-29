# https://www.youtube.com/watch?v=kHWy5nEfRIQ

towers = [4,2,0,0,2,0]

def is_hoppable(a):
    i = 0
    # while i < len(towers):
    #     print(towers[i])
    #     i += 1
    for i  in range(len(a)):
        for j in range(len(a)):
            
        # we start at 0
        # then check each subsequent
        # index that is jumpable
        # in reverse fashion
        # for loop beginning
        # at the end and going
        # to 0

        # have a variable to keep
        # index of a[i]
        j =  a[i]
        # begin at the end
        # print(j)
        a[i + j]
        # Go down backwards
        k = 0
        while(k > i):
            print(a[k])
            k -= 1

is_hoppable(towers)
