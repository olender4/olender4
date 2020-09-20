public class Zadanie20092020_4 {

    public static void main(String[] args) {
        //metoda zamienia w stringu

        replaceAndPrintString("Ala.ma.kota,");
    }
    private static void replaceAndPrintString(String input){
        String result = input.replace(",","-STOP-").replace(".","-STOP-");
        System.out.println("New text: " + result);


    }
}
