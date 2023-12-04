import java.util.Objects;

public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private String sexo;

    public String getNome() {
        return nome;
    }

    public Pessoa(String nome, String sexo) {
        this.nome = nome;
        this.sexo = sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }



    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public int compareTo(Pessoa p) {
        return this.nome.compareTo(p.getNome());
    }
}
