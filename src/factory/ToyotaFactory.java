package factory;

public class ToyotaFactory extends Factory{


    @Override
    Carro retirarCarro(String gradeReq) {
        if("A".equals(gradeReq)){
            return new Etios(100, "Gasolina", "Preto");
        } else {
            return new Corola(150, "Gasolina", "Prata");
        }
    }
}
