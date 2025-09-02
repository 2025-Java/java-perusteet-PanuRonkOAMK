package viikko1;

public class TimesTable {
    public static String table(int n) {
        // TODO
        int i = 1;
        String taulu ="";
        while (i <= 10) {
            int tulos = i * n;
            taulu = taulu + (n + " x " + i + " = " + tulos + "\n");
            i += 1;
        }
        return taulu;
    }
}
