public class fibonacci_series {
    static void series(int x) {
        int[] a= new int[5000];
        a[0]=0;
        a[1]=1;
        for (int i = 0; i>=0 && i<x;i++) {
            a[i+2] = a[i] + a[i+1];
            System.out.format("%d, ",a[i]);
        }
        System.out.print("end \n");
    }
    static int serbyrec(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        }
        else {
            return serbyrec(n - 2) + serbyrec(n - 1);
        }
    }
//        if (n==1) {
//            return 0;
//        }
//        else if (n==2) {
//            return 1;
//        }

    public static void main (String[]args){
        series(7);
        int c = serbyrec(7);
        System.out.println(c);
        }
}