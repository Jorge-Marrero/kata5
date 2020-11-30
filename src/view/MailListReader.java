package view;

import java.util.List;
import model.Mail;
import java.sql.*;
import java.util.ArrayList;

public class MailListReader {
    public static List<Mail> read() throws ClassNotFoundException, SQLException {
        List<Mail> mail = new ArrayList<>();
        Class.forName("org.sqlite.JDBC");
        Connection connection = DriverManager.getConnection("jdbc:sqlite:data/tabla.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("SELECT email FROM 'us-500'");
        while (resultSet.next()){
            String email = resultSet.getString("email");
            Mail aux_email = new Mail(email);
            mail.add(aux_email);
        }
        return mail;
    }
}
