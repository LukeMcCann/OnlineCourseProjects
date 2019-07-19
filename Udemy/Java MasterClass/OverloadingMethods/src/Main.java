public class Main
{
    public static void main(String[] args)
    {
        int newScore = calculateScore(500);
        System.out.println("New score is " + newScore);

        System.out.println("");

        newScore = calculateScore("Luke", 700);
        System.out.println("New score is " + newScore);

        System.out.println("");

        calculateScore();
    }

    public static int calculateScore(String player, int score)
    {
        System.out.println("Player " + player + " scored " + score + " points");
        return score*1000;
    }

    private static int calculateScore(int score)
    {
        System.out.println("Guest player " +" scored " + score + " points");
        return score*1000;
    }

    private static int calculateScore()
    {
        System.out.println("No registered name or score!");
        return 0;
    }
}
