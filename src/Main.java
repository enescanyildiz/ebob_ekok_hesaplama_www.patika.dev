import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, ebob, ekok;
        System.out.print("Lütfen Birinci Tam Sayıyı Giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("Lütfen İkinci Tam Sayıyı Giriniz: ");
        sayi2 = input.nextInt();
        if (sayi1 > 0 && sayi2 > 0) {

            if (sayi1 < sayi2) {
                int a = sayi1;
                while (a >= 1) {
                    if (sayi1 % a == 0 && sayi2 % a == 0) {
                        ebob = a;
                        System.out.println(sayi1 + " sayısının ve " + sayi2 + " sayısının ebobu: " + ebob);
                        ekok = (sayi1 * sayi2) / ebob;
                        System.out.println(sayi1 + " 'sayısının ve " + sayi2 + " sayısının ekoku: " + ekok);
                        break;
                    }
                    a--;
                }
            } else {
                int a = sayi2;
                while (a >= 1) {
                    if (sayi1 % a == 0 && sayi2 % a == 0) {
                        ebob = a;
                        System.out.println(sayi1 + " 'in ve " + sayi2 + " 'nin ebobu: " + ebob);
                        ekok = (sayi1 * sayi2) / ebob;
                        System.out.println(sayi1 + " 'in ve " + sayi2 + " 'nin ekoku: " + ekok);
                        break;
                    }
                    a--;
                }
            }
        }else
        {
            System.out.println("Lütfen Pozitif Bir Tam Sayı Giriniz.");
        }
    }
}