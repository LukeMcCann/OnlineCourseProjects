public class Main
{
    public static void main(String[] args)
    {
        AreaCalculator ac = new AreaCalculator();

        System.out.println(ac.area(5));
        System.out.println(ac.area(-1));
        System.out.println(ac.area(5.0, 4.0));
        System.out.println(ac.area(-1.0, 4.0));
    }
}
