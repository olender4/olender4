import java.util.Scanner;

public class MatematykaLogiczna {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x ");
        int x = scanner.nextInt();

        System.out.println("Podaj y");
        int y = scanner.nextInt();

        boolean result;

        result = x>y? true : false;
                //sprawdza czy wyrazenie jest prawdziwe czy nie
        // operator true : false operator trojargumentowy
        System.out.println("if x greater than y "+ result);

        result = (x*3)>y? true : false;
        System.out.println("If x3 greather than y " + result);

        result = ((x++>y++)&& (--x<y++))? true :false;
        System.out.println("" + result);

        result = (x*y)%2 == 0;
        System.out.println("" + result);

    }
}
