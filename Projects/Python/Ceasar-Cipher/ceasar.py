class CeasarCipher(object):

    # You can change the alphabet to be used for encryption/decryption.
    alphabet = 'abcdefghijklmnopqrstuvwyzABCDEFGHIJKLMNOPQRSTUVWYZ'

    def __init__(self):

        # Print hello program message
        print( '''
This piece of script encrypts a desired message according to the Ceasar algorithm.

0) Specify whether you want to encrypt or decrypt.
1) Enter the number of characters you want to encrypt with skip
2) Write the message you want
3) Your message is ready.
        ''')

        # Get required info for Ceaser-Cipher
        isEncryption = str(input('Which mode do you want to run ? ( E (encryption) / D (decryption) :: '))
        key= int(input('How many character will shift the message? :: '))
        message = str(input('Write your message : \n _________________________________________________________________ \n'))

        # Do encryption or decryption
        if isEncryption == "D" or isEncryption == "d":
            output= self.decrypt(message, key)
        else:
            output= self.encrypt(message, key)

        # Print output
        print( ''' \n \n 
Output Message
_________________________________________________________________ \n
{:s}
        '''.format(output))
        exit(0)
    

    # Encryption function
    def encrypt(self,text,key):
        encrypted_message = ''
        for c in text:
            # Shift character
            index = self.alphabet.find(c)
            if index == -1:
                # Character not found
                encrypted_message += c
            else:
                # Shift it based on key and mode
                new_index = index + key
                # new_index = index + key if mode == 1 else index - key
                new_index %= len(self.alphabet)
                encrypted_message += self.alphabet[new_index:new_index+1]
        # Return the ciphered text
        return encrypted_message

    # Decryption function
    def decrypt(self,text,key):
        decrypted_message = ''
        for c in text:
            # Shift character
            index = self.alphabet.find(c)
            if index == -1:
                # Character not found
                decrypted_message += c
            else:
                # Shift it based on key and mode
                new_index = index - key
                # new_index = index + key if mode == 1 else index - key
                new_index %= len(self.alphabet)
                decrypted_message += self.alphabet[new_index:new_index+1]
        # Return the ciphered text
        return decrypted_message


if __name__ == "__main__":
    CeasarCipher()