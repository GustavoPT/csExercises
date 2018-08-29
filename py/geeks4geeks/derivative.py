def f(x):
    return x**2
def derivative(x):
    h = 1./1000.
    rise = f(x + h) - f(x)
    run = h
    slope = rise / run
    return slope
def integral(startingx,endingx,numberOfRectangles):
    width = (float(endingx) - float(startingx)) / numberOfRectangles
    runningSum = 0
    for i in range(numberOfRectangles):
        height = f(startingx + (i * width))
    return runningSum

    

print(derivative(1))
print(integral(0,1,10))
print(integral(0.,1.,10))
