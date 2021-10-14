sub1=int(input("enter first subject number:"))
sub2=int(input("enter second subject number:"))
sub3=int(input("enter third subject number:"))
if(sub1<33 or sub2<35 or sub3<34):
    print("your are fail")
elif(sub1+sub2+sub3)/2<40:
    print("you are fail")
else:
    print("you are pass")