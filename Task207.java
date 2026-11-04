import java.util.Scanner;

public class Task207 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();

        if (n < 3) {
            System.out.println("n must be at least 3.");
        } else {
            int sum = 0;

            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {    //col merupakan variabel penghitung (counter) yang digunakan untuk mengatur jumlah kolom atau berapa kali perintah dijalankan.
                    int result = row * col;
                    System.out.printf("%55d", result);   //%4d digunakan untuk mengatur lebar tempat (spacing) saat menampilkan angka integer menggunakan printf().
                    sum += result;
                }
                System.out.println();
            }

            System.out.println("Total of all numbers: " + sum);
        }

        sc.close();
    }
}
//Kesimpulannya:
//- int sum = 0; → membuat variabel penampung total dengan nilai awal 0.
//- sum += result; → menambahkan setiap hasil perkalian ke total.
//- System.out.println("Total of all numbers: " + sum); → menampilkan hasil penjumlahan seluruh angka.
//Jadi, fungsi sum adalah menghitung total dari semua hasil perkalian dalam nested loop (perulangan bersarang).