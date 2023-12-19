package factory;

public abstract class Factory {
    public Carro create(String preferencia){
        Carro carro = retirarCarro(preferencia);
        carro = prepararCarro(carro);
        return carro;
    }

    private Carro prepararCarro(Carro carro) {
        carro.mechanicCheck();
        carro.clean();
        carro.fuelCar();
        return carro;
    }

    abstract Carro retirarCarro(String preferencia);
}
