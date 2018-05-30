public class Program {
    public static void main(String[] args) {
        new Thread(Program::logicalOperations).start();

    }

    public static void logicalOperations() {
        boolean a = true;
        boolean b = false;
        System.out.println("true AND false = " + (a & b));
        System.out.println("true sAND false = " + (a && b));
        System.out.println("true OR false = " + (a | b));
        System.out.println("true sOR false = " + (a || b));
        System.out.println("true XOR true = " + (a ^a));
        System.out.println("false XOR false = " + (b ^ b));
        System.out.println("true XOR false = " + (a ^ b));
        System.out.println("NOT true = " + !a);
        System.out.println("NOT false = " + !b);




    }
}
