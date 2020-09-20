import java.sql.SQLOutput;

public class Day20092020_2 {

    public static void main(String[] args) {

        System.out.println(ifWordContainsPrefix("programowanie", "pro"));
        System.out.println(ifWordContainsPrefix("programowanie", "pro1"));

        System.out.println();

        System.out.println(ifWordContainsSuffix("programowanie", "nie"));
        System.out.println(ifWordContainsSuffix("programowanie", "pro1"));

    }

    private static boolean ifWordContainsPrefix(String input, String prefix){
            return input.startsWith(prefix);
        }

        private static boolean ifWordContainsSuffix(String input, String suffix){
        return input.endsWith(suffix);
        }
}
