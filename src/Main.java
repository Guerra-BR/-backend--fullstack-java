public class Main{

    public static void main(String[] args) {
        Veiculos listaViculos = new Veiculos();
        Carro yaris = new Yaris(200, "Yaris 1", "Prata");
        Carro mustang = new Mustang(300, "Mustang", "Preto");
        Carro corolla = new Corola(250, "Corolla", "Branco");

        listaViculos.adicionaCarro(corolla);
        listaViculos.adicionaCarro(mustang);
        listaViculos.adicionaCarro(yaris);

        System.out.println(listaViculos.consulta(mustang.getNome()));
    }
}