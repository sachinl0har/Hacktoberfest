#include <stdio.h>
main ()
{
   int n;
   printf("\n Enter single digit number");
   scanf("%d",&n);
   switch(n)
   {
      case1: 1;
	    printf("\n ONE");
	    break;
	  case2: 2;
	    printf("\n TWO");
	    break;
	  case3: 3;
	    printf("\n THREE");
	    break;
	  case4: 4;
	    printf("\n FOUR");
	    break;
	  case5: 5;
	    printf("\n FIVE");
	    break;
	  case6: 6;
	    printf("\n SIX");
	    break;
	  case7: 7;
	    printf("\n SEVEN");
	    break;
	  case8: 8;
	    printf("\n EIGHT");
	    break;
	  case9: 9;
	    printf("\n NINE");
	    break;
	  case0: 0;
	    printf("\n ZERO");
	    break;
	  default:
	    printf("\n WRONG CHOICE");
   }
}