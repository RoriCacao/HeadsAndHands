public class Dice {

    //Бросок кубика, возвращает выпавшее число
    private static int getRandomDiceNumber()
    {
        int i = (int) (Math.random() * 6) + 1;
        //System.out.println(i);
        return i;
    }

    //Бросок кубика N раз, возвращает True если выпало 5 или 6
    public static boolean throwDice(int N){
        for(int i = 0 ; i < N; i++){
            if(getRandomDiceNumber() >4){
                return true;
            }
        }
        return false;
    }
    public static int randomDamage(int[] damage){
        return (int) ((Math.random() * (damage[1] - damage[0] + 1)) + damage[0]);
    }
}