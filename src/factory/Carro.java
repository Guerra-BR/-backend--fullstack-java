package factory;

public abstract class Carro {
    private int potenciaEmCavalos;
    private String tipoDeCombustivel;
    private String cor;

    public Carro(int potenciaEmCavalos, String tipoDeCombustivel, String cor) {
        this.potenciaEmCavalos = potenciaEmCavalos;
        this.tipoDeCombustivel = tipoDeCombustivel;
        this.cor = cor;
    }

    public void startEngenie(){
        System.out.println("Vrum");
    }

    public void clean(){
        System.out.println("O carro foi limpo e encerado");
    }

    public void mechanicCheck(){
        System.out.println("A mecanica do veiculo esta perfeita");
    }

    public void fuelCar(){
        System.out.println("O carro foi abastecido com " + tipoDeCombustivel);
    }
}
