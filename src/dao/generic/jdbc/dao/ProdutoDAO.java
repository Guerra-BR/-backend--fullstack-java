package dao.generic.jdbc.dao;

import dao.generic.jdbc.ConnectionFactory;
import domin.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class ProdutoDAO implements IProdutoDAO{
    @Override
    public Integer cadastrar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection("p");
            String sql = getSqlcadastro();
            stm = connection.prepareStatement(sql);
            adicionarParametrosInsert(stm, produto);
            return stm.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }



    @Override
    public Integer atualizar(Produto produto) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try {
            connection = ConnectionFactory.getConnection("p");
            String sql = getSqlUpdate();
            stm = connection.prepareStatement(sql);
            adicionarParametrosUpdate(stm, produto);
            return stm.executeUpdate();
        }catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }



    @Override
    public Produto buscar(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        Produto produto = null;

        try {
            connection = ConnectionFactory.getConnection("p");
            String sql = getSqlBuscar();
            stm = connection.prepareStatement(sql);
            adicionarParametrosBuscar(stm, codigo);
            rs =  stm.executeQuery();

            if(rs.next()){
                produto = new Produto();
                Long id = rs.getLong("ID");
                String nome = rs.getString("NOME");
                String cd = rs.getString("CODIGO");
                Double valor = rs.getDouble("VALOR");
                produto.setCodigo(cd);
                produto.setId(id);
                produto.setValor(valor);
                produto.setNome(nome);
            }

        }catch (Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, rs);
        }

        return produto;
    }


    @Override
    public Integer excluir(String codigo) throws Exception {
        Connection connection = null;
        PreparedStatement stm = null;

        try{
            connection = ConnectionFactory.getConnection("product");
            String sql = getDeleteSql();
            stm = connection.prepareStatement(sql);
            adicionarParametrosDelete(stm, codigo);
            return stm.executeUpdate();
        } catch(Exception e){
            throw e;
        } finally {
            closeConnection(connection, stm, null);
        }
    }

    private void adicionarParametrosDelete(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    private String getDeleteSql() {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE FROM TB_PRODUTO_2 ");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }

    @Override
    public List<Produto> buscarTodos() throws Exception {
        return null;
    }

    private String getSqlcadastro() {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO BT_PRODUTO (ID, NOME, CODIGO, VALOR)");
        sb.append("VALUES (nextval('sq_produto_2'),?,?,?)");

        return sb.toString();
    }



    private void adicionarParametrosInsert(PreparedStatement stm, Produto p) throws SQLException {
        stm.setString(1, p.getNome());
        stm.setString(2, p.getCodigo());
        stm.setDouble(3, p.getValor());
    }

    private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
        stm.setString(1, produto.getNome());
        stm.setString(2, produto.getCodigo());
        stm.setDouble(3, produto.getValor());
        stm.setLong(4, produto.getId());
    }

    private String getSqlUpdate() {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE TB_PRODUTO_2 ");
        sb.append("NOME = ?, CODIGO = ?, VALOR = ? ");
        sb.append("WHERE ID = ?");
        return sb.toString();
    }

    private void adicionarParametrosBuscar(PreparedStatement stm, String codigo) throws SQLException {
        stm.setString(1, codigo);
    }

    private String getSqlBuscar() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM TB_PRODUTO_2 ");
        sb.append("WHERE CODIGO = ?");
        return sb.toString();
    }


    private void closeConnection(Connection connection, PreparedStatement stm, ResultSet rs) {
        try {
            if(rs !=null && rs.isClosed()){
                rs.close();
            }
            if(stm !=null && rs.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e1){
            e1.printStackTrace();
        }


        try{
            if(rs != null && rs.isClosed()){
                rs.close();
            }
            if(stm != null && rs.isClosed()){
                stm.close();
            }
            if(connection != null && !connection.isClosed()){
                connection.close();
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
