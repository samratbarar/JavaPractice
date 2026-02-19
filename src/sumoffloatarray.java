public class sumoffloatarray {
    public static void main(String[] args) {
        float [] f = {5.6f,4.5f,5.5f,5.3f,3.4f};
        float sum = 0.0f;
        for (int i=0;i<f.length;i++){
            sum += f[i];
        }
        System.out.println("The sum of these floats : " + sum);

    }
}
