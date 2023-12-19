package factory;

public class FordFactory extends Factory{
    @Override
    Carro retirarCarro(String preferencia) {
        if ("A".equals(preferencia)) {
            return new Bronco(200, "Diesel", "Preto");
        } else {
            return new Mustang(200, "Gasolina Aditivada", "Cinza");
        }
    }
}
