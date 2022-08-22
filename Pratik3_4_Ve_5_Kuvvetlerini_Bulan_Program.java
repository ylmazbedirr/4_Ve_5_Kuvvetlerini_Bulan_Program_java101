import java.util.Scanner;

public class Pratik3_4_Ve_5_Kuvvetlerini_Bulan_Program {
    public static void main(String[] args) {

        int n;

        Scanner scn = new Scanner(System.in);

        System.out.print("Sayi Giriniz :");
        n = scn.nextInt();

        for (int i = 1; i <= n; i *= 4) {
            System.out.println("Dortun katlari " + i);
        }
        for (int i = 1; i <= n; i *= 5) {
            System.out.println("Besin Katlari " + i);
        }
    }
}
