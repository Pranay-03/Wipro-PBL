public class cla2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide one command line argument.");
            return;
        }

        String name = args[0];
        System.out.println("Welcome " + name);
    }
}
