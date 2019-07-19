public class Main
{
    public static void main(String[] args)
    {
        EqualSumChecker eqc = new EqualSumChecker();

        System.out.println(eqc.hasEqualSum(1,1,1));
        System.out.println(eqc.hasEqualSum(1,1,2));
        System.out.println(eqc.hasEqualSum(1,-1,0));
    }
}
