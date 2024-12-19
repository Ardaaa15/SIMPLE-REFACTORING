import java.util.*;
public class NinjaFruit {

    public static void main(String[] args) {
        List <String> buah = Arrays.asList("apel", "pisang", "kiwi", "anggur", "semangka"); //{} -> <>

        System.out.println("Total huruf: " + calcuLateTotalLenght(buah));
        System.out.println("Kata terpanjang: " + findLongestWord(buah));
        System.out.println("Daftar kata dalam huruf kapital: " + capitalizerWords(buah));
        System.out.println("Panjang masing-masing kata: " + wordLenght(buah));
    }

    public static int calcuLateTotalLenght(List<String> words) {
        int totalLenght = 0;
        for (int i = 0; i < words.size(); i++) { //
            totalLenght += words.get(i).length();
        }
        return totalLenght;
    }

    public static String findLongestWord(List<String> words) {
        if (words.isEmpty()) {
            throw new IllegalArgumentException("List kosong");
        }
        String longestWord = "";
        for (String word : words) {
            if (word != null && word.length() > longestWord.length()) {
                longestWord = word;
            } else if (word != null && word.length() <= longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static List<String> capitalizerWords(List<String> words) {
        List<String> capitalized = new ArrayList<>();
        for (String word : words) {
            capitalized.add(word.substring(0).toUpperCase()); //
        }
        return capitalized;
    }

    public static List<Integer> wordLenght(List<String> words) {
        List<Integer> lenghts = new ArrayList<>();
        for (String word : words) { //
                lenghts.add(word.length());  //
            }
        return lenghts;
    }
}




