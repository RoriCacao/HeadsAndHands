import java.util.Scanner;

public class Fight {
    public static Entity fight(Player player, Monster monster){
        Entity winner = null;
        int playersThrows = player.getATK() - monster.getDEF() + 1;
        int monstersThrows = monster.getATK() - player.getDEF() + 1;
        while(player.getHEALTH() > 0 && monster.getHEALTH() > 0){
            if(Dice.throwDice(playersThrows) && winner != monster){
                player.hit(monster);
                if(monster.getHEALTH() == 0){
                    winner = player;
                }
            }
            if(Dice.throwDice(monstersThrows) && winner != player){
                monster.hit(player);
                if(player.getHEALTH() == 0){
                    winner = monster;
                }
            }
            System.out.print("Игрок " + player.getHEALTH() + " ");
            System.out.println("Монстр " + monster.getHEALTH());
            if(player.getKit() != 0 && winner == null){
                System.out.println("1: Использовать аптечку \nЛюбая другая клавиша: Продолжить бой");
                Scanner scanner = new Scanner(System.in);
                if(scanner.hasNextInt()) {
                    if (scanner.nextInt() == 1) {
                        player.heal();
                    }
                }
            }
        }
        return winner;
    }
}