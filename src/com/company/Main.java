package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] A = new int[5];
        int[] B = new int[5];

        boolean flag = false;
        while (!flag)
            for (int n : A)
                for (int m : B)
                    if (n == m)
                        flag = true;

        System.out.println(flag);
    }
}
