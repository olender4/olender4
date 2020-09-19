import java.util.Scanner;

public class Srednicakola {

    private final static float PI= 3.14f;
    //final nie można nadpisac

    public static void main(String[] args) {
        float diameter= getDiameterFromUser();

        float circumference = calculateCirmeference(diameter);
        System.out.println("Circumference Of A Circle " + circumference);
        float area = calculateArea(diameter);
        System.out.println("Firld of A area " + area);
    }
        private static float getDiameterFromUser() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please insert diameter: ");
            return scanner.nextFloat();
            //od razu zwraca wczytaną daną
        }
        private static float calculateCirmeference(float diameter){
        //pi*d
            return PI*diameter;
            // zwraca mi calculateCir
        }
        private static float calculateArea(float diameter){
        float radius = diameter/2;
        return PI * (float)Math.pow(radius, 2);

        }



    //private static void pole() {
      //  pole=Math.PI*(srednica/2)


}
