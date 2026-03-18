public class analyser {

    void analyse(String str) {
        int vowels = 0, dig = 0, special = 0, cons = 0;
        str = str.toUpperCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vowels++;
                } else {
                    cons++;
                }
            } else if (ch >= '0' && ch <= '9') {
                dig++;
            } else if (ch != ' ') {
                special++;
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + cons);
        System.out.println("Digits = " + dig);
        System.out.println("Special Characters = " + special);
    }

    void analyse(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        System.out.println("Character '" + ch + "' appears " + count + " times");
    }

    void analyse(String str, String word) {
        int count = 0;
        String arr[] = str.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equalsIgnoreCase(word)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Word exists and appears " + count + " times");
        } else {
            System.out.println("Word does not exist in the string");
        }
    }

    public static void main(String[] args) {
        analyser obj = new analyser();
        obj.analyse("Hello World 123@");
        obj.analyse("Programming", 'g');
        obj.analyse("Java is simple and Java is powerful", "Java");
    }
}
