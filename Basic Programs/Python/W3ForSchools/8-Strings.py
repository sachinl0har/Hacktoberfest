#String literals are surrounded my quotation marks or double marks "" and '' 

print('This is the same as')
print("this")

#Strings can be assinged to variables

a = "Hello"
print(a)

#Multiline strings

a = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua.""" #With 3 quotes or double quotes you can assign a multi line string to a variable

print (a)

#String arrays

a = "Hello Yuuki!"
#Counting always starts with the number 0
print(a[1])

#Slicing
a = "Hello Yuuki"
print(a[3:5]) #the 5 is not included

#Negative indexing
b = "Hello, World!"
print(b[-5:-2]) #It starts to count from the end

#String Length
print(len(a)) #You can get the string length

#String methods
a = " Hello, World! "

#strip() - It removes the spaces from the start and the end
print(a.strip()) # returns "Hello, World!"

a = "Hello, World!"

#lower() - Returns the string in lower case
print(a.lower())

#upper() - Returns the string un upper case
print(a.upper())

#replace() - It replaces a string with another one
print(a.replace("H", "P"))

#split() - It splits the string where you indicate the split instance separator
print(a.split(","))

#Check string
#It checks if a certain phrase or character is present in a string, we can use the keywords in or not in.

txt = "The rain in Spain stays mainly in the plain"
x = "ain" in txt #Checking if there is "ain" in the txt variable
print(x) #It returns a bool value

#You can also check if it is NOT in
x = "ain" not in txt #Checking if there is "ain" in the txt variable
print(x) #It returns a bool value

#String concatenation
a = "Hello"
b = "World"
c = a + b #It will join the strings without spaces
print(c)

a = "Hello"
b = "World"
c = a + " " + b #You can join variables and strings
print(c)

#This doesnt work because you can't join strings with integers
#age = 8
#txt = "My name is Yuuki, I am " + age
#print(txt)

#format() - You can join strings with integers
#format() - can take unlimited number arrangements and plance them in the correct order
age = 8
txt = "My name is Yuuki, and I am {}"
print(txt.format(age)) 

count = 100
txt = "I have watched more than {} animes and i am {} years old"
print(txt.format(count, age))

#Escape character
#The escape character allows you to use double quotes when you normally would not be allowed

escapev = "I am \"happy\" always."

#\'	Single Quote	
#\\	Backslash	
#\n	New Line	
#\r	Carriage Return	
#\t	Tab	
#\b	Backspace	
#\f	Form Feed	
#\ooo	Octal value	
#\xhh	Hex value

#All string methods here:
#https://www.w3schools.com/python/python_strings.asp