import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BelajarArray {

    public static void main(String[] args) {
        int[] angkasaya = new int[4];
        // mengisi value ke dalam integer array angkasaya
        angkasaya[0] = 4;
        angkasaya[1] = 5;
        angkasaya[2] = 9;
        angkasaya[3] = 14;

        // cetak ke layar isi dari integer array angkasaya yang ke 1 (index=1)
        System.out.println(angkasaya[1]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("masukan jumlah data yang diimput : ");
        int jum_data = Integer.parseInt(reader.readLine());//mialyang diimput 3 --> jum_data = 3
        String[] nama = new String[jum_data];

        for (int indexsaya = 0; indexsaya < nama.length; indexsaya++){
            System.out.println("Masukan nama yang ke - " + (indexsaya + 1) + "=");
            String nama_input = reader.readLine();
            nama[indexsaya] = nama_input;
        }
        for (int awal = 0; awal < nama.length; awal++){
            System.out.println("Data Nama Yang Ke - " + (awal + 1) + ":");
            System.out.println("Nama : " + nama[awal]);
       }

    }

    }
