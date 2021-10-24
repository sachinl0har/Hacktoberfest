#! /bin/bash

#Ask for length:
echo "Welcome to password generator."
echo "This script works based on the integer part if a float type value is entered."
echo "This script will fail if a string is entered instead of a number. Fix it ;)"
echo ""
printf "How many digits do you need?: "
#Read the input to "length" variable:
read length

# Normalize input length
normalized_length=$( echo ${length} | tr ',' '.' )
normalized_length=$( printf "%.0f" $normalized_length )
normalized_length=$( echo ${normalized_length#-})

tr -dc A-Za-z0-9 </dev/urandom | head -c $normalized_length ; echo ''
