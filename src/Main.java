import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number1 = 0;
        int number2 = 0;
        float f1 = 0;
        float f2 = 0;
        float res = 0;
        String s1;
        String s2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Суммируем два числа.");
        System.out.print("Введите первое число: ");

        if (sc.hasNextInt()) {
            number1 = sc.nextInt();
        } else {
            if (sc.hasNextLine()) {
                s1 = sc.nextLine();
                try {
                    f1 = Float.parseFloat(s1);
                } catch (NumberFormatException e) {
                    System.err.println("То что вы ввели нельзя назвать числом. Подумайте и попробуйте ещё раз позже.");
                    return;
                }
            } else {
                if (sc.hasNextFloat()) {
                    f1 = sc.nextFloat();
                } else {
                    System.out.println("Извините, вы творите какую-то дичь, одумайтесь.");
                    return;
                }
            }
        }

        System.out.print("Введите второе число: ");

        if (sc.hasNextInt()) {
            number2 = sc.nextInt();
        } else {
            if (sc.hasNextLine()) {
                s2 = sc.nextLine();
                try {
                    f2 = Float.parseFloat(s2);
                } catch (NumberFormatException e) {
                    System.err.println("То что вы ввели нельзя назвать числом. Подумайте и попробуйте ещё раз позже.");
                    return;
                }
            } else {
                if (sc.hasNextFloat()) {
                    f2 = sc.nextFloat();
                } else {
                    System.out.println("Извините, вы творите какую-то дичь, одумайтесь.");
                    return;
                }
            }
        }
        res = (number1 + number2 + f1 + f2);
        if (res % 1 == 0) {
            System.out.println("Спасибо! Сумма введенных чисел: " + Math.round(res) +"\n");
        } else {
            System.out.println("Спасибо! Сумма введенных чисел: " +res+"\n");
        }

        Scanner sc1 = new Scanner(System.in);

        System.out.print("Введите Имя и Фамилию: ");
        s1 = sc1.nextLine();
        System.out.print("Введите сумму взноса: ");
        if (sc1.hasNextInt()) {
            number2 = sc1.nextInt();
        } else {
            if (sc1.hasNextLine()) {
                s2 = sc1.nextLine();
                try {
                    f2 = Float.parseFloat(s2);
                } catch (NumberFormatException e) {
                    System.err.println("То что вы ввели нельзя назвать числом. Подумайте и попробуйте ещё раз позже.");
                    return;
                }
            } else {
                if (sc1.hasNextFloat()) {
                    f2 = sc1.nextFloat();
                } else {
                    System.out.println("Извините, вы творите какую-то дичь, одумайтесь.");
                    return;
                }
            }
        }

        System.out.println(s1 +" через год по ставке 20% ваш депозит будет равен: " + (number2 + f2)*1.2);

        sc1.close();

    }

}
