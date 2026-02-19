public class replace {
    public static void main(String[] args) {
        String name = " Samrat Barar ";
        name = name.replace(' ' , '_');
        System.out.println(name);
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>" , "Samrat Barar");
        System.out.println(letter);
    }
}
