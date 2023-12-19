import factory.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("B", true);
        Factory f = getFactory(cliente);
        Carro carro = f.create(cliente.getgradeReq());

        Cliente cliente2 = new Cliente("B", false);
        Factory f2 = getFactory(cliente2);
        Carro carro2 = f2.create(cliente.getgradeReq());



    }

    private static Factory getFactory(Cliente cliente){
        if(cliente.getHasToyotaPreference()){
            return new ToyotaFactory();
        }else {
            return new FordFactory();
        }
    }
}