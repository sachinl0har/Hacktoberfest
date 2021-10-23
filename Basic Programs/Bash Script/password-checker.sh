#! /bin/bash

# Get passwords to check
echo "Password : "
read passwordOne
echo "Password (again) : "
read passwordTwo

# Get md5sum value for passwords
md5_passwordOne=`md5 <<< "${passwordOne}"`
md5_passwordTwo=`md5 <<< "${passwordTwo}"`

# Check passwords are they same?
if [[ "${md5_passwordOne}" == "${md5_passwordTwo}" ]] && [[ "${passwordOne}" == "${passwordTwo}" ]]; then
    echo "Passwords are same."
else
    echo "Passwords are not same."
fi