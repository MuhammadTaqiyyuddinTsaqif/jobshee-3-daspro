import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, alamat_penerima, no_telp_penerima, nama_pengirim, alamat_pengirim, no_telp_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman, input;
        double harga, panjang, berat, tinggi, lebar, jarak ,zonasi;
        
         System.out.println("               _                          ");
        System.out.println(" __      _____| | ___ ___  _ __ ___   ___ ");
        System.out.println(" \\ \\ /\\ / / _ \\ |/ __/ _ \\| '_ ` _ \\ / _ \\");
        System.out.println("  \\ V  V /  __/ | (_| (_) | | | | | |  __/");
        System.out.println("   \\_/\\_/ \\___|_|\\___\\___/|_| |_| |_|\\___|");
        System.out.println("                                          ");

        System.out.println("                _                              _ _     _ ");
        System.out.println("               | |                            | (_)   (_)");
        System.out.println("  _ ____      _| |_    _____  ___ __   ___  __| |_ ___ _ ");
        System.out.println(" | '__\\ \\ /\\ / / __|  / _ \\ \\/ / '_ \\ / _ \\/ _` | / __| |");
        System.out.println(" | |   \\ V  V /| |_  |  __/>  <| |_) |  __/ (_| | \\__ \\ |");
        System.out.println(" |_|    \\_/\\_/  \\__|  \\___/_/\\_\\ .__/ \\___|\\__,_|_|___/_");
        System.out.println("                               | |                       ");
        System.out.println("                               |_|                       ");
        
        
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
        

        //if
        System.out.print("Do you need insurance?");
        input = sc.next();

        switch(input){
            case "Yes":
                System.out.println("Insurance will be processed immediately");
                break;
            default:


                System.out.println(input + " anda tidak menggunakan asuransi" );

                System.out.println("You don't use insurance");
                System.out.print("You don't use insurance");
        }

        System.out.println("Do you have a member card?");
        input = sc.next();

        switch(input){
            case "Yes":
                System.out.println("You get a shipping fee discount of 10.000");
                break;
            default:
                System.out.println("You do not get a discount on shipping costs");
                LocalTime currentTime = LocalTime.now();

        // Define a custom time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");

        // Format and print the current time
        String formattedTime = currentTime.format(formatter);
        System.out.println("Formatted current time: " + formattedTime);
        }

}
}