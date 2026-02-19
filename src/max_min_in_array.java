public class max_min_in_array {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7};
        int max = Integer.MIN_VALUE;
        for (int e:a) {
            if (e>max) {
                max = e;
            }
        }
        System.out.println("THe Maximum value of integer in array is : " + max);
        int min = Integer.MAX_VALUE;
        for (int e:a) {
            if (e<min) {
                min = e;
            }
        }
        System.out.println("THe Manimum value of integer in array is : " + min);
    }
}
