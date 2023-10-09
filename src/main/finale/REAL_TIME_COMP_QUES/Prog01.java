package main.finale.REAL_TIME_COMP_QUES;


//Find palindrom in the given file.
public class Prog01 {

    public static void main(String[] args) {
        String line = "im am aac HERO ABCBA";
        String[] words = line.split(" ");
        for(String s : words){
            if(isPalindrome(s)){
                System.out.println(s);
            }
        }
    }

    public static boolean isPalindrome(String word){
        return word.equals(new StringBuilder(word).reverse().toString());
    }
}
