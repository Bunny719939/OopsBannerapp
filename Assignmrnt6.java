public class Assignmrnt6 {

    public static void main(String[] args) {

        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Print banner using loop
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }

    // Static method for O
    public static String[] buildO() {
        return new String[]{
                "OOOOO",
                "O   O",
                "O   O",
                "O   O",
                "OOOOO"
        };
    }

    // Static method for P
    public static String[] buildP() {
        return new String[]{
                "PPPPP",
                "P   P",
                "PPPPP",
                "P",
                "P"
        };
    }

    // Static method for S
    public static String[] buildS() {
        return new String[]{
                "SSSSS",
                "S",
                "SSSSS",
                "    S",
                "SSSSS"
        };
    }
}