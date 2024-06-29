public class CountingOccurrences {

    public char getRandomLowerCaseLetter() {
        return (char) ('a' + Math.random() * ('z' - 'a' + 1));
    }

    public int countOccurrences(char[] arr, char c) {
        int count = 0;
        for (int i : arr) {
            if (i == c) {
                count++;
            }
        }
        return count;
    }

    public char[] generateRandomLetter(int length){
        char[] letters = new char[length];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = getRandomLowerCaseLetter();
        }
        return letters;
    }
}

