package viikko1;

public class PasswordAttempts {
    public static String login(String[] tries) {
        // TODO
        int yri = 0;
        int n = 0;
        while(yri < tries.length) {
            if(tries[yri] == "java123") {
                n = 1;
            }
            yri++;
        }
        if(yri > 3) {
            return "Liian monta virheellistä yritystä.";
        }
        if(n == 1) {
            return "Tervetuloa!";
        }
        return "Liian monta virheellistä yritystä.";
    }
}