import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Kombinasyon Formül : C(n,r) = n! / (r! * (n-r)!)

        Scanner scan = new Scanner(System.in);
        int n, r, sonuc;


        System.out.println("C(n,r)");
        System.out.print("n giriniz : ");
        n = scan.nextInt();
        System.out.print("r giriniz : ");
        r = scan.nextInt();

        sonuc = faktoriyelHesapla(n) / (faktoriyelHesapla(r) * faktoriyelHesapla(n - r));
        System.out.println("C(" + n + "," + r + ") : " + sonuc);

    }

    static int faktoriyelHesapla(int x) {
        int fak = 1;
        for (int i = 1; i <= x; i++) {
            fak *= i;
        }
        return fak;
    }

}
