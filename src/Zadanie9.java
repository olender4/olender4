public class Zadanie9 {
    public static void main(String[] args) {

        for (int i = 0; i < 100; i ++) {
            System.out.println(fizzbus(i));
        }
    }

     private static String fizzbus(int number){
        if (number%15 == 0){
            return "FizzBuzz";
        }else if(number%3==0){
            return "Fizz";
        }else if (number%5 ==0){
            return "Buzz";
        }
        return String.valueOf(number);


    }
}
