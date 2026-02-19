public class Celsius_into_feh_methods {
    static float con(float c) {
        float a = c * 1.8f + 32.0f;
        return a;
    }
    public static void main(String[] args) {
        float b = con(6);
        System.out.println(b);
    }
}
