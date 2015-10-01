
package practica2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        Integer[] vector = {1,1,1,3,4,5,6,9,100,100,-4,-4};
        
        String[] vector1 = {"Ana","Juan","Pedro","Ana","Ana"};
        
        Histogram histo = new Histogram(vector1);
        HashMap <Object,Integer> histogram = histo.getHisto();
        
        for (Object key : histogram.keySet()) {
             System.out.println(key+ " : "+ histogram.get(key));
        }
    }
    
}
