letter='''Dear<|NAME|>,
YOU are selected!

Date:<|DATE|>
'''
name=input("enter your Name\n")
date=input("enter date\n")
letter=letter.replace("<|NAME|>",name)
letter=letter.replace("<|DATE|>",date)
print(letter)