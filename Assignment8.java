import java.util.HashMap;
import java.util.Map;

public class Assignment8 {

    public static void main(String[] args) {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                "OOOOO",
                "O   O",
                "O   O",
                "O   O",
                "OOOOO"
        });

        patternMap.put('P', new String[]{
                "PPPPP",
                "P   P",
                "PPPPP",
                "P",
                "P"
        });

        patternMap.put('S', new String[]{
                "SSSSS",
                "S",
                "SSSSS",
                "    S",
                "SSSSS"
        });

        renderBanner("OOPS", patternMap);
    }

    // Function to render banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int height = patternMap.get('O').length;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    line.append(pattern[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }
}