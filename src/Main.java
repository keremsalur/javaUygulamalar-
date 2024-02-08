import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        float sayi1,sayi2;
        int islem;
        Scanner input = new Scanner(System.in);
        System.out.print("1. sayi: ");
        sayi1 = input.nextFloat();
        System.out.print("2. sayi: ");
        sayi2 = input.nextFloat();

        System.out.println("Toplaman için 1\nÇıkarma için 2\nBölme için 3\nÇarpma için 4");
        islem = input.nextInt();
        switch (islem){
            case 1:
                System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1-sayi2));
                break;
            case 3:
                if(sayi2 == 0) System.out.println("2. Sayi 0 olamaz!");
                else System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1/sayi2));
                break;
            case 4:
                System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1*sayi2));
                break;
        }


    }
}