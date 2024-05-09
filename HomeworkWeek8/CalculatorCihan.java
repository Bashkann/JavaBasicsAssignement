// Cihan Eren Karpınar - 2311502273
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorCihan {
    public void Operations() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Select operation:");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");

            int choice = scanner.nextInt();

            System.out.print("Birinci Sayı: ");
            double num1 = scanner.nextDouble();

            System.out.print("İkinci Sayı: ");
            double num2 = scanner.nextDouble();

            double sonuc = 0;

            switch (choice) {
                case 1:
                    sonuc = num1 + num2;
                    break;
                case 2:
                    sonuc = num1 - num2;
                    break;
                case 3:
                    sonuc = num1 * num2;
                    break;
                case 4:
                    if (num2 != 0) {
                        sonuc = num1 / num2;
                    } else {
                        throw new ArithmeticException("Geçersiz işlem, ikinci sayı sıfır olamaz.");
                    }
                    break;
                default:
                    System.out.println("Geçersiz seçim");
                    return;
            }

            System.out.println("Sonuç: " + sonuc);
        } catch (InputMismatchException e) {
            System.out.println("Geçersiz giriş, sayı girin.");
        } catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}