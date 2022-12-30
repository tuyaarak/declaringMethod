import java.util.Scanner;
public class Main {
    public static String exit(String string) {
        if (string.length() < 5) {
            return "Small string";
        } else {
            // превращенаем int в String
            String length2 = String.valueOf(string.length());
            // превращаем String в nt
            int length3 = Integer.parseInt(length2);
            return  length2;
        }

    }
        public static void main(String[] args) {
        
        String result = exit("exit");
        System.out.println(result);
    }
}