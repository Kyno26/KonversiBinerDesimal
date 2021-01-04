import java.util.Scanner;

/**
 *
 * @author Suisei
 */
public class BinerDecimal {
        void decimalToBiner(int a) {
        if (a > 1) {
            decimalToBiner(a / 2);
        }
        System.out.print(a % 2);
    }
    
    String binerToDecimal(String bilangan) {
        String[] binerReverse = new String[bilangan.length()];
        double resultDecimal = 0;
        
        //reverse
        int n = 0;
        for (int i = bilangan.length() - 1; i >= 0; i--) {
            binerReverse[n] = String.valueOf(bilangan.charAt(i));
            n++;
        }
        
        //pangkatan
        for (int i = 0; i < binerReverse.length; i++) {
            if (Integer.parseInt(binerReverse[i]) == 1) {
                resultDecimal += Math.pow(2, i);
            }
        }
        return String.valueOf(resultDecimal);
    }
    
    public static void main(String[] args) {
        BinerDecimal bd = new BinerDecimal();
        
        System.out.println("==== Konversi Bilangan ====");
        System.out.println(" 1. Desimal ke Biner\n 2. Biner ke Desimal \n");
        System.out.print("Masukan Pilihan: ");
        Scanner input = new Scanner(System.in);
        
        switch (input.nextInt()) {
            case 1:
                System.out.println("\n= Desimal ke Biner = ");
                System.out.print("Masukan bil. Desimal: ");
                Scanner desimal = new Scanner(System.in);
                String biner =
                Integer.toBinaryString(desimal.nextInt());
                System.out.println("Hasil : "+biner);
                int inputInt = desimal.nextInt();
                System.out.print("Hasil: ");
                bd.decimalToBiner(inputInt);
                System.out.print("\n");
                break;
            case 2:
                System.out.println("\n= Biner ke Desimal =");
                System.out.print("Masukan bil. Biner: ");
                Scanner inputBiner = new Scanner(System.in);
                int result = Integer.parseInt(inputBiner.nextLine(), 2); //radix 2(biner)
                System.out.println("Hasil: "+result);
                System.out.println("Desimal: "+bd.binerToDecimal(inputBiner.nextLine()));
                break;
            default:
                System.out.println("Harap memilih angka dari pilihan diatas");
                break;
        }
    }
}
