public class Classroom {
    public static void main(String[] args) {
        Wilder[] wilders = {
            new Wilder("Numa", true),
            new Wilder("Toto", false),
        };

        for (Wilder wilder : wilders)
            wilder.whoAmI();
    }
}
