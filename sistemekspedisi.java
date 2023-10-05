import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, alamat_penerima, no_telp_penerima, nama_pengirim, alamat_pengirim, no_telp_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman, input;
        double harga, panjang, berat, tinggi, lebar, jarak;
        
        System.out.print("input nama pengirim : ");
        nama_penerima = sc.nextLine();
        System.out.print("input alamat pengirim : ");
        alamat_pengirim = sc.nextLine();
        System.out.print("input no telp pengirim : ");
        no_telp_pengirim = sc.nextLine();
        System.out.print("input asal kota pengiriman : ");
        asal_kota_pengiriman = sc.nextLine();
        System.out.print("input nama penerima : ");
        nama_penerima = sc.nextLine();
        System.out.print("input alamat penerima : ");
        alamat_penerima = sc.nextLine();
        System.out.print("input no telp penerima : ");
        no_telp_penerima = sc.nextLine();
        System.out.print("input kota tujuan pengiriman : ");
        kota_tujuan_pengiriman = sc.nextLine();

        System.out.println("Do you need insurance?");
        input = sc.next();

        switch(input){
            case "yes":
                System.out.println("Insurance will be processed immediately");
                break;
            case "no":
                System.out.println("You don't use insurance");
                break;
            default:
                System.out.println("You don't use insurance");
        }

        System.out.println("Do you have a member card?");
        input = sc.next();

        switch(input){
            case "yes":
                System.out.println("You get a shipping fee discount of 10.000");
                break;
            case "no":
                System.out.println("You don't use insurance");
            default:
                System.out.println("You do not get a discount on shipping costs");
                LocalTime currentTime = LocalTime.now();

        int total, diskon, bayar;
        String ongkos_kirim;
                System.out.print("apakah ongkos kirim mencapai 100 ribu (y atau t) ? ");
                ongkos_kirim = sc.nextLine();
                System.out.print("berapa total ongkos kirim pelanggan? ribu ");
                total = sc.nextInt();
                if (ongkos_kirim.equals("y")) {
                    if (total > 100000) {
                        diskon = 20000;
                    } else {
                        diskon = 15000;
                    }
                } else {
                    if (total > 50000) {
                        diskon = 10000;
                    } else {
                        diskon = 0;
                    }
                }
                bayar = total - diskon;
                System.out.println("total yang harus dibayar: ribu" + bayar);


        // Define a custom time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format and print the current time
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted current time: " + formattedTime);
        }

}
}