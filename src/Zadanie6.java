public class Zadanie6 {
    public static void main(String[] args) {
        printMultiplication(6,0,5);
    }
    private static void printMultiplication(int multiplier, int minMultiplicand, int maxMulticand){
        for(;minMultiplicand<=maxMulticand;minMultiplicand++)
        //";" możemy ominąć przy for(;
        {
            int result = multiplier * minMultiplicand;
            System.out.println(multiplier+"*" +minMultiplicand+"="+result);
        }
    }

}
