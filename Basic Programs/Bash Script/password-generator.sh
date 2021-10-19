#! /bin/bash

#Ask for length:
echo "Welcome to password generator."
echo "This script will fail if you type a non-integer value. Fix it ;)"
echo ""
printf "How many digits do you need?: "
#Read the input to "length" variable:
read length

tr -dc A-Za-z0-9 </dev/urandom | head -c $length ; echo ''
