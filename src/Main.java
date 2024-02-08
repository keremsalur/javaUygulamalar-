import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int r,a;
        float alan;
        Scanner input = new Scanner(System.in);
        System.out.print("R: ");
        r = input.nextInt();
        System.out.print("A açısı: ");
        a = input.nextInt();
        alan = (3.14f * (r*r) / a ) / 360;

        System.out.println("Daire Alanı: " + alan);



    }
}