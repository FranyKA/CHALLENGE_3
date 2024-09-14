import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("panjang: ");
        int panjang = scanner.nextInt();
        System.out.print("lebar: ");
        int lebar = scanner.nextInt();

        for (int i = 0; i < lebar; i++) {
            for (int j = 0; j < panjang; j++) { 
                System.out.print("*"); 
            }
            System.out.println();
        }
        System.out.println("Luas = " + Luas( lebar, panjang));
        System.out.println("Keliling = " + Keliling( lebar, panjang));
    }
    private static int Luas( int lebar, int panjang){
        int Luas = lebar * panjang;
        return Luas;
    }
    private static int Keliling( int lebar, int panjang){
        int hasil = 2 * (lebar + panjang);
        return hasil;
    }
}
