public class Zadanie20092020_5 {
// ile znakow jest w zdaniu
    public static void main(String[] args) {
        int result = countCharInString("Ala ma kota", 'a');
        System.out.println(result);

    }
    private static int countCharInString(String input, char sign){
        if (input.isEmpty()){
            return 0;
        }
        int counter = 0;

        for (int i = 0; i<= input. length(); i++) {
            if (input.charAt(i) == sign) {
                counter++;
            }
        }return counter;

    }
}
