public class sumnevenno {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        int n = 3;
        while (i<n) {
            sum = sum + (2*i);
            i++;
        }
        System.out.println("The sum of n even numbers is " + sum);
    }
}
