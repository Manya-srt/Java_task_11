// Для введенной с клавиатуры строки необходимо провести отсев пробелов.
// Результат в виде строки без пробелов вывести на экран.

import java.util.Scanner;

public class Task_eleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите какое-нибудь сообщение с пробелами");
        String sms = scanner.nextLine();
        String sms2 = sms.replace(" ", "");
        System.out.println("Результат: " + sms2);
    }
}
