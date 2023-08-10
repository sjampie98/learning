package com.hillel.course1.hometasks;

public class HomeworkTask2 {
    public static void main(String[] args) {
        float a = 4;
        float b = 5;
        float c = 9;

        //| a- b | / (a + b) ^3 - √c
        float result = (float)(((Math.abs(a - b)) / (Math.pow(a + b, 3))) - ((float)Math.sqrt(c)));
        System.out.println(result);


        float absDiff = Math.abs(a - b);
        float sumCube = (float) Math.pow(a + b, 3);
        float sqrtC = (float) Math.sqrt(c);
        double result2 = (absDiff / sumCube) - sqrtC;
        System.out.println((float) result2);
    }
}
