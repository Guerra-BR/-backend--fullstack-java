public class Main {
    public static void main(String[] args) {
        imprimeNumeros();
    }

    private static void imprimeNumeros() {
        int idade = 21;
        System.out.println(idade);
        short idadeS = (short) idade;
        System.out.println(idadeS);
        long idadeL = idade;
        System.out.println(idadeL);
    }
}