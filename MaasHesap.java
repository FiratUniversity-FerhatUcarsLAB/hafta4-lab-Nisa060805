
import java.util.Scanner;

public class MaasHesap {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sabit oranlar
        final double SGK_ORANI = 0.14;
        final double GELIR_VERGISI_ORANI = 0.15;
        final double DAMGA_VERGISI_ORANI = 0.00759;

        // Kullanıcıdan veri alımı
        System.out.print("Çalışanın adı: ");
        String ad = input.nextLine();

        System.out.print("Brüt maaş (TL): ");
        double brutMaas = input.nextDouble();

        System.out.print("Mesai saati: ");
        double mesaiSaati = input.nextDouble();

        System.out.print("Saatlik mesai ücreti (TL): ");
        double saatlikUcret = input.nextDouble();

        // Hesaplamalar
        double mesaiUcreti = mesaiSaati * saatlikUcret;
        double toplamGelir = brutMaas + mesaiUcreti;

        double sgkKesinti = toplamGelir * SGK_ORANI;
        double gelirVergisi = toplamGelir * GELIR_VERGISI_ORANI;
        double damgaVergisi = toplamGelir * DAMGA_VERGISI_ORANI;
        double toplamKesinti = sgkKesinti + gelirVergisi + damgaVergisi;

        double netMaas = toplamGelir - toplamKesinti;

        // Ek istatistikler
        double kesintiOrani = (toplamKesinti / toplamGelir) * 100;
        double saatlikNetKazanc = netMaas / 176; // 22 gün * 8 saat
        double gunlukNetKazanc = netMaas / 22;

        // Çıktı
        System.out.println("\n===============================");
        System.out.println("         MAAS BORDROSU         ");
        System.out.println("===============================");
        System.out.printf("Çalışan: %s%n", ad);
        System.out.println("\nGELİRLER:");
        System.out.printf("Brüt Maaş:             %.2f TL%n", brutMaas);
        System.out.printf("Mesai Ücreti (%.0f saat): %.2f TL%n", mesaiSaati, mesaiUcreti);
        System.out.println("-------------------------------");
        System.out.printf("TOPLAM GELİR:          %.2f TL%n", toplamGelir);

        System.out.println("\nKESİNTİLER:");
        System.out.printf("SGK Kesintisi (%.1f%%):   %.2f TL%n", SGK_ORANI * 100, sgkKesinti);
        System.out.printf("Gelir Vergisi (%.1f%%):   %.2f TL%n", GELIR_VERGISI_ORANI * 100, gelirVergisi);
        System.out.printf("Damga Vergisi (%.1f%%):   %.2f TL%n", DAMGA_VERGISI_ORANI * 100, damgaVergisi);
        System.out.println("-------------------------------");
        System.out.printf("TOPLAM KESİNTİ:        %.2f TL%n", toplamKesinti);
        System.out.printf("NET MAAŞ:              %.2f TL%n", netMaas);
        System.out.println("===============================");

        // İstatistikler
        System.out.println("\nİSTATİSTİKLER:");
        System.out.printf("Kesinti Oranı:         %.1f%%%n", kesintiOrani);
        System.out.printf("Saatlik Net Kazanç:    %.2f TL%n", saatlikNetKazanc);
        System.out.printf("Günlük Net Kazanç:     %.2f TL%n", gunlukNetKazanc);

        input.close();
    }
}
