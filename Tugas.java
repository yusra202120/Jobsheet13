import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // String mahasiswa [] = {"Sari", "Rina", "Yani", "Dwi", "Lusi"};
        
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = input.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = input.nextInt();

        int[][] nilai = new int[jumlahMahasiswa][jumlahTugas];
        // int nilai [][] = new int[5][7];
        int inputNilai[][] = inputNilai(nilai);
        // showNilai(inputNilai, mahasiswa);
        showNilai(inputNilai);
        System.out.println("Minggu nilai tertinggi adalah "+ cariMingguNilaiTertinggi(inputNilai));
        // tampilkanMahasiswaNilaiTertinggi(inputNilai, mahasiswa);
        tampilkanMahasiswaNilaiTertinggi(inputNilai);
    }

    public static int[][] inputNilai(int[][] nilai){
        Scanner input = new Scanner(System.in);
        for(int i=0; i<nilai.length; i++ ){
            System.out.println("Nilai mahasiswa ke "+(i+1)+": ");
            for(int j=0; j<nilai[i].length; j++ ){
                System.out.print("   Masukkan Nilai minggu ke - "+(j+1)+ ": ");
                nilai[i][j] = input.nextInt();
            }
            System.out.println();
        }
        return nilai;
    } 

    public static void showNilai(int[][] nilai){
        for(int i=0; i<nilai.length; i++ ){
            System.out.println("Nilai Mahasiswa ke"+(i+1)+": ");
            for(int j=0; j<nilai[i].length; j++ ){
                System.out.println("   Nilai Mahasiswa ke- "+(i+1)+" minggu ke -"+(j+1)+ ": " + nilai[i][j]);
            }
            System.out.println();
        }
    }

    public static int cariMingguNilaiTertinggi(int[][] nilai) {
        int nilaiTertinggi = nilai[0][0];
        int mingguNilaiTertinggi = 1;
    
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }
    
        return mingguNilaiTertinggi;
    }

    public static void tampilkanMahasiswaNilaiTertinggi(int[][] nilai) {
        int nilaiTertinggi = nilai[0][0];
        int mahasiswaNilaiTertinggi = 0;
        int mingguNilaiTertinggi = 1;
    
        for (int i = 0; i < nilai.length; i++) {
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mahasiswaNilaiTertinggi = i;
                    mingguNilaiTertinggi = j + 1;
                }
            }
        }
    
        System.out.println("Mahasiswa dengan nilai tertinggi adalah mahasiswa ke-  " + mahasiswaNilaiTertinggi + " dengan nilai " + nilaiTertinggi + " pada minggu ke-" + mingguNilaiTertinggi);
    }
}