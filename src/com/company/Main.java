package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int[] A = {8, 7, 8, 9, 8};
        int[] B = {1, 2, 3, 4, 5};

        boolean flag = false;
        boolean out = false;
        while (!flag && !out)
            for (int n : A)
            {
                for (int m : B)
                    if (n == m)
                        flag = true;

                if (n == A[A.length - 1] && !false)
                    out = true;
            }

        System.out.println(flag);
    }
}
