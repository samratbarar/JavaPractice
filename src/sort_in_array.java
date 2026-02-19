public class sort_in_array {
    public static void main(String[] args) {
        int[] sort = {1,2,3,4,5,6,7};
        int l = sort.length-1;
        boolean r = true;
        for (int i = 0;i<l;i++) {
            if (sort[i+1] < sort[i]) {
                r = false;
                break;
            }
        }
        if (r) {
            System.out.println("The Array is sorted");
        }
        else {
            System.out.println("The Array is not sorted");
        }
    }
}
