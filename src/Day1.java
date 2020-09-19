public class Day1 {

    public static void main(String[] args) {
        displayWord();
        displayWordInHexFormat();

    }
    private static void displayWord(){
        //private używamy tylko my
        //static nie musimy tworzyc obiektu
        //void nic niezwracamy

        char s =0x53;
        char d =0x44;
        char a =0x41;

        System.out.println(s);
        System.out.println(d);
        System.out.println(a);

    }

    private static void displayWordInHexFormat(){
        char s1 = 0b01010011;
        char d1 = 0b01000100;
        char a1 = 0b01000001;

        System.out.println(s1);
        System.out.println(d1);
        System.out.println(a1);
    }
}
//zadanie stworzyć metodę która wypuszczała bby okreslone kody - decy,binare, hexy
//metody try, catch, finally, dobre przy niewelowaniu bledu przy wprowadzaniu danych z klawiatury np zamiast litery cyfra