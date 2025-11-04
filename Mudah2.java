import java.util.Scanner;

public class Mudah2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Bilangan: ");
        int Bilangan = input.nextInt();
        if (Bilangan % 2 == 0) {
            System.out.println("Bilangan Genap");
        } else {
            System.out.println("Bilangan Ganjil");
        }
    }

}
