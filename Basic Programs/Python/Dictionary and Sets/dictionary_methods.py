myDict = { 
    "Fast":"in a quick manner",
    "ALPHA":"A coder",
    "Marks":[1,2,5],
    "anotherdict":{'ALPHA':'player'},
    1:2 

    # fast:key
    # in a quick manner:value
} 
# Dictionary Methods     
print(type(myDict.keys()))  #prints the keys of the dictionary
print(list(myDict.keys()))
print(myDict.values())      #print the values of the dictionary
print(myDict.items())       #print the (key,value) for all content of the dictionary
print(myDict)
updateDict={
    "Lovish":"Friend",
    "SAKSHI":"Friend",
    "shubham":"Friend",
    "ALPHA":"a dancer", 
}
myDict.update(updateDict)    #update the dictionary by adding key-value pairs from updatedict
print(myDict)

print(myDict.get("ALPHA"))   #prints value associated with key "ALPHA"
print(myDict.get["ALPHA"])   #prints value associated with key "ALPHA"
# the difference between .get and [] syntax in dictionary?
print(myDict.get("ALPHA2"))  #returns none as ALPHA2 is not present in the dictionary
print(myDict["ALPHA2"])       #throws an error as ALPHA is not present in the dictionary