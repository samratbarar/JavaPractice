public class Average_arguments {
    static float aver(float ...a) {
        float sum = 0.0f;
        for (int i = 0; i<a.length;i++) {
            sum+= a[i];
        }
        float l = a.length;
        return sum / l;
    }

    public static void main(String[] args) {
        float c = aver(2,3,4,5,6,7,8,1);
        System.out.println(c);
    }
}
