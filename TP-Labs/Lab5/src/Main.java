import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое имя >");
        String playerName = scanner.nextLine();
        System.out.print("Введите имя врага >");
        String enemyName = scanner.nextLine();

        Player player = new Player(playerName);
        Enemy enemy = new Enemy(enemyName);

        while (enemy.getLife() > 0 && player.getLife() > 0)
        {
            System.out.print("Введите число >");
            int playerGuess = 0;
            boolean correctInput = false;
            while(!correctInput)
            {
                try
                {
                    playerGuess = scanner.nextInt();
                    correctInput = playerGuess > 0 && playerGuess < 21;
                }
                catch (Exception e)
                {
                    correctInput = false;
                    System.out.println("Требуется ввести число от 1 до 20. Совершите ввод ещё раз.");
                }
            }

            player.attack(playerGuess, enemy);
            if (enemy.getLife() > 0) enemy.attack(player);
        }

        if (enemy.getLife() < 1)
            System.out.println("Вы одолели врага и одержали победу! Гиб-гиб, ура!");
        else
            System.out.println("Враг смог одолеть Вас. Ну, поражения случаются");
        System.out.println("Fin.");
    }

}