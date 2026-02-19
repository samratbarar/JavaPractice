public class ar_fabonacci_series {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        for(int i =0;i<16;i++){
            System.out.print(a + ",");
            int temp =b;
            b=a+b;
            a=temp;
        }
        System.out.print("end \n");
    }
}
