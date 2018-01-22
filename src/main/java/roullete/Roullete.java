package roullete;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Roullete {

    public static void main(String[] args) {
        List<String> posList = new ArrayList<>();
        int[] arr1 = {0,1,13,36,24,3,15,34,22,5,17,32,20,7,11,30,26,9,28};
        int[] arr2 = {0,2,14,35,23,4,16,33,21,6,18,31,19,8,12,29,25,10,27};
        int[] diff = {0,-1,-1,1,1,-1,-1,1,1,-1,-1,1,1,-1,-1,1,1,-1,1};
        int[] arr4 = {28,9,26,30,11,7,20,32,17,5,22,34,15,3,24,36,13,1,0};
        int[] arr3 = {27,10,25,29,12,8,19,31,18,6,21,33,16,4,23,35,14,2,0};
        List<Map<Integer, Integer>> samePosMap = new ArrayList<>();


        // opposite
        for (int i= 0; i < arr1.length; i++) {
            StringBuilder str = new StringBuilder();
            str.append(arr1[i] + "=");
            str.append(arr2[i] + "=");
            str.append(arr3[i] + "=");
            str.append(arr4[i]);
            posList.add(str.toString());
        }

    }
}
