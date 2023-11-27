import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, no_telp_penerima, alamat_penerima, nama_pengirim, no_telp_pengirim, alamat_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman, input;
        double harga, panjang, berat, tinggi, lebar, jarak;
        boolean asuransi , member, cod, reguler, expres;

        System.out.println("======= WELCOME TO RUWET EXPEDITION =======");

        System.out.println("Lengkapi data berikut dengan benar!");
        System.out.print("Nama pengirim          : ");
        nama_penerima = sc.nextLine();
        System.out.print("Alamat pengirim        : ");
        alamat_pengirim = sc.nextLine();
        System.out.print("Asal kota pengiriman   : ");
        asal_kota_pengiriman = sc.nextLine();
        System.out.print("No. telp pengirim      : ");
        no_telp_pengirim = sc.nextLine();
        System.out.print("Nama penerima          : ");
        nama_penerima = sc.nextLine();
        System.out.print("Alamat penerima        : ");
        alamat_penerima = sc.nextLine();
        System.out.print("Kota tujuan pengiriman : ");
        kota_tujuan_pengiriman = sc.nextLine();
        System.out.print("No. telp penerima      : ");
        no_telp_penerima = sc.nextLine();

        System.out.println();
        System.out.println("===========================================");
        System.out.println();

        System.out.print("Apakah Anda memiliki member card? (ya/tidak): ");
        String memilikiMemberCard = sc.nextLine();

        if (memilikiMemberCard.equalsIgnoreCase("ya")) {
            // Jika memiliki member card
            System.out.println("Selamat! Estimasi pengiriman paket kurang dari 3 hari.");
            // Lakukan operasi atau tindakan lainnya untuk anggota dengan kartu
        } else if (memilikiMemberCard.equalsIgnoreCase("tidak")) {
            // Jika tidak memiliki member card
            System.out.println("Maaf, Estimasi pengiriman paket lebih dari 3 hari.");
            // Lakukan operasi atau tindakan lainnya untuk non-anggota kartu
        } else {
            // Jika jawaban tidak valid
            System.out.println("Masukkan jawaban yang valid (ya/tidak).");
        }
        System.out.println();
        System.out.println("==========================================="); 
        System.out.println();

        // Menentukan jumlah paket
        System.out.print("Masukkan jumlah paket: ");
        int jumlahPaket = sc.nextInt();

        // Inisialisasi array untuk menyimpan informasi paket
        String[] tujuanPaket = new String[jumlahPaket];
        double[] beratPaket = new double[jumlahPaket];
        double[] biayaPaket = new double[jumlahPaket];

        // Memasukkan informasi paket
        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("\nMasukkan informasi paket ke-" + (i + 1));
            System.out.print("Kota tujuan paket: ");
            tujuanPaket[i] = sc.next();

            System.out.print("Berat paket (kg): ");
            beratPaket[i] = sc.nextDouble();

            // Misalnya, biaya pengiriman adalah Rp5000 per kilogram
            biayaPaket[i] = 5000 * beratPaket[i];
        }
           System.out.println();
           System.out.println("==========================================="); 
           System.out.println();

        // Menampilkan informasi paket
        System.out.println("\nInformasi Paket:");

        for (int i = 0; i < jumlahPaket; i++) {
            System.out.println("Paket ke-" + (i + 1));
            System.out.println("Tujuan: " + tujuanPaket[i]);
            System.out.println("Berat: " + beratPaket[i] + " kg");
            System.out.println("Biaya: Rp" + biayaPaket[i]);
            System.out.println("---------------------------");
        }
        sc.close();

        LocalTime currentTime = LocalTime.now();

        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date    : " + currentDate);

        // Get the current time
        //LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time    : " + currentTime);

        // Get the current day of the week
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day of the Week : " + currentDayOfWeek);

        // Get the current month
        Month currentMonth = currentDate.getMonth();
        System.out.println("Month           : " + currentMonth);

        // Get the current year
        int currentYear = currentDate.getYear();
        System.out.println("Year            : " + currentYear);
    
    }
}