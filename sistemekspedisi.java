import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, alamat_penerima, no_hp_penerima, nama_pengirim, alamat_pengirim, no_hp_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman;
        double harga, panjang, berat, tinggi, lebar, jarak;
        
        System.out.print("input nama pengirim : ");
        nama_penerima = sc.nextLine();
        System.out.print("input alamat pengirim : ");
        alamat_pengirim = sc.nextLine();
        System.out.print("input no pengirim : ");
        no_hp_pengirim = sc.nextLine();
        System.out.print("input asal kota pengiriman : ");
        asal_kota_pengiriman = sc.nextLine();
        System.out.print("input nama penerima : ");
        nama_penerima = sc.nextLine();
        System.out.print("input alamat penerima : ");
        alamat_penerima = sc.nextLine();
        System.out.print("input no penerima : ");
        no_hp_penerima = sc.nextLine();
        System.out.print("input kota tujuan pengiriman : ");
        kota_tujuan_pengiriman = sc.nextLine();

        String input;

        Scanner scan = new Scanner(System.in);

        System.out.println("Do you need insurance ?");
        input = scan.next();

        switch(input){
            case "Yes":
                System.out.println("Insurance will be processed immediately");
                break;
            default:
                System.out.println(input + "anda tidak menggunakan asuransi" );
        }


}
}