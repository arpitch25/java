import java.util.Scanner;

class wordexample {
    private String strdata;

    wordexample(String s) {
        strdata = s.trim();
    }

    void countWord() {
        String s = strdata.substring(0, strdata.length() - 1);
        String[] words = s.split("\\s+");
        int count = 0;

        for (String w : words) {
            if (isVowel(w.charAt(0)) && isVowel(w.charAt(w.length() - 1))) {
                count++;
            }
        }
        System.out.println("Number of words beginning and ending with vowel: " + count);
    }

    void placeWord() {
        String s = strdata.substring(0, strdata.length() - 1);
        String[] words = s.split("\\s+");
        String first = "";
        String second = "";

        for (String w : words) {
            if (isVowel(w.charAt(0)) && isVowel(w.charAt(w.length() - 1))) {
                first += w + " ";
            } else {
                second += w + " ";
            }
        }

        System.out.println((first + second).trim());
    }

    boolean isVowel(char ch) {
        return ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence in UPPER CASE ending with . ? or !");
        String input = sc.nextLine();

        wordexample obj = new wordexample(input);
        obj.countWord();
        obj.placeWord();
    }
}