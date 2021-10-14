"""
Numeric types in python:

- int: numbers
- float: decimal numbers --> they can also be scientific numbers with an "e" to indicate power of 10 "35e3"
- complex: number + letter --> complex numbers are written with a "j" as the imaginary part "3+5j"
x = 1    # int
y = 2.8  # float
z = 1j   # complex
"""

x = 8 #int
y = 20.3 #float
z = 1j #complex

print (x, y, z)

print(type(x))
print(type(y))
print(type(z))

#Converting data types
print("converting data")

a = float(x)
b = int(y)
c = complex(x)

print(type(a))
print(type(b))
print(type(c))

#Random numbers
print("Random number")

import random #first i need to import var to make the random number
print(random.randrange(1,10)) #first i get the random var and later i put the random range
