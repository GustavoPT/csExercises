class Complex:
    def __init__(self,realpart,imagpart):
        self.r = realpart
        self.i = imagpart

class person:
    def __init__(self,firstname,lastname):
        self.firstname = firstname
        self.lastname = lastname


x = Complex(3.0,-4.5);
print(x.r + x.i)
p = person("ojama","yellow")
print(p.firstname + " " + p.lastname)
