public class Sum_of_first_n_numbers_by_recursive_methods {
    static int sum(int a) {
        int s = 0;
        for (int i =0;i<=a;i++) {
            s += i;
        }
        return s;
    }
    // sum by recursive method
    static int sumrec(int n) {
        if (n==1) {
            return 1;
        }
        else {
            return n + sumrec(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println("The sum of first n numbers is : " + sum(4));
        System.out.println("The sum of first n numbers is : " + sumrec(4));
    }
}
