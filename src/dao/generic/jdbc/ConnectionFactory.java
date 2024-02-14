package dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    private static Connection connection;

    private ConnectionFactory(Connection connection){

    }

    public static Connection getConnection(String cliente_or_product) throws SQLException {
        if(connection == null){
            connection = initConnection(cliente_or_product);
        } else if (connection != null && connection.isClosed()) {
            connection = initConnection(cliente_or_product);
        }

        return connection;
    }

    private static Connection initConnection(String db){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("jdbc:postgresql://localhost:5432/");
        if(db.equals("cliente")){
            stringBuilder.append("cliente_2");
        } else {
            stringBuilder.append("produto_2");
        }
        String link = stringBuilder.toString();

        try {
            return DriverManager.getConnection(
                    link, "postgres", "admin");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}



















