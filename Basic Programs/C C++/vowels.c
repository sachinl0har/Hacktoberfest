#include <stdio.h>
main ()
{
  int ch;
  printf("Enter a character");
  scanf("%c",&ch);
  if(isalpha(ch))
    {
	  if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch=='u')
	    {
		  printf("\n VOWEL");
		}
	  else
	    {
		  printf("\n consonent");
		}
	}
  else if(isdigit(ch));
    {
	  printf("\n DIGIT");
	}
  else
    {
	  printf("\n SPECIAL SYMBOL");
	}
}