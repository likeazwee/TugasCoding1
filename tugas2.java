import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan sebuah angka: ");
        angka = scanner.nextInt();
        
        while (angka != 0) {
            if (angka % 2 == 0) {
                System.out.println(angka + " adalah bilangan genap.");
            } else {
                System.out.println(angka + " adalah bilangan ganjil.");
            }
            
            System.out.print("Masukkan angka lain atau 0 untuk keluar: ");
            angka = scanner.nextInt();
        }
        
        System.out.println("Selesai.");
        scanner.close();
    }
}
