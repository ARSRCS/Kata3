package kata3;

public class Kata3 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<>();
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("gmail.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("outlook.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("yahoo.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        histogram.increment("ulpgc.com");
        new HistogramDisplay(histogram).execute();
    }
}