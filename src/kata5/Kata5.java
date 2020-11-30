package kata5;

import java.sql.*;
import java.util.List;
import model.Histogram;
import model.Mail;
import view.HistogramDisplay;
import view.MailHistogramBuilder;
import view.MailListReader;


public class Kata5 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        List<Mail> mailList = MailListReader.read();
        Histogram<String> mailHistogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histogram = new HistogramDisplay("Histogram", mailHistogram);
        histogram.execute();
    }
    
}
