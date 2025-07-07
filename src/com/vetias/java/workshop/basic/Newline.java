package src.com.vetias.java.workshop.basic;

   public class Newline{

    
     public static void main(String[] args){
        String sentence="This program shows how can we split a string into multiple";
        String words[] = sentence.split(" ");
        for (String word : words)
        {
        System.out.println(word);
        }
    } 
}
