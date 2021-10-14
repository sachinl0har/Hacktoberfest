#This is a variable! 
#Variables are cap sensitive
x = 5
y = "Yuuki"

#Variables can be printed
print (x)

print (y)

#Working Variables
myVariable = "Hi!"
my_Variable = 10
myVariable2 = "Variable 2!"

"""
Illegal Variables

my var = 2
my-var = 10
1myvar = "Hello"
"""

#Assing multiple variables in one line

q, w, e = "letraQ", "letraW", "letraE"

print (q, w, e)

#Output variables

a = "music"

print ("Yuuki likes " + a)

p = "text can be "
o = "joined"

print (p + o)

#Global Variables

globalVariable = "This is a global variable!" #Variables created outside are global variables

def myfunction(): #The global variables can be used anywhere!
    print ("-" + globalVariable)

myfunction()

myVariable1 = "Awesome"

def myfunc():
    myVariable1 = "fantastic" #this variable overwrites the "myvariable1"
    #This is a local variable that it will only work inside this funcion
    print ("Programming is " + myVariable1)

myfunc()

print ("Programming is " + myVariable1)


#Global keyword

def globalfunction():
    global x
    x = "fantastic"

globalfunction()

print ("Python is " + x)

x = "awesome" #Here i define a new variable

def myfunction1():
  global x #Here i make the variable "x" global
  x = "fantastic" #Here is overwrite the global "x" variable

myfunction1() #here i run the funcion so the changes work

print("Python is " + x)


a = "part 1"

def myfunction2():
    global a
    a = "part 2"

print (a)
#The first print dind't get the part 2 because i didn't named the function
myfunction2() 

print (a)