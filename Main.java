public class Main {
    public static void main(String[] args) {
        String sampleSentence = "hi - are you there";
        System.out.println(sampleSentence);
        String[] singleWords = sampleSentence.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (int i = singleWords.length - 1; i >= 0; i--) {
            reversedWords.append(singleWords[i]).append(" ");
        }
        System.out.println(reversedWords);

        StringBuilder reversedCharacters = new StringBuilder();
        for (int i = 0; i < singleWords.length; i++) {
            reversedCharacters.append(new StringBuilder(singleWords[i]).reverse()).append(" ");
        }
        System.out.println(reversedCharacters.toString().trim());
    }
}
