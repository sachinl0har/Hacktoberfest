#include <stdio.h>
main ()
{
  char ch;
  printf("Enter the Character");
  scanf("%c",&ch);
  if (isalpha(ch))
    {
	  if (islower(ch))
	    {
		  printf("Lowercase");
		}
	  else
	    {
		  printf("Uppercase");
		}
	}
}