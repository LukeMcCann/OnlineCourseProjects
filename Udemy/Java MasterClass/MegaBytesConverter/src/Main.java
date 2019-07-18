public class Main {

    public static void main(String[] args)
    {
        MegaBytesConverter mc = new MegaBytesConverter();

        mc.printMegaBytesAndKiloBytes(2500);
        mc.printMegaBytesAndKiloBytes(-1024);
        mc.printMegaBytesAndKiloBytes(5000);
    }
}
