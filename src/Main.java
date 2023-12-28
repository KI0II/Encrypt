import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ключ: ");
        String key = scanner.nextLine();
        System.out.print("Введите сообщение: ");
        String message = scanner.nextLine();
        scanner.close();

        Time time = new Time();
        time.getTime();
        String date = time.date;

        String encryptedMessage = Encrypt.encrypt(message, key);
        String encryptedTime = Encrypt.encryptTime(date, key);
        System.out.println("Зашифрованное сообщение: " + encryptedMessage);
        System.out.println("Зашифрованное время отправки: " + encryptedTime);

        String decryptedMessage = Decrypt.decrypt(encryptedMessage, key);
        String decryptedTime = Decrypt.decryptTime(encryptedTime, key);
        System.out.println("Расшифрованное сообщение: " + decryptedMessage);
        System.out.println("Расшифрованное время отправки: " + decryptedTime);
    }
}