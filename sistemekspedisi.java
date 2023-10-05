import java.util.Scanner;

public class sistemekspedisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String nama_penerima, alamat_penerima, no_telp_penerima, nama_pengirim, alamat_pengirim, no_telp_pengirim, asal_kota_pengiriman, kota_tujuan_pengiriman, input;
        double harga, panjang, berat, tinggi, lebar, jarak, total, tarifper20km,harga2,harga3, nilai_barang;
        boolean asuransi = true, member =true , cod = true ;
        
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
        System.out.print("kota tujuan pengiriman : ");
        kota_tujuan_pengiriman = sc.nextLine();
        System.out.println("nilai barang :");
      //  nilai_barang = sc.nextLine();
    
        //about price
        //if
        tarifper20km= 15000;
        harga = tarifper20km;
        harga2 = harga*0.1 + (tarifper20km);
        System.out.println( "harga" +harga);
        
        /*if (asuransi ) {
            total = harga + (harga*0.02) + (nilai_barang * 0.01);
        } else {
            total = harga;
        }*/

<<<<<<< HEAD
    /*  System.out.print("Do you need insurance?");
=======
        System.out.println("Do you need insurance?");
>>>>>>> a7989714fb9446bf5d6b5280a68ad3345d4173a7
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

<<<<<<< HEAD
    /*  switch(input){
            case "Yes":
=======
        switch(input){
            case "yes":
>>>>>>> a7989714fb9446bf5d6b5280a68ad3345d4173a7
                System.out.println("You get a shipping fee discount of 10.000");
                break;
            case "no":
                System.out.println("You don't use insurance");
            default:
                System.out.println("You do not get a discount on shipping costs");
            /*  LocalTime currentTime = LocalTime.now();

<<<<<<< HEAD
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
=======
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);
>>>>>>> 59015d420d80988e1cd51d229f2422280689506e

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
        System.out.println("Year: " + currentYear); */
    
        }

}
