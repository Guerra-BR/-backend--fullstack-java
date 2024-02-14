package tests;

import dao.generic.jdbc.dao.ClienteDAO;
import dao.generic.jdbc.dao.IClienteDAO;
import domin.Cliente;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClienteTest {
    private IClienteDAO clienteDAO;

    @Test
    public void cadastrarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Nome 1");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteDB = clienteDAO.buscar("10");
        assertNotNull(clienteDB);
        assertEquals(clienteDB.getCodigo(), cliente.getCodigo());
        assertEquals(clienteDB.getNome(), cliente.getNome());

        Integer contdel = clienteDAO.excluir(clienteDB);
        assertTrue(contdel == 1);
    }

    @Test
    public void buscarTest() throws Exception{
        clienteDAO = new ClienteDAO();

        Cliente cliente = new Cliente();
        cliente.setCodigo("10");
        cliente.setNome("Nome 1");
        Integer countCad = clienteDAO.cadastrar(cliente);
        assertTrue(countCad == 1);

        Cliente clienteDB = clienteDAO.buscar("10");
        assertNotNull(clienteDB);
        assertEquals(clienteDB.getCodigo(), cliente.getCodigo());
        assertEquals(clienteDB.getNome(), cliente.getNome());

        Integer contdel = clienteDAO.excluir(clienteDB);
        assertTrue(contdel == 1);
    }
}

