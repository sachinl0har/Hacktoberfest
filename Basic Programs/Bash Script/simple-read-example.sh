#! /bin/bash

#Simple "read" example, age calculator:

#Ask for user's name:
printf "What's your name?: "
#Read the input to "name" variable:
read name
#Ask for birth year:
printf "What's your birth year?: "
#Read the input to "b_year" variable:
read b_year

#Get the current year:
let year=$(date +"%Y")
#Calculate the age:
let age=year-b_year
#Show the message:
printf "So you're %d years old %s, am I right?\n" "$age" "$name"

