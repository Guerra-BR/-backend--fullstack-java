/**
 * @author JavaFox
 * <br/>
 * Um caderno com 3 folhas apenas, você pod escrever nele e o ler
 */
public class Caderno {
    private Folha folha1 = new Folha();
    private Folha folha2 = new Folha();
    private Folha folha3 = new Folha();


    /**
     * Lê o conteúdo do caderno, é necessária selecionar a folha a ser lida
     *
     * @param folha Informe a folha a ser lida 1 a 3
     * @return Retorna o que esta escrito em determinada folha do caderno
     */
    public String leCaderno( int folha ) {
        String conteudo = "";
        if (folha == 1){
            conteudo = folha1.getConteudo();
        } else if(folha == 2){
            conteudo = folha2.getConteudo();
        } else if(folha == 3){
            conteudo = folha3.getConteudo();
        } else {
            return "O caderno não tem tantas folhas assim, apenas 3";
        }

        if (conteudo.isEmpty()){
            return "A folha esta em branco";
        }
        return conteudo;
    }

    /**
     * Escreve algo no caderno, é necessário definir a folha a ser escrita
     * @param conteudo Conteúdo a ser escrito
     * @param folha Número da folha em que será ecrito o conteúdo
     */
    public void escreveNoCaderno(String conteudo, int folha){
        if (folha == 1){
            folha1.setConteudo(conteudo);
        } else if(folha == 2){
            folha2.setConteudo(conteudo);
        } else if(folha == 3){
            folha3.setConteudo(conteudo);
        }
    }
}
