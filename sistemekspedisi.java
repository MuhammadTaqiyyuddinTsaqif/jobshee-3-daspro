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

        System.out.print("Do you need insurance?");
        input = sc.next();

        switch(input){
            case "Yes":
                System.out.println("Insurance will be processed immediately");
                break;
            default:
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
        }
}
}