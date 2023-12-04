import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> homens = new LinkedList<Pessoa>();
        List<Pessoa> mulheres = new LinkedList<Pessoa>();
        List<String> pessoas = new LinkedList<>();
        Scanner s = new Scanner(System.in);

        System.out.println("Insira o nome das pessoas separadas por virgulas ','.\n" +
                "Você pode ou não adicionar o genero da pessoa (M ou F) separadamente do nome com um '-'\n\n" +
                "Exemplo:\n" +
                "Dimitri-M,Katya-F");

        String entradaSys = s.next();
        boolean separacao = false;

        if(entradaSys.contains("-")){
            separacao = true;
            String[] ent = entradaSys.split(",");

            for(String d : ent){
               String[] novoDado = d.split("-");
               Pessoa novaEntrada = new Pessoa(novoDado[0], novoDado[1]);

                if(novoDado[1].contains("M") || novoDado[1].contains("m")){
                    homens.add(novaEntrada);
                } else if (novoDado[1].contains("F") || novoDado[1].contains("f")){
                    mulheres.add(novaEntrada);
               }

            }
        } else {
            String[] novasEntradas = entradaSys.split(",");

            pessoas.addAll(Arrays.asList(novasEntradas));
        }



        Collections.sort(pessoas);
        Collections.sort(homens);
        Collections.sort(mulheres);

        System.out.println("Segue a lista orgenada de pessoas:");
        for(String p : pessoas){
            System.out.println(p);
        }

        if(separacao){
            System.out.println("\n\nSeguem as listas ordenadas separadas por genero:\n");

            System.out.println("Esta é a lista de homens:");
            for(Pessoa p : homens){
                System.out.println(p.getNome());
            }


            System.out.println("\n\n" +
                    "Lista de mulheres:");
            for(Pessoa p : mulheres){
                System.out.println(p.getNome());
            }
        }

    }
}