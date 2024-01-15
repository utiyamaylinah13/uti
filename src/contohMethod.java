import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class contohMethod {
    public static void main(String[] args) throws IOException {
        // pemjumlahan dua angka
        CetakJudul();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("masukan angka : ");
        int angka1 = Integer.parseInt(reader.readLine());
        System.out.println("masukan angka 2:");
        int angka2 = Integer.parseInt((reader.readLine()));
        System.out.println(angka1+angka2);

        System.out.println("Hitung penjumlahan dua angka menggunakan method");
        JumlahDuaAngka();
    }
    private static void CetakJudul(){
        System.out.println("contoh perjumlahan dua angka TANPA menggunakan method");
    }
    private static void JumlahDuaAngka() throws IOException {
    BufferedReader baca = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("masukan number1 : ");
        int number1 = Integer.parseInt(baca.readLine());
        System.out.println("masukan number2 : ");
        int number2 = Integer.parseInt((baca.readLine()));
        System.out.println(number1+number2);
    }
}

