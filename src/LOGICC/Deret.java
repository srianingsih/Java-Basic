package LOGICC;

public class Deret {
    public static void main(String[] args) {
        soal01(9);
        soal02( 9);
        soal03(9);
        soal04(9);
        soal06(9);
        soal08(9);
        soal09(9);
        soal10(9);

    }

    public static void soal01(int n) {
        int[] deret = new int[n];

        for (int a = 1; a <= n; a++) {
            System.out.print(a + "\t\t");
        }
        System.out.println();
    }

    public static void soal02(int n) {
        int hasil = 0;
        int akhir = 0;
        int[] deret = new int[n];
        for (int b = 0; b < deret.length; b++){
            if(b % 2 == 0){
                if(b == 0){
                    hasil = 1;
                    System.out.print(hasil+"\t\t");
                }else{
                    System.out.print(hasil+"\t\t");
                }
            }else{
                akhir = hasil *3;
                System.out.print(akhir+"\t\t");
                hasil = akhir - b;
            }
        }
        System.out.println();
    }

    public static void soal03(int n) {
        int[] deret = new int[n];
        int baris = 16;
        for (int x = n; x <= n; x++) {
            for (int p = 0; p<= baris; p+=2) {
                System.out.print(p + "\t\t");
            }
        }
//        for (int a = 0; a <= n; a++) {
//            System.out.print(a + "\t\t");
//            a+=2;
//        }
        System.out.println();
    }

    public static void soal04(int n) {
        int[] deret = new int[n];

        for (int d = 0; d < deret.length; d++){
            if(d == 0 || d == 1){
                deret[d] = 1;
            }else {
                deret[d] = deret[d-1] + deret[d-2];
            }
            System.out.print(deret[d] + "\t\t");
        }
        System.out.println();
    }

    public static void soal06(int n) {
        int[] deret = new int[n];
        int a = 0;

        for (int i=0; i<= 99; i++){
            int bil=0;
            for (int j=1;j<=i;j++){
                if (i%j==0){
                    bil=bil+1;
                }
            }
            if (bil==2){
                a+=1;
                if(a <= deret.length){
                    System.out.print(i+"\t\t");
                }else{
                    i=99;
                }

            }
        }System.out.println();
    }
    public static void soal08(int n){
        String[] deret = new String[n];
        char huruf = 'A';
        int angka = 2;
        // isi array
        for (int i = 0; i < n; i++) {
            // genap dulu
            if(i % 2 == 0){
                deret[i] = String.valueOf(huruf);
            }else {
                deret[i] = String.valueOf(angka);
                angka+=2;
            }
            huruf++;
        }

        // print array
        PrintArray.print(deret);
    }

    public static void soal09(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(3,i);
        }

        // print array
        PrintArray.print(deret);
    }

    public static void soal10(int n){
        int[] deret = new int[n];
        for (int i = 0; i < n; i++) {
            deret[i] = (int)Math.pow(i,3);
        }

        // print array
        PrintArray.print(deret);
    }
}






