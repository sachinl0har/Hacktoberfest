import java.util.*;

public class rightTriangle {
    public static void main(String args[]) {
        int i, j, row;
        Scanner rowNum = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
            row = rowNum.nextInt();
            for (i = 0; i < row; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
            }
            System.out.println();
        }
    }
}
