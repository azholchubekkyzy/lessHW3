package com.company;

public class Main {

    public static void main(String[] args) {
        double first = 0.0;
        boolean intel = false;
        double result;

        int desire = 0;

        double [] array = {-1.2, -1.3, -1.4, -1.5, -1.6, -1.7, -1.8, 1.1, 1.2, 1.3, 1.4, 1.5, 1.6, 1.7, 1.8};

        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1));
        }
        for  (double arr: array) {
            if (intel) {
                arr += first;
                desire++;
            }
            if (arr < 0) {
                intel = true;
            }
        }
        result = first / desire;
        System.out.println(result);


        }


        }




