import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        float armut, elma, domates, muz, patlican, toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Armut kaç kilo : ");
        armut = input.nextFloat();
        System.out.print("Elma kaç kilo : ");
        elma = input.nextFloat();
        System.out.print("Domates kaç kilo : ");
        domates = input.nextFloat();
        System.out.print("Muz kaç kilo : ");
        muz = input.nextFloat();
        System.out.print("Patlican kaç kilo : ");
        patlican = input.nextFloat();

        toplam = (armut * 2.14f) + (elma * 3.67f) + (domates * 1.1f) + (muz * 0.95f) + (patlican * 5.0f);

        System.out.println("Toplam: " + toplam);

    }
}