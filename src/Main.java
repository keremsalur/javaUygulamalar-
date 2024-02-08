import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        // 6
        int a,b,c;
        float u,alan;
        Scanner input = new Scanner(System.in);
        System.out.print("A kenarını girin: ");
        a = input.nextInt();
        System.out.print("B kenarını girin: ");
        b = input.nextInt();
        System.out.print("C kenarını girin: ");
        c = input.nextInt();
        u = (a + b + c) / 2.0f;
        alan = u * (u - a) * (u - b) * (u - c);
        alan = (float) Math.sqrt(alan);

        System.out.println("Üçgenin alanı: " + alan);



    }
}