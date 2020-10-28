
package Kata3_28102020;

public class Kata3_28102020 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram();
        
        histogram.increment("ulpgc.es");
        histogram.increment("ull.es");
        histogram.increment("hotmail.es");
        histogram.increment("udlaspalmas.es");
        histogram.increment("hotmail.es");
        histogram.increment("udlaspalmas.es");
        histogram.increment("hotmail.es");
        histogram.increment("udlaspalmas.es");
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("HISTOGRAM", histogram);
        histogramDisplay.execute();
    }
    
}
