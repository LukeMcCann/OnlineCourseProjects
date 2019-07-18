public class Main
{
    public static void main(String[] args)
    {
        BarkingDog bd = new BarkingDog();

        System.out.println(bd.shouldWakeUp(true, 1));
        System.out.println(bd.shouldWakeUp(false, 2));
        System.out.println(bd.shouldWakeUp(true, 8));
        System.out.println(bd.shouldWakeUp(true, -1));
    }
}
