package com.hillel.course1.hometasks;
//V = (4/3) * π * r^3
public class Homework {
    public static void main(String[] args) {
        float radius = 0.5f;
        float radiusFirst = 0.2f;
        float radiusSecond = 1.0f;
        float koff = 0.7f;

        //for radius 0.5
        var vFormula = (((float)4 / 3) * Math.PI) * (float) Math.pow(radius, 3);
        var mSnowBall = vFormula * koff;
        System.out.println("0.5 " + mSnowBall);

        //for radius 0.2
        var vFormulaFirst = (((float)4 / 3) * Math.PI) * (float) Math.pow(radiusFirst, 3);
        var mSnowBallFirst = vFormulaFirst * koff;
        System.out.println("0.2 " + mSnowBallFirst);

        //for radius 1.0
        var vFormulaSecond = (((float)4 / 3) * Math.PI) * (float) Math.pow(radiusSecond, 3);
        var mSnowBallSecond = vFormulaSecond * koff;
        System.out.println("1.0 " + mSnowBallSecond);

        //result
        float result = (float) (mSnowBall + mSnowBallFirst + mSnowBallSecond);
        System.out.println("result " + result);
    }

}
