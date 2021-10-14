#include <stdio.h>
int main()
{
    int coin;
    printf("Enter a Number\n");
    scanf("%d", &coin);
    if (coin % 2 == 0)
    {
        printf("Number is Even\n");
    }
    else if (coin % 2 != 0)
    {
        printf("Number is Odd");
    }
    else
    {
        printf("Error");
    }
}