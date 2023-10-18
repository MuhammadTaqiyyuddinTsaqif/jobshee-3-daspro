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

        System.out.print("Input the sender's name              : ");
        nama_penerima = sc.nextLine();
        System.out.print("Input sender addressc                : ");
        alamat_pengirim = sc.nextLine();
        System.out.print("Input the sender's telp number       : ");
        no_telp_pengirim = sc.nextLine();
        System.out.print("Input the sender's city of origin    : ");
        asal_kota_pengiriman = sc.nextLine();
        System.out.print("Input the recipient's name           : ");
        nama_penerima = sc.nextLine();
        System.out.print("Input the recipient's address        : ");
        alamat_penerima = sc.nextLine();
        System.out.print("Input the recipient's telp number    : ");
        no_telp_penerima = sc.nextLine();
        System.out.print("Input the delivery destination city  : ");
        kota_tujuan_pengiriman = sc.nextLine();


        System.out.println("===========================================");

        System.out.println("========= Do you need insurance? =========");

        System.out.print("Do you need insurance?");

        System.out.println("Do you need insurance?");
        input = sc.next();

        switch(input){
            case "yes":
                System.out.println("Insurance will be processed immediately");
                break;
            default:
                System.out.println("You don't use insurance");
        }

        System.out.println("===========================================");

        System.out.println("======= Do you have a member card? =======");
        input = sc.next();

        switch(input){
            case "yes":
                System.out.println("You get a shipping fee discount of 10.000");
                break;
            default:
                System.out.println("You do not get a discount on shipping costs");
                
        System.out.println("===========================================");
        
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
}