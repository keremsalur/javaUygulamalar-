import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        float fiyat,km;
        Scanner input = new Scanner(System.in);
        System.out.print("Yolculuk kaç km olacak: ");
        km = input.nextFloat();
        fiyat = 10 + (km * 2.2f);
        fiyat = (fiyat < 20) ? 20 : fiyat;
        System.out.println("Taksi Ücreti: " + fiyat);



    }
}