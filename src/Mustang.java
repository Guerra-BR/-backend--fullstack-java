public class Mustang extends Carro{
    public Mustang(Integer horsePower, String nome, String cor) {
        super(horsePower, nome, cor);
    }

    @Override
    public void acelerar() {
        System.out.println("O " + this.getClass().getSimpleName() + " " + getCor() + " acelerou com seus " + getHorsePower());
    }
}
