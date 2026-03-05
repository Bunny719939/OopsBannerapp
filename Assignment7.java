public class Assignment7 {

    // Static inner class
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "OOOOO",
                "O   O",
                "O   O",
                "O   O",
                "OOOOO"
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "PPPPP",
                "P   P",
                "PPPPP",
                "P",
                "P"
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "SSSSS",
                "S",
                "SSSSS",
                "    S",
                "SSSSS"
        });

        // Store patterns in array for word "OOPS"
        CharacterPattern[] bannerChars = {O, O, P, S};

        int height = bannerChars[0].getPattern().length;

        // Print banner
        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (CharacterPattern cp : bannerChars) {
                line.append(cp.getPattern()[i]).append("  ");
            }

            System.out.println(line);
        }
    }
}