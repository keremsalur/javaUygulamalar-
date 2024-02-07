import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        // 6
        int urunFiyati;
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Giriniz: ");
        urunFiyati = input.nextInt();
        float kdvliFiyat = urunFiyati * ((urunFiyati <= 1000)?1.18f:1.08f);
        System.out.println("Kdvli ürün fiyatı: " + kdvliFiyat);



    }
}