public class Main
{
    public static void main(String[] args)
    {
        PlayingCat pc = new PlayingCat();

        System.out.println(pc.isCatPlaying(true, 10));
        System.out.println(pc.isCatPlaying(false, 36));
        System.out.println(pc.isCatPlaying(false, 35));
    }
}
