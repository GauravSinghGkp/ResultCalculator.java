package com.company;

import java.awt.image.SinglePixelPackedSampleModel;
import java.util.Scanner;

public class ResultCalculator {
    public static void main(String[] args) {
        // Taking Input
        System.out.println("Enter Yours Marks : ");
        Scanner sc = new Scanner(System.in);
        System.out.print("Hindi : ");
        float hindi = sc.nextFloat();
        System.out.print("English : ");
        float english = sc.nextFloat();
        System.out.print("Physics : ");
        float physics = sc.nextFloat();
        System.out.print("Chemistry : ");
        float chemistry = sc.nextFloat();
        System.out.print("Math : ");
        float math = sc.nextFloat();
        // Reasult Prepering
        int TotalMarks = 500;
        float MarksGet = hindi + english + physics + chemistry + math;
        System.out.print("Total Marks : ");
        System.out.println(MarksGet);
        float Persentage = MarksGet * 100 / TotalMarks;
        System.out.print("Persentage : ");
        System.out.println(Persentage);
        // Grade
        System.out.print("Grade : ");
        if (Persentage >= 90)
            System.out.println("A+");
        else if (Persentage >= 80)
            System.out.println("A");
        else if (Persentage >= 70)
            System.out.println("B+");
        else if (Persentage >= 60)
            System.out.println("B");
        else if (Persentage >= 50)
            System.out.println("C");
        else if (Persentage >= 40)
            System.out.println("D");
        else if (Persentage >= 30)
            System.out.println("E");
        else if (Persentage < 30)
            System.out.println("F");
    }
}
