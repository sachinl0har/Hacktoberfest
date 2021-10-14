import java.util.*;

public class calc {
    public static void main(String[] args){
        double a, b, c = 0, e = 0, x, y, z;
        int d, numS;
        Scanner calc = new Scanner(System.in);
        System.out.print("\033[H\033[2J");
        while(e == 0){
            System.out.println("\n1. Addition + \n2. Subtraction - \n3. Multipication * \n4. Division / \n5. Modulus % \n6. Hypotenuse \n7. Power of a Number \n8. Random Number \n9. Converter \n10. Armstrong Number \n11. Reverse a Number \n12. Circle \n13. Rectangle \n14. Tables \n15. Matrices \n16. Exit \nEnter Your Choice: \n");
        d = calc.nextInt();
        switch(d){
            case 1:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nAddition\n");
                System.out.println("Enter How many Numbers you want to SUM: \n");
                numS = calc.nextInt();
                System.out.println("Enter the " + numS + " Numbers: \n");
                for(int i = 1; i <= numS; i++){
                    System.out.println("Enter Number " + (i) + " : \n");
                    a = calc.nextDouble();
                    c += a;
                }
                System.out.println("\nThe Sum of " + numS + " Numbers is " + c );
                break;
            case 2:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nSubtraction\n");
                System.out.println("Enter How many Numbers you want to Substract: \n");
                numS = calc.nextInt();
                System.out.println("Enter Number 1: \n");
                c = calc.nextDouble();
                System.out.println("Enter the " + numS + " Numbers: \n");
                for(int i = 2; i <= numS; i++){
                    System.out.println("Enter Number " + (i) + " : \n");
                    a = calc.nextDouble();
                    c -= a;
                }
                System.out.println("\nThe Difference of " + numS + " Numbers is " + c );
                break;
            case 3:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nMultipication\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a * b;
                System.out.println("\nThe Combination of " + a + " and " + b + " is " + c );
                break;
            case 4:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nDivision\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a / b;
                System.out.println("\nThe Divison of " + a + " and " + b + " is " + c );
                break;
            case 5:
                System.out.print("\033[H\033[2J");  
                System.out.println("\nModulus\n");
                System.out.println("Enter First Number: \n");
                a = calc.nextDouble();
                System.out.println("Enter Second Number: \n");
                b = calc.nextDouble();
                c = a % b;
                System.out.println("\nThe Modulus of " + a + " and " + b + " is " + c );
                break;
            case 6:
                System.out.print("\033[H\033[2J");
                System.out.println("Enter side x: ");
                x  = calc.nextDouble();
                System.out.println("\nEnter side y: ");
                y = calc.nextDouble();
                z = Math.sqrt((x * x) + (y * y));
                System.out.println("The Hypotenuse is " + z);
                break;
            case 7:
                System.out.print("\033[H\033[2J");
                Scanner pow = new Scanner(System.in);
                int base, exp, oexp, result = 1;
                System.out.println("Enter Base Number: ");
                base = pow.nextInt();
                System.out.println("Enter an Exponent: ");
                exp = pow.nextInt();
                oexp = exp;
                while(exp != 0){
                    result *= base;
                    --exp;
                }
                System.out.println("The Power of " + base + " Raised to " + oexp + " is " + result);
                break;
            case 8:
                System.out.print("\033[H\033[2J");
                int min, max;
                Scanner randN = new Scanner(System.in);
                System.out.println("Enter the min number: ");
                min  = randN.nextInt();
                System.out.println("Enter the max number: ");
                max = randN.nextInt();
                int randNumber = (int)(Math.random() * (max - min + 1) + min);
                System.out.println("Random Number Between " + min + " to " + max + " is " + randNumber);
                break;
            case 9:
                System.out.print("\033[H\033[2J");
                double f, cel; 
                int option;
                Scanner con = new Scanner(System.in);
                System.out.println("1. Celsius to Fahrenheit \n2. Fahrenheit to Celsius \nEnter Your Choice: ");
                option = con.nextInt();
                switch(option){
                    case 1:
                        System.out.println("Enter Temperature in Celsius: ");
                        cel = con.nextDouble();
                        f = (cel * 9/5) + 32;
                        System.out.println("The Temperature of " + cel + " Celsius in Fahrenheit is: " + f);
                        break;
                    case 2:
                        System.out.println("Enter Temperature in Fahrenheit: ");
                        f = con.nextDouble();
                        cel = (f - 32) * 5/9;
                        System.out.println("The Temperature of " + f + " Fahrenheit in Celsius is: " + cel);
                        break;
                }
                break;
            case 10:
                System.out.print("\033[H\033[2J");
                int ce = 0, ae, temp, n;
                Scanner num = new Scanner(System.in);
                System.out.print("Enter number to be checked: ");
                n = num.nextInt();
                temp = n;
                while(n > 0){
                    ae = n % 10;
                    n = n/10;
                    ce = ce+(ae*ae*ae);
                }
                if(temp == ce){
                    System.out.println(temp+" is an Armstrong Number.");
                }else{
                    System.out.println(temp+" is not an Armstrong Number.");
                }
                break;
            case 11:
                System.out.print("\033[H\033[2J");
                Scanner revNum = new Scanner(System.in);
                int rnum, rev = 0, remainder;
                System.out.println("Enter an Integer: ");
                rnum = revNum.nextInt();
                while(rnum != 0){
                    remainder = rnum % 10;
                    rev = rev * 10 + remainder;
                    rnum /= 10;
                }
                System.out.println("Reversed Number of " + rnum + " is " + rev);
                break;
            case 12:
                System.out.print("\033[H\033[2J");
                Scanner circle = new Scanner(System.in);
                double radius, circumference, area, diameter;
                int choice;
                System.out.println("Circle\n1. Radius \n2. Diameter \n3. Circumference \n4. Area \nEnter Your Choice: ");
                choice = circle.nextInt();
                switch(choice){
                    case 1:
                        System.out.println("Enter Circumference of Circle: ");
                        circumference = circle.nextDouble();
                        radius = circumference/(2 * 3.14);
                        System.out.println("Radius of Circumference " + circumference + " = " + radius);
                        break;
                    case 2:
                        System.out.println("Enter Radius of Circle: ");
                        radius = circle.nextDouble();
                        diameter = 2 * radius;
                        System.out.println("The Diameter of radius " + radius + " Circle = " + diameter);
                        break;
                    case 3:
                        System.out.println("Enter Radius of Circle: ");
                        radius = circle.nextDouble();
                        circumference = 2 * 3.14 * radius;
                        System.out.println("The Circumference of Radius " + radius + " Circle = " + circumference);
                        break;
                    case 4:
                        System.out.println("Enter Radius of Circle: ");
                        radius = circle.nextDouble();
                        area = 3.14 * radius * radius;
                        System.out.println("The Area of Radius " + radius + " Circle = " + area);
                        break;
                }
                break;
            case 13:
                System.out.print("\033[H\033[2J");
                double length, width, rectangleArea, perimeter, diagonal;
                int option1;
                Scanner rectangle = new Scanner(System.in);
                System.out.println("Rectangle\n1. Area \n2. Diagonal \n3. Perimeter \n4. Length \n5. Width \nEnter Your Choice: ");
                option1 = rectangle.nextInt();
                switch(option1){
                    case 1:
                        System.out.println("Enter Length of the Rectangle: ");
                        length = rectangle.nextDouble();
                        System.out.println("Enter Width of the Rectangle: ");
                        width = rectangle.nextDouble();
                        rectangleArea = length * width;
                        System.out.println("The Area of the Rectangle " + length + " Length " + width + " Width is " + rectangleArea);
                        break;
                    case 2:
                        System.out.println("Enter Length of the Rectangle: ");
                        length = rectangle.nextDouble();
                        System.out.println("Enter Width of the Rectangle: ");
                        width = rectangle.nextDouble();
                        diagonal = Math.sqrt((length * length) + (width * width));
                        System.out.println("The Diagonal of the Rectangle " + length + " Length " + width + " width is " + diagonal);
                        break;
                    case 3:
                        System.out.println("Enter Length of the Rectangle: ");
                        length = rectangle.nextDouble();
                        System.out.println("Enter Width of the Rectangle: ");
                        width = rectangle.nextDouble();
                        perimeter = 2 * (length + width);
                        System.out.println("The Perimeter of the Rectangle " + length + " Length " + width + " width is " + perimeter);
                        break;
                    case 4:
                        System.out.println("Enter Width of the Rectangle: ");
                        width = rectangle.nextDouble();
                        System.out.println("Enter Perimeter of the Rectangle: ");
                        perimeter = rectangle.nextDouble();
                        length = (perimeter/2) - width;
                        System.out.println("The Length of Rectangle whose Perimeter = " + perimeter + " and Width = " + width + " is " + length);
                        break;
                    case 5:
                        System.out.println("Enter Length of the Rectangle: ");
                        length = rectangle.nextDouble();
                        System.out.println("Enter Perimeter of the Rectangle: ");
                        perimeter = rectangle.nextDouble();
                        width = (perimeter/2) - length;
                        System.out.println("The Width of Rectangle whose Perimeter = " + perimeter + " and Length = " + length + " is " + width);
                        break;
                }
                break;
            case 14:
                System.out.print("\033[H\033[2J");
                Scanner tables = new Scanner(System.in);
                int tNum;
                System.out.println("Enter a Number Whose Table you want to see: ");
                tNum = tables.nextInt();
                System.out.println("\n" + tNum + " x 1 = " + tNum * 1 + " \n");
                System.out.println(tNum + " x 2 = " + tNum * 2 + " \n");
                System.out.println(tNum + " x 3 = " + tNum * 3 + " \n");
                System.out.println(tNum + " x 4 = " + tNum * 4 + " \n");
                System.out.println(tNum + " x 5 = " + tNum * 5 + " \n");
                System.out.println(tNum + " x 6 = " + tNum * 6 + " \n");
                System.out.println(tNum + " x 7 = " + tNum * 7 + " \n");
                System.out.println(tNum + " x 8 = " + tNum * 8 + " \n");
                System.out.println(tNum + " x 9 = " + tNum * 9 + " \n");
                System.out.println(tNum + " x 10 = " + tNum * 10 + " \n");
                break;
            case 15:
                System.out.print("\033[H\033[2J");
                int rows, rows1, columns, columns1, option2, i, j, k, rSum = 0;
                int[][] matrix1 = new int[100][100], matrix2 = new int[100][100], mSum = new int[100][100];
                Scanner matrix = new Scanner(System.in);
                System.out.println("1. Addition \n2. Subtraction \n3. Multipication \n4. Transpose \nEnter Your Choice: ");
                option2 = matrix.nextInt();
                switch(option2){
                    case 1:
                        System.out.println("Enter Number of Rows: ");
                        rows = matrix.nextInt();
                        System.out.println("Enter Number of Columns: ");
                        columns = matrix.nextInt();
                        System.out.println("\nEnter elements of 1st matrix: \n");
                        for(i = 0; i < rows; ++i){
                            for(j = 0; j < columns; ++j){
                            System.out.format("Enter Element A%d%d: ", i + 1, j + 1);
                            matrix1[i][j] = matrix.nextInt();
                            }
                        }
                        System.out.println("Enter element of 2nd matrix: ");
                        for(i = 0; i < rows; ++i){
                            for(j = 0; j < columns; ++j){
                                System.out.format("Enter Element B%d%d: ", i + 1, j + 1);
                                matrix2[i][j] = matrix.nextInt();
                                }
                            }
                        for(i = 0; i < rows; ++i){
                            for(j = 0; j < columns; ++j){
                                mSum[i][j] = matrix1[i][j] + matrix2[i][j];
                            }
                        }
                        System.out.println("\nSum of Two Matrices: \n");
                        for(i = 0; i < rows; ++i){
                            for(j = 0; j < columns; ++j){
                                System.out.format("%d ", mSum[i][j]);
                                if(j == columns - 1){
                                    System.out.println("\n");
                                }
                            }
                        }
                break;
                case 2:
                    System.out.println("Enter Number of Rows: ");
                    rows = matrix.nextInt();
                    System.out.println("Enter Number of Columns: ");
                    columns = matrix.nextInt();
                    System.out.println("\nEnter elements of 1st matrix: \n");
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            System.out.format("Enter Element A%d%d: ", i + 1, j + 1);
                                matrix1[i][j] = matrix.nextInt();
                        }
                    }
                    System.out.println("Enter element of 2nd matrix: ");
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            System.out.format("Enter Element B%d%d: ", i + 1, j + 1);
                            matrix2[i][j] = matrix.nextInt();
                        }
                    }
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            mSum[i][j] = matrix1[i][j] - matrix2[i][j];
                        }
                    }
                    System.out.println("\nDifference of Two Matrices: \n");
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            System.out.format("%d ", mSum[i][j]);
                            if(j == columns - 1){
                                System.out.println("\n");
                            }
                        }
                    }
                    break;
                case 3:
                    System.out.println("Enter the number of rows of Matrix 1: ");
                    rows = matrix.nextInt();
                    System.out.println("Enter the number of columns of Matrix 1: ");
                    columns = matrix.nextInt();
                    matrix1 = new int[rows][columns];
                    System.out.println("Enter elements of Matrix 1: ");
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            System.out.format("Enter Element A%d%d: ", i + 1, j + 1);
                                matrix1[i][j] = matrix.nextInt();
                        }
                    }
                    System.out.println("Enter the number of rows of Matrix 2: ");
                    rows1 = matrix.nextInt();
                    System.out.println("Enter the number of columns of Matrix 2: ");
                    columns1 = matrix.nextInt();
                    if(columns != rows1){
                        System.out.println("The Matrices cant be multiplied with each other as Number of columns of Matrix 1 id not equal to Number of rows of Matrix 2.");
                    }else{
                        int[][] second = new int[rows1][columns1];
                        int[][] multiply = new int[rows][columns1];
                    System.out.println("Enter Elements of Matrix 2: ");
                    for(i = 0; i < rows1; ++i){
                        for(j = 0; j < columns1; ++j){
                            System.out.format("Enter Element A%d%d: ", i + 1, j + 1);
                                second[i][j] = matrix.nextInt();
                        }
                    }
                    for(i = 0; i < rows; i++){
                        for(j = 0; j < columns; j++){
                            for(k = 0; k < rows1; k++){
                                rSum = rSum + matrix1[i][k] * second[k][j];
                            }
                            multiply[i][j] = rSum;
                            rSum = 0;
                        }
                    }
                    System.out.println("Product of the Matrices: ");
                    for(i = 0; i < rows; i++){
                        for(j = 0;j < columns1; j++){
                            System.out.format("%d\t", multiply[i][j]);
                            if(j == columns1 - 1){
                            System.out.print("\n");
                            }
                        }
                    }
                    }
                    break;
                case 4:
                    System.out.println("Enter Number of Rows: ");
                    rows = matrix.nextInt();
                    System.out.println("Enter Number of Columns: ");
                    columns = matrix.nextInt();
                    System.out.println("\nEnter elements of the matrix: \n");
                    for(i = 0; i < rows; ++i){
                        for(j = 0; j < columns; ++j){
                            System.out.format("Enter Element A%d%d: ", i + 1, j + 1);
                                matrix1[i][j] = matrix.nextInt();
                        }
                    }
                    System.out.println("The Matrix is: ");
                    for(i = 0; i < rows; i++){
                        for(j = 0; j < columns; j++){
                            System.out.print(matrix1[i][j] + " ");
                        }
                        System.out.println();
                    }
                    int[][] transpose = new int[columns][rows];
                    for(i = 0; i < rows; i++){
                        for(j = 0; j < columns; j++){
                            transpose[i][j] = matrix1[j][i];
                        }
                    }
                    System.out.println("Printing Matrix After Transpose: ");
                    for(i = 0; i < rows; i++){
                        for(j = 0; j < columns; j++){
                            System.out.print(transpose[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;
                }
                break;
            case 16:
                System.out.print("\033[H\033[2J");
                e = 1;
                System.out.println("\nThank You For Visiting\n");
                System.exit(0);
                break;
        }
        } calc.close();
    } 
}