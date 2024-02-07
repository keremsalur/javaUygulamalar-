import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        // 6
        float ort = 0.0f;
        Scanner input = new Scanner(System.in);
        System.out.println("Matematik Puanınız:");
        ort += input.nextInt();

        System.out.println("Fizik Puanınız:");
        ort += input.nextInt();

        System.out.println("Kimya Puanınız:");
        ort += input.nextInt();

        System.out.println("Türkçe Puanınız:");
        ort += input.nextInt();

        System.out.println("Tarih Puanınız:");
        ort += input.nextInt();

        System.out.println("Müzik Puanınız:");
        ort += input.nextInt();

        ort /= 6;
        System.out.println("Ortalamanız " + ort + ((ort < 60.0f)?" Kaldınız":" Geçtiniz"));




    }
}