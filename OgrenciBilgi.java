
    
        
        
        import java.util.Scanner;
 class OgrenciBilgi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("=== OGRENCI BILGI SISTEMI ===");

        System.out.print("Adinizi girin: ");
        String ad = input.next();

        System.out.print("Soyadinizi girin: ");
        String soyad = input.next();

        System.out.print("Ogrenci numaraniz: ");
        int numara = input.nextInt();

        System.out.print("Yasiniz: ");
        int yas = input.nextInt();

        System.out.print("GPA (0.00-4.00): ");
        double gpa = input.nextDouble();

        System.out.println("\n=== OGRENCI BILGI SISTEMI ===");
        System.out.println("Ad Soyad: " + ad + " " + soyad);
        System.out.println("Ogrenci No: " + numara);
        System.out.println("Yas: " + yas);
        System.out.printf("GPA: %.2f\n", gpa);

        if (gpa >= 2.0) {
            System.out.println("Durum: Basarili Ogrenci");
        } else {
            System.out.println("Durum: Basarisiz Ogrenci");
        }

        input.close();
    }
}

        

        
        
        
