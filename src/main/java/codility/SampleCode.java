package codility;

public class SampleCode {

    public static void main(String[] args){
        SampleCode obj  = new SampleCode();
        System.out.println(obj.solutions("sankar", "bheem"));
    }

    private int solutions(String firstStr, String secondStr){

        int[] characterArrayCount = new int[26];
        char[] firstCharArr = firstStr.toLowerCase().toCharArray();
        char[] secondCharArr = secondStr.toLowerCase().toCharArray();


        adjustCount(firstCharArr, secondCharArr,characterArrayCount);


        int sum = 0;

        for (int aCharacterArrayCount : characterArrayCount) {
            sum += Math.abs(aCharacterArrayCount);

        }

        return sum;

    }



    private void adjustCount(char[] firstStringArr, char[] secondStringArr, int[] characterArrayCount) {

        char oneChar = 'a';
        for (char aFirstStringArr : firstStringArr) {
            characterArrayCount[aFirstStringArr - oneChar]++;
        }

        for (char aSecondStringArr : secondStringArr) {
            characterArrayCount[aSecondStringArr - oneChar]--;
        }

    }

}
