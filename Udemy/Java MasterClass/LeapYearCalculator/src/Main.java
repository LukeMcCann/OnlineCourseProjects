public class Main
{
    public static void main(String[] args)
    {
        LeapYear ly = new LeapYear();

        System.out.println(ly.isLeapYear(-1600));
        System.out.println(ly.isLeapYear(1600));
        System.out.println(ly.isLeapYear(2017));
        System.out.println(ly.isLeapYear(2000));

//        if(year <= 0 || year > 9999) {return false;}
//        return (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0));

    }
}
