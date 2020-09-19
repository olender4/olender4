public class Zadanie8 {

    public static void main(String[] args) {

        //metoda ma przyjac dwa argumenty
        //liczby pierwsze

        boolean resoult = isPrimeNumber(5);
        System.out.println("If digit is prime: " + resoult);
    }

    private static boolean isPrimeNumber(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0)
                return false; }
        return true;
    }
}
