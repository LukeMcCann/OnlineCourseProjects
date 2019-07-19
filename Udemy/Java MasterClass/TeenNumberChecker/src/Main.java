public class Main
{
    public static void main(String[] args)
    {
        TeenNumberChecker tnc = new TeenNumberChecker();

        System.out.println(tnc.hasTeen(9, 99, 19));
        System.out.println(tnc.hasTeen(23,15,42));
        System.out.println(tnc.hasTeen(22,23,34));
    }
}
