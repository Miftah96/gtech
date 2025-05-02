public class ReverseGenerator {

    public static String reverseWord(String word) {
        char[] chars = word.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            start++;
            end--;
        }

        return new String(chars);
    }


    public static String reverseSentence(String sentence) {
        String result = "";
        String word = "";

        for (int i = 0; i < sentence.length(); i++) {
            char currentChar = sentence.charAt(i);

            if (currentChar != ' ') {
                word += currentChar;
            } else {
                result += reverseWord(word) + " ";
                word = "";
            }
        }

        result += reverseWord(word);

        return result;
    }

    public static void main(String[] args) {
        String kalimat = "Nama saya John Doe";
        String hasil = reverseSentence(kalimat);

        System.out.println(hasil.toLowerCase());
    }
}
