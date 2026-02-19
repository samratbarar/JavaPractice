package apnaCollege;
import java.util.Scanner;
public class patternSolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the height and width of the pattern : ");
        int height = sc.nextInt();
        int width = sc.nextInt();

        for (int i = 0 ; i < height; i++) {
            for (int j = 0 ; j < width ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
