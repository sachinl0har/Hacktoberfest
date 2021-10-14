#include <stdio.h>
 
int main() //Hello Comment
{
 	int i, j, rows, columns, a[10][10];
  
 	printf("\n Please Enter Number of rows and columns  :  ");
 	scanf("%d %d", &i, &j);
 
 	printf("\n Please Enter the Matrix Elements \n");
 	for(rows = 0; rows < i; rows++)
  	{
   		for(columns = 0;columns < j;columns++)
    	{
      		scanf("%d", &a[rows][columns]);
    	}
  	}
     
 	for(rows = 0; rows < i; rows++)
  	{
  		printf("\n");
   		for(columns = 0; columns < j; columns++)
    	{
    		if(rows >= columns)
    		{
    			printf("%d ", a[rows][columns]);
			}
			else
			{
				printf("0  ");
			}
   	 	}
  	}
  	
 	return 0;
}