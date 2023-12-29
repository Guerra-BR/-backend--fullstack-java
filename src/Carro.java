public abstract class Carro {
    public Integer HorsePower;

    public Carro(Integer horsePower, String nome, String cor) {
        this.HorsePower = horsePower;
        this.nome = nome;
        this.cor = cor;
    }

    public String nome;
    public String cor;

    public Integer getHorsePower() {
        return HorsePower;
    }

    public void setHorsePower(Integer horsePower) {
        HorsePower = horsePower;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public abstract void acelerar();

    @Override
    public String toString() {
        return "Carro{" +
                "HorsePower=" + HorsePower +
                ", nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                '}';
    }
}
