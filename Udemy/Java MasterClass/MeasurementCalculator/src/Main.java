public class Main
{
    public static void main(String[] args)
    {
        MeasurementCalculator mc = new MeasurementCalculator();

        System.out.println("");

        System.out.println(mc.calcFeetandInchesToCentimeters(-1,2));
        System.out.println(mc.calcFeetandInchesToCentimeters(-1,13));
        System.out.println(mc.calcFeetandInchesToCentimeters(-5,13));
        System.out.println(mc.calcFeetandInchesToCentimeters(0,22));
        System.out.println(mc.calcFeetandInchesToCentimeters(4,13));
        System.out.println(mc.calcFeetandInchesToCentimeters(-12));
        System.out.println(mc.calcFeetandInchesToCentimeters(-1));
        System.out.println(mc.calcFeetandInchesToCentimeters(-2));

        System.out.println("");

        System.out.println(mc.calcFeetandInchesToCentimeters(1,2));
        System.out.println(mc.calcFeetandInchesToCentimeters(0,12));
        System.out.println(mc.calcFeetandInchesToCentimeters(12));
        System.out.println(mc.calcFeetandInchesToCentimeters(2));
        System.out.println(mc.calcFeetandInchesToCentimeters(13));
        System.out.println(mc.calcFeetandInchesToCentimeters(70));
        System.out.println(mc.calcFeetandInchesToCentimeters(100));

    }
}
