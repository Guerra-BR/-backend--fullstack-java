import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> homens = new LinkedList<Pessoa>();
        List<Pessoa> mulheres = new LinkedList<Pessoa>();
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o nome da pessoa e o sexo (masculino ou feminino) separados por uma virgula ','\n" +
                "Você pode adicionar mais de uma pessoa utilizando ';' para separa-las ");

        String entradaSys = s.next();

        if(entradaSys.contains(";")){
            String[] ent = entradaSys.split(";");

            for(String d : ent){
               String[] novoDado = d.split(",");
               Pessoa novaEntrada = new Pessoa(novoDado[0], novoDado[1]);

                if(novoDado[1].equals("masculino")){
                    homens.add(novaEntrada);
                } else if (novoDado[1].equals("feminino")){
                    mulheres.add(novaEntrada);
               }

            }
        } else {
            String[] novoDado = entradaSys.split(",");
            Pessoa novaEntrada = new Pessoa(novoDado[0], novoDado[1]);
            if(novoDado[1].equals("masculino")){
                homens.add(novaEntrada);
            } else if (novoDado[1].equals("feminino")){
                mulheres.add(novaEntrada);
            }
        }


        System.out.println("Esta é a lista de homens");
        for(Pessoa p : homens){
            System.out.println(p.getNome());
        }
        System.out.println("\nEste é o fim da lista de homens\n\n\n" +
                "Lista de mulheres:");

        for(Pessoa p : mulheres){
            System.out.println(p.getNome());
        }
        System.out.println("\nEste é o fim da lista de mulheres");
    }
}