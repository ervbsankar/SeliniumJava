package com.Examples;

import java.util.*;

public class Elevator {


    public int solution(int[] A, int[] B, int M, int X, int Y) {

        int totalStops = 0;
        int counter = 0;
        boolean queueNotEmpty = true;
        int totalPeople = A.length;

        while (queueNotEmpty) {
            int totalWeightPerRound = 0;
            int totalPeoplePerRound = 0;
            List<Integer> floorPerRound = new ArrayList<>();
            for (; counter < totalPeople; ) {
                if (((totalWeightPerRound + A[counter]) <= Y) && ((totalPeoplePerRound + 1) <= X)) {
                    totalWeightPerRound += A[counter];
                    floorPerRound.add(B[counter]);
                    totalPeoplePerRound += 1;
                    counter += 1;
                } else {
                    break;
                }
            }

            Set<Integer> hs = new HashSet<>();
            hs.addAll(floorPerRound);

            totalStops += hs.size() + 1;

            if (totalPeople == counter) {
                queueNotEmpty = false;
            }
        }

        System.out.println("total Stops : " + totalStops);

        return totalStops;
    }
}
