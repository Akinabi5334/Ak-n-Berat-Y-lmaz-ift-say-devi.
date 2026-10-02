
public class Main {
    public static void main(String[] args) {
        int toplam = 0;

        // 2'den başlayıp 20 dahil olmak üzere 2'şer artan döngü (çift sayılar için)
        for (int i = 2; i <= 20; i += 2) {
            int kup = i * i * i; // Sayının küpünü alıyoruz
            toplam += kup;       // Toplama ekliyoruz
        }

        // Sonucu ekrana yazdırıyoruz
        System.out.println("1'den 20'ye kadar olan çift sayıların küplerinin toplamı: " + toplam);
    }
}