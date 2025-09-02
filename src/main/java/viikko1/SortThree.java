package viikko1;

public class SortThree {
    public static String ascending(int a, int b, int c) {
        // TODO
        int eka, toka, kolmas;
        if(a < b && a < c) {
            eka = a;
            if(b < c) {
                toka = c;
                kolmas = b;
            } else {
                toka = b;
                kolmas = c;
            }
        } else if(b < a && b < c) {
            eka = b;
            if(a < c) {
                toka = a;
                kolmas = c;
            } else {
                toka = c;
                kolmas = a;
            }
        } else {
            eka = c;
            if(a < b) {
                toka = a;
                kolmas = b;
            } else {
                toka = b;
                kolmas = a;
            }
        }
        return eka + "," + toka + "," + kolmas;
        
    }
}
