public class day20092020 {
    public static void main(String[] args) {
        // program do wyswietlania tabliczki mnozenia

        int x,y;
        for (x =1; x<=10;  x++){
            for (y=1; y<=10; y++){
                System.out.print(x*y + "\t");
                // "\t" ustawia nam rowno kolumny
            }
            System.out.println();}

    }
}
