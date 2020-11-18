package kata4.Main;

import java.util.List;
import kata4.Model.Histogram;
import kata4.Model.Mail;
import kata4.View.HistogramDisplay;
import kata4.View.MailHistogramBuilder;
import kata4.View.MailListReader;

public class Kata4 {

    public static void main(String[] args) {
        String fileName = new String("email.txt");
        List<Mail> mailList = MailListReader.read(fileName);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        
        Histogram<String>histogram1 = new Histogram();
        histogram.increment("ulpgc.es");
        histogram.increment("dis.ulpgc.es");
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("hotmail.com");
        
        HistogramDisplay histo = new HistogramDisplay("HISTOGRAM...",histogram);
        histo.execute();
    }
    
}
