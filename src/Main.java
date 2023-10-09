import java.util.Scanner;

public class Main {
    public Main() {
    }
    public static void main(String[] args){
        Player player = null;
        Monster monster = null;
        System.out.println("1: играть за готового персонажа \n2: создать своего персонажа");
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            while(!scanner.hasNextInt()) {
                System.out.println("Введи 1 или 2");
                scanner = new Scanner(System.in);
            }
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    player = new Player();
                    System.out.println(player);
                    break;
                case 2:
                    player = EntityCreator.createPlayer();
                default:
                    System.out.println("Введи 1 или 2");
            }
        } while(choice != 1 & choice != 2);

        System.out.println("1: играть против готового монстра \n2: создать монстра");

        do {
            while(!scanner.hasNextInt()) {
                System.out.println("Введи 1 или 2");
                scanner = new Scanner(System.in);
            }

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    monster = new Monster();
                    System.out.println(monster);
                    break;
                case 2:
                    monster = EntityCreator.createMonester();
                default:
                    System.out.println("Введи 1 или 2");
            }
        } while(choice != 1 & choice != 2);

        if (Fight.fight(player, monster) == player) {
            System.out.println("Вы победили!");
        } else {
            System.out.println("Вы проиграли");
        }

    }
}