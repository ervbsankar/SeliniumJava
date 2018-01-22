package codility;

class Solution {

    public static void main(String[] args){
        System.out.println(solution("ace","bdc"));
    }

    public static int solution(String S, String T) {
        // write your code in Java SE 8
        int[] characterCount = new int[26];
        char alphabet = 'a';
        char[] stringToChar = S.toCharArray();

        countDifference(T, characterCount, alphabet, stringToChar);

        int difference = 0;
        for(int i = 0; i < characterCount.length; i++) {
            difference += Math.abs(characterCount[i]);
        }

        return difference;
    }

    private static void countDifference(String T, int[] characterCount, char alphabet, char[] stringToChar){
        for(int i = 0; i < stringToChar.length; i++) {
            characterCount[stringToChar[i] - alphabet]++;
        }
        stringToChar = T.toCharArray();
        for(int i = 0; i < stringToChar.length; i++){
            characterCount[stringToChar[i] - alphabet]--;
        }

    }
}
