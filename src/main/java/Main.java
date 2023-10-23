import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        // Проверка добавления в таблицу данных
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/netology", "root", "mysql");
        Statement statement = connection.createStatement();

        statement.executeUpdate("insert into CUSTOMERS (name, surname, age, phone_number) values ('Alexey', 'Карвахаль', 34, '+79047779356')");
        statement.executeUpdate("insert into ORDERS (date, customer_id, product_name, amount) values (CURDATE(), 11, 'Carrot cutlets', 120)");
        statement.close();
    }
}
