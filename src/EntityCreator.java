import java.util.Scanner;

public class EntityCreator {
    public static Player createPlayer(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        int ATK = 0;
        int DEF = 0;
        int[] DMG = new int[2];
        int HEALTH = 0;
        do{
            System.out.println("Введите значение атаки");
            if (scanner.hasNextInt()) {
                ATK = scanner.nextInt();
                if (ATK > 30 || ATK < 1) {
                    System.out.println("Введите число от 1 до 30");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(ATK > 30 || ATK < 1);

        do {
        System.out.println("Введите значение защиты");
        if (scanner.hasNextInt()) {
            DEF = scanner.nextInt();
            if (DEF > 30 || DEF < 1) {
                System.out.println("Введите число от 1 до 30");
            }
        } else {
            System.out.println("Вы ввели не число");
            scanner = new Scanner(System.in);
        }
        } while(DEF > 30 || DEF < 1);

        do {
        System.out.println("Введите значение здоровья");
        if (scanner.hasNextInt()) {
            HEALTH = scanner.nextInt();
            if (HEALTH < 1) {
                System.out.println("Здоровье должно быть больше 0");
            }
        } else {
            System.out.println("Вы ввели не число");
            scanner = new Scanner(System.in);
        }
        } while(HEALTH < 1);

        do {
        System.out.println("Введите нижнее значение урона");
        if (scanner.hasNextInt()) {
            DMG[0] = scanner.nextInt();
            if (DMG[0] < 0) {
                System.out.println("Введите число больше нуля");
            }
        } else {
            System.out.println("Вы ввели не число");
            scanner = new Scanner(System.in);
        }
        } while(DMG[0] < 0);

        do {
        System.out.println("Введите верхнее значение урона");
        if (scanner.hasNextInt()) {
            DMG[1] = scanner.nextInt();
            if (DMG[1] <= DMG[0]) {
                System.out.println("Верхнее значение не может быть меньше нижнего");
            }
        } else {
            System.out.println("Вы ввели не число");
            scanner = new Scanner(System.in);
        }
        } while(DMG[1] < DMG[0]);


        return new Player(ATK, DEF, HEALTH, DMG);
    }
    public static Monster createMonester(){
        Scanner scanner = new Scanner(System.in);
        int choice;
        int ATK = 0;
        int DEF = 0;
        int[] DMG = new int[2];
        int HEALTH = 0;
        do{
            System.out.println("Введите значение атаки");
            if (scanner.hasNextInt()) {
                ATK = scanner.nextInt();
                if (ATK > 30 || ATK < 1) {
                    System.out.println("Введите число от 1 до 30");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(ATK > 30 || ATK < 1);

        do {
            System.out.println("Введите значение защиты");
            if (scanner.hasNextInt()) {
                DEF = scanner.nextInt();
                if (DEF > 30 || DEF < 1) {
                    System.out.println("Введите число от 1 до 30");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(DEF > 30 || DEF < 1);

        do {
            System.out.println("Введите значение здоровья");
            if (scanner.hasNextInt()) {
                HEALTH = scanner.nextInt();
                if (HEALTH < 1) {
                    System.out.println("Здоровье должно быть больше 0");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(HEALTH < 1);

        do {
            System.out.println("Введите нижнее значение урона");
            if (scanner.hasNextInt()) {
                DMG[0] = scanner.nextInt();
                if (DMG[0] < 0) {
                    System.out.println("Введите число больше нуля");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(DMG[0] < 0);

        do {
            System.out.println("Введите верхнее значение урона");
            if (scanner.hasNextInt()) {
                DMG[1] = scanner.nextInt();
                if (DMG[1] <= DMG[0]) {
                    System.out.println("Верхнее значение не может быть меньше нижнего");
                }
            } else {
                System.out.println("Вы ввели не число");
                scanner = new Scanner(System.in);
            }
        } while(DMG[1] < DMG[0]);


        return new Monster(ATK, DEF, HEALTH, DMG);
    }
}
