public class Main {

    public static void main(String[] args)
    {
        DecimalComparator dc = new DecimalComparator();

        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.175, -3.176));
        System.out.println(dc.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(dc.areEqualByThreeDecimalPlaces(-3.123, 3.123));



        // Here is an exercise I recommended for others to understand downcasting.
//        float a = -3.123f * 1000;
//        float b = 3.123f * 1000;
//        System.out.println("A: "+a);
//        System.out.println("B: "+b);
//        System.out.println("A: "+ (int)a);
//        System.out.println("B: "+(int)b);

    }
}
