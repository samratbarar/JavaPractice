public class Pattern_by_method {
    static void pattern(int a){
        for (int i=0;i<a;i++) {
            for (int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void patternrev(int b) {
        for (int i=b;i>0;i--) {
            for (int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    static void pattrec(int c) {
        if (c>0) {
            pattrec(c-1);
            for (int i=0;i<c;i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattrecrev(int e) {
        if (e>0) {
            for (int i=0;i<e;i++) {
                System.out.print("*");
            }
            System.out.println();
            pattrecrev(e-1);
        }
    }

    public static void main(String[] args) {
        pattern(9);
        patternrev(9);
        pattrec(9);
        pattrecrev(9);
    }
}
