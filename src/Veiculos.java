import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Veiculos<T extends Carro> {
    public Map<String, T> listaDeCarros = new HashMap<>();

    public Collection<T> retornaListaDeCarros(){
        return this.listaDeCarros.values();
    }

    public void adicionaCarro(T carro){
        this.listaDeCarros.put(carro.getNome(), carro);
    }

    public String consulta(String nome){
        return listaDeCarros.get(nome).toString();
    }
}
