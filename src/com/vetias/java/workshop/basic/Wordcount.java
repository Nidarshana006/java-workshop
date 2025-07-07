package src.com.vetias.java.workshop.basic;

public class Wordcount {
    public static void main(String[] args){
        String sentence="This program shows how can we split a string we need to find it";
        String send[] = sentence.split("\\. ");
        int sentencecount = send.length;
        System.out.println("no of lines:"+sentencecount);
        String words[] = sentence.split(" ");
        int wordCount = words.length;
        System.out.println("no of words:"+wordCount);
        String letter[] = sentence.split("");
        int letters = letter.length;
        System.out.println("no of letters:"+letters);


}
}