import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan bulan kelahiran (Dalam bentuk angka): ");
        int bulan = scanner.nextInt();
        System.out.print("Masukkan tanggal kelahiran: ");
        int hari = scanner.nextInt();

        String zodiacSign = determineZodiacSign(bulan, hari);
        System.out.println("Zodiak Anda adalah: " + zodiacSign);
    }

    public static String determineZodiacSign(int bulan, int hari) {
        String[] zodiacSigns = {
                "Capricorn", "Aquarius", "Pisces", "Aries",
                "Taurus", "Gemini", "Cancer", "Leo",
                "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn"
        };

        int[] zodiacEndDates = {
                20, 18, 20, 19, 20, 20, 22, 22, 22, 22, 21, 21
        };

        if (hari > zodiacEndDates[bulan - 1]) {
            bulan = (bulan + 1) % 12;
        }

        return zodiacSigns[bulan - 1];
    }
}
