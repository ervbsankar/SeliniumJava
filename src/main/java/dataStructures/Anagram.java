package dataStructures;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Anagram {

    public static void main(String[] args) throws Exception{
        int[] diffArr = new int[26];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstName = br.readLine();
        String secondName = br.readLine();
        System.out.println(numberNeeded(firstName, secondName, diffArr));
    }

    private static int numberNeeded(String first, String second, int[] diffArr) throws Exception {
        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();
        findValue(firstChar, secondChar, diffArr);

        int difference=0;
        for(int diff : diffArr){
            difference += Math.abs(diff);
        }

        return difference;

    }

    private static void findValue(char[] firstChar, char[] secondChar, int[] diffArr){
        int offset = 'a';
        for (char aFirstChar : firstChar) {
            diffArr[aFirstChar - offset]++;
        }

        for (char aSecondChar : secondChar) {
            diffArr[aSecondChar - offset]--;
        }
    }
}
