package tests;

import main.dao.ContratoDAO;
import main.dao.ContratoDAOMock;
import main.dao.IContratoDAO;
import main.service.ContratoService;
import org.junit.Test;

public class MainTest {


    @Test
    public void salvarTest(){
        IContratoDAO mock = new ContratoDAOMock();
        ContratoService service = new ContratoService(mock);
        service.salvar();
    }

    @Test(expected = RuntimeException.class)
    public void buscarTesteEsperadoErro(){
        IContratoDAO dao = new ContratoDAO();
        ContratoService service = new ContratoService(dao);
        service.buscar("nomme");
    }

    @Test
    public void editarTeste(){
        IContratoDAO mock = new ContratoDAOMock();
        ContratoService service = new ContratoService(mock);
        service.atualizar();
    }

    @Test(expected = RuntimeException.class)
    public void excluirTesteEsperadoErro(){
        IContratoDAO dao = new ContratoDAO();
        ContratoService service = new ContratoService(dao);
        service.excluir("nomme");
    }

}
