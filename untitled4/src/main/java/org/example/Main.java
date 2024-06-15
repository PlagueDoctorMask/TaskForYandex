package org.example;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();


        String commands = scanner.nextLine();
        scanner.close();


        char[] F = {'R', 'L'};
        char[] L = {'R', 'F'};
        char[] R = {'F', 'L'};

        ArrayList<Integer> results = new ArrayList<>();
        boolean isRight = true;
        int currentPosition = 0;


        for (int i = 0; i < N; i++) {
            char command = commands.charAt(i);
            if (command == 'F') {
                Fchange(F, i, N, commands, isRight, currentPosition, results);
            } else if (command == 'R') {
                Rchange(R, i, N, commands, isRight, currentPosition, results);
            }else{
                Lchange(L, i, N, commands, isRight, currentPosition, results);
            }
        }
        //System.out.println(results);
        long result = results.stream().distinct().count();
        System.out.println(result);
    }



    public static void Fchange(char[] F, int i, int N, String commands,boolean isRight, int currentPosition, ArrayList<Integer> results){
        for (char C : F) {
            ArrayList<String> letterList = new ArrayList<>();
            char[] charArray = commands.toCharArray();
            for (char c : charArray) {
                letterList.add(String.valueOf(c));
            }

            letterList.set(i, String.valueOf(C));
            for (int j = 0; j < N; j++) {
                String command1 = letterList.get(j);
                if (Objects.equals(command1, "F")) {
                    if (isRight) {
                        currentPosition++;
                    }
                    else {
                        currentPosition--;
                    }
                }
                else if (Objects.equals(command1, "R")) {
                    isRight=true;
                }
                else {
                    isRight=false;
                }

            }
            results.add(currentPosition);
            currentPosition = 0;
        }


    }

    public static void Rchange(char[] R, int i, int N, String commands,boolean isRight, int currentPosition, ArrayList<Integer> results){
        for (char C : R) {
            ArrayList<String> letterList = new ArrayList<>();
            char[] charArray = commands.toCharArray();
            for (char c : charArray) {
                letterList.add(String.valueOf(c));
            }

            letterList.set(i, String.valueOf(C));
            for (int j = 0; j < N; j++) {
                String command1 = letterList.get(j);
                if (Objects.equals(command1, "F")) {
                    if (isRight) {
                        currentPosition++;
                    }
                    else {
                        currentPosition--;
                    }
                }
                else if (Objects.equals(command1, "R")) {
                    isRight=true;
                }
                else {
                    isRight=false;
                }

            }
            results.add(currentPosition);
            currentPosition = 0;
        }


    }

    public static void Lchange(char[] L, int i, int N, String commands,boolean isRight, int currentPosition, ArrayList<Integer> results){
        for (char C : L) {
            ArrayList<String> letterList = new ArrayList<>();
            char[] charArray = commands.toCharArray();
            for (char c : charArray) {
                letterList.add(String.valueOf(c));
            }

            letterList.set(i, String.valueOf(C));
            for (int j = 0; j < N; j++) {
                String command1 = letterList.get(j);
                if (Objects.equals(command1, "F")) {
                    if (isRight) {
                        currentPosition++;
                    }
                    else {
                        currentPosition--;
                    }
                }
                else if (Objects.equals(command1, "R")) {
                    isRight=true;
                }
                else {
                    isRight=false;
                }

            }
            results.add(currentPosition);
            currentPosition = 0;
        }


    }

}
