package projectahir;
import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, alamat_penerima, no_telp_penerima, nama_pengirim, alamat_pengirim, no_telp_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman, input;
        double harga, panjang, berat, tinggi, lebar, jarak, total, tarifper20km,harga2,harga3, nilai_barang;
        boolean asuransi = true, member =true , cod = true ;

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
        System.out.println("nilai barang :");
        nilai_barang = sc.nextDouble();
    
        //about price
        //if
        tarifper20km= 15000;
        harga = tarifper20km;
        harga2 = harga*0.1 + (tarifper20km);
        System.out.println( "harga" +harga);
        
        if (asuransi ) {
            total = harga + (harga*0.02) + (nilai_barang * 0.01);
        } else {
            total = harga;
        }   System.out.println("harga total :" + total);

    /*System.out.print("Do you need insurance?");
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

        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Get the current time
        //LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Get the current day of the week
        DayOfWeek currentDayOfWeek = currentDate.getDayOfWeek();
        System.out.println("Day of the Week: " + currentDayOfWeek);

        // Get the current month
        Month currentMonth = currentDate.getMonth();
        System.out.println("Month: " + currentMonth);

        // Get the current year
        int currentYear = currentDate.getYear();
        System.out.println("Year: " + currentYear);*/
    
        }

}
