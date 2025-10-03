// 12S25039 - HELEN SIMAMORA
// 12S25040 - CYNDI CYAHTI MANULLANG
import java.util.*;
import java.lang.Math;

public class JavaApplication {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int bil1, bil2, hasil, tambah, kali;

        System.out.println("Selamat Datang");
        System.out.println("Silahkan Masukkan Bilangan ke-1 dan Bilanngan ke-2");
        bil1 = Integer.parseInt(input.nextLine());
        bil2 = Integer.parseInt(input.nextLine());
        if (bil1 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama : Ganjil");
        }
        if (bil2 % 2 == 0) {
            System.out.println("Bilangan pertama: Genap");
        } else {
            System.out.println("Bilangan pertama : Ganjil");
        }
        if (bil1 > bil2) {
            System.out.println("Bilangan Pertama Lebih Besar");
        } else {
            if (bil1 < bil2) {
                System.out.println("Bilangan Kedua Lebih Besar");
            } else {
                System.out.println("Kedua Bilangan Sama Besar");
            }
        }
        if (bil1 % 2 == 0 && bil2 % 2 == 0) {
            tambah = bil1 + bil2;
            System.out.println("Bilangan 1 + Bilangan 2 =" + tambah);
        } else {
            if (bil1 % 2 != 0 && bil2 % 2 != 0) {
                kali = bil1 * bil2;
                System.out.println("Bilangan 1 * Bilangan 2 =" + kali);
            } else {
                if (bil1 % 2 == 0 && bil2 % 2 != 0) {
                    System.out.println("Merupakan Bilangan Berbeda Jenis");
                } else {
                    if (bil1 % 2 != 0 && bil2 % 2 == 0) {
                        System.out.println("Merupakan Bilangan Berbeda Jenis");
                    }
                }
            }
        }
    }
}
