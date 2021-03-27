package projectUts;
import java.util.Scanner;

public class Main {

    // method yg berisikan headerProgram
    static void headerProgram() {
        System.out.println("===========================================================");
        System.out.println("|                     PROGRAM BANGUN DATAR                |");
        System.out.println("===========================================================\n");
    }

    // method yg berisikan daftarMenu
    static void listMenu(){
        System.out.println("Daftar Bangun Datar");
        System.out.println("\t1. Persegi");
        System.out.println("\t2. Persegi Panjang");
        System.out.println("\t3. Jajar Genjang");
        System.out.println("\t4. Layang-Layang");
        System.out.println("\t5. Trapsium");
        System.out.println("\t6. Exit");
    }

    // main
    public static void main(String[] args) {
        int menu;

        //memanggil method yang masih dalam satu classs
        headerProgram();
        listMenu();

        System.out.print("Masukan pilihan anda : ");
        Scanner keyboard = new Scanner(System.in); //pembuatan objek keyboard
        menu = keyboard.nextInt();  // proses input berupa int
        System.out.println("-----------------------------------------------------------\n");

        // pemilihan menggunkan switch
        switch(menu) {
            case 1:
                System.out.println("Penjelasan Bangun Datar yang Diplih");
                Persegi persegi = new Persegi("Persegi", 4, 4, 4, 4); // membuat objek persegi dan memasukan nilai artibut
                persegi.display(); //pemanggilan objek
                break;
            case 2:
                System.out.println("Penjelasan Bangun Datar yang Diplih");
                PersegiPanjang persegiPanjang = new PersegiPanjang("Persegi Panjang",4,4,2, 2); // membuat objek persegiPanjang dan memasukan nilai artibut
                persegiPanjang.display(); //pemanggilan objek
                break;
            case 3:
                System.out.println("Penjelasan Bangun Datar yang Diplih");
                JajarGenjang jajarGenjang = new JajarGenjang("Jajar Genjang",4,4,0, 2); // membuat objek jajarGenjang dan memasukan nilai artibut
                jajarGenjang.display(); //pemanggilan objek
                break;
            case 4:
                System.out.println("Penjelasan Bangun Datar yang Diplih");
                LayangLayang layangLayang = new LayangLayang("Layang-Layang",4,4,1, 0);  // membuat objek layangLayang dan memasukan nilai artibut
                layangLayang.display(); //pemanggilan objek
                break;
            case 5:
                System.out.println("Penjelasan Bangun Datar yang Diplih");
                Trapesium trapesium = new Trapesium("Trapesium",4,4,1, 0); //  // membuat objek Trapesium dan memasukan nilai artibut
                trapesium.display(); //pemanggilan objek
                break;
            case 6:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Pilihan menu tidak ada");
                break;
        }
    }
}
