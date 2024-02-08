import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        int kilo;
        float vki,boy;
        Scanner input = new Scanner(System.in);
        System.out.print("Boy (m) : ");
        boy = input.nextFloat();
        System.out.print("Kilo: ");
        kilo = input.nextInt();
        vki = (float) kilo * boy / boy;

        System.out.println("Vücut kitle indexi: " + vki);



    }
}