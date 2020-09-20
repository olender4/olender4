public class Zadanie20092020_8 {

    private static final int Valur_A_ASCII = 65;

    public static void main(String[] args) {

        System.out.println(replaceChars("Ala ma kota!"));

    }
    private static String replaceChars(String input){
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <input.length() ; i++) {
            char character = input.charAt(i);
            if(character>=65&& character<=90){
                result.append((char)(character+32));
            }else if(character>=97&&character<=122) {
                result.append((char) (character - 32));
            }else{
             result.append(character);
            }
        }
        return result.toString();

        }



}
