public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Caderno caderno = new Caderno();

        caderno.escreveNoCaderno("Ola, eu sou a raposa", 1);
        System.out.println(caderno.leCaderno(1));
        System.out.println(caderno.leCaderno(2));
    }
}