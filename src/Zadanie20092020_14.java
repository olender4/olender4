public class Zadanie20092020_14 {

    public static void main(String[] args) {

        int arrays[] = {12, -7, 19, -5};
        int length = countNagativeDigitals(arrays);
        int[] negativeDigits = createArrayWithNagativeDigits(length, arrays);
    }
        private static int countNagativeDigitals(int[]arrays) {
        int counter = 0;
        for (int i : arrays) {
            if(i<0){
                counter++;
            }
        }
        return counter;
        }
        private static int[] createArrayWithNagativeDigits(int length, int[]arrays){
        int[] newArray = new int[length];
            for (int i = 0; i < length; i++) {
                if(arrays[i]<0){
                    newArray[i]=i;
                }
            }return newArray;
        }
}
