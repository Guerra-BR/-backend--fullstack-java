package tests;

import dao.generic.jdbc.dao.IProdutoDAO;
import domin.Produto;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ProdutosTest {
    private IProdutoDAO iProdutoDAO;

    @Test
    public void cadastrarEBuscarTeste() throws Exception{
        Produto p = new Produto();
        p.setNome("Nome 1");
        p.setValor(23.69);
        p.setCodigo("SVLK");

        Integer cadastrado = iProdutoDAO.cadastrar(p);
        assertTrue(cadastrado == 1);

        Produto pDB = iProdutoDAO.buscar("SVLK");
        assertNotNull(pDB);
        assertEquals(p.getNome(), pDB.getNome());
        assertEquals(p.getCodigo(), pDB.getCodigo());
        assertEquals(p.getValor(), pDB.getValor());
    }

    @Test
    public void alterarTest() throws Exception{
        Produto p = new Produto();
        p.setNome("Nome alterado");
        p.setValor(23.68);
        p.setCodigo("SVLK");

        Integer alterado = iProdutoDAO.atualizar(p);
        assertTrue(alterado == 1);

        Produto pDB = iProdutoDAO.buscar("SVLK");
        assertNotNull(pDB);
        assertEquals(p.getNome(), pDB.getNome());
        assertEquals(p.getCodigo(), pDB.getCodigo());
        assertEquals(p.getValor(), pDB.getValor());
    }

    @Test
    public void deletarTest() throws Exception{
        Integer deletado = iProdutoDAO.excluir("SVLK");

        assertTrue(deletado == 1);
    }


    @Test
    public void buscarTodosTest() throws Exception{
        Produto produto1 = new Produto("kitkat", "kat", 23.69);
        Produto produto2 = new Produto("paodequeijo", "pq", 2.1);
        Produto produto3 = new Produto("canetaazul", "ca", 1.5);
        Produto produto4 = new Produto("violeta", "v", 2.3);

        iProdutoDAO.cadastrar(produto1);
        iProdutoDAO.cadastrar(produto2);
        iProdutoDAO.cadastrar(produto3);
        iProdutoDAO.cadastrar(produto4);

        List<Produto> lista = new ArrayList<>();
        lista.add(produto1);
        lista.add(produto2);
        lista.add(produto3);
        lista.add(produto4);

        List<Produto> listaDB = iProdutoDAO.buscarTodos();

        int i = 0;
        for (Produto item : lista){

            Produto pDB = listaDB.get(i);

            assertNotNull(pDB);
            assertEquals(item.getNome(), pDB.getNome());
            assertEquals(item.getCodigo(), pDB.getCodigo());
            assertEquals(item.getValor(), pDB.getValor());
            i++;
        }

    }
}
