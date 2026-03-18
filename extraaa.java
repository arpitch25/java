
//wap to input a string in upper case check if the string is valid if it ends with a full stop ? or !!!!  4
//the words may be seprated with more than single blank space 
// design member methods void convert this method converts the first letter
//  of the word to upper case while the rest remains in lowercase
//  void longest = this method calculated and prints the longest word of the string in case of multiple 
// occurances print the first occurance of the word

import java.util.Scanner;
public class extraaa {
    String str;

        void check() {
        if (!str.equals(str.toUpperCase())) {
            System.out.println("Invalid String");
            return;
        }
          if (!(str.endsWith(".") || str.endsWith("?") || str.endsWith("!"))) {
            System.out.println("Invalid String");
            return;
        }
        convert();
        longest();
    }

    void convert() {
        String s = str;
            if (s.endsWith("!"))
            s = s.substring(0, s.length() - 2);
        else
            s = s.substring(0, s.length() - 1);

        String words[] = s.trim().split(" +");
        System.out.println("Converted String:");
        for (String w : words) {
            System.out.print(
                w.substring(0, 1).toUpperCase() +
                w.substring(1).toLowerCase() + " "
            );
        }
        System.out.println();
    }
   void longest() {
        String s = str;

        if (s.endsWith("!"))
            s = s.substring(0, s.length() - 2);
        else
            s = s.substring(0, s.length() - 1);

        String words[] = s.trim().split(" +");
        String longWord = words[0];
        for (String w : words) {
            if (w.length() > longWord.length()) {
                longWord = w;
            }        }
        System.out.println("Longest Word: " + longWord);    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        extraaa obj = new extraaa();
        obj.str = sc.nextLine();
        obj.check();
        sc.close();
    }
}
