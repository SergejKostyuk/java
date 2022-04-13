package lesson8;

import java.sql.*;

public class HomeWork8 {
    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:lesson8.bd") ;
        Statement statement = connection.createStatement()){
            performDropTable(statement); // очистка таблицы
            performCreateGB(statement); // создание таблицы
            populateGB(statement,connection); // вставка записи
            readWeatherGB(statement); // чтение данных

        }
    }
    private static void performDropTable(Statement statement) throws SQLException {
        statement.executeUpdate("DROP TABLE IF EXISTS weather");
    }
    private static void  performCreateGB(Statement statement) throws SQLException{
        statement.executeUpdate("CREATE TABLE IF NOT EXISTS weather (city STRING, localDate STRING, weatherText STRING, temperature DOUBLE);");
    }
    private static void populateGB (Statement statement, Connection connection) throws SQLException{
        connection.setAutoCommit(false);
        for (int i = 1 ; i < 10_000; i++){
            statement.executeUpdate("INSERT INTO weather (city, localDate, weatherText, temperature) VALUES ('weather" + i +"'," + i +"," + i +"," + i +");");
        }
        connection.commit();
    }
    private static void  readWeatherGB (Statement statement) throws SQLException{
        ResultSet resultSet = statement.executeQuery("SELECT * FROM weather");
        while (resultSet.next()){
            System.out.println(resultSet.getString("city") + "|"+
                    resultSet.getString("localDate") + "|" +
                    resultSet.getString("temperature") + "|");
        }
    }

}
