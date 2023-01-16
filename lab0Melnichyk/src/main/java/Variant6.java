import java.util.Arrays;
import java.util.Scanner;

public class Variant6 {
    public int[] aInteger(int a) {
        int[] res = new int[2];

        if (a < 10 && a < 100) {
            System.out.println("Incorrect num! Rewrite");
        } else {

            res[0] = a / 10;
            res[1] = a % 10;

        }
        return res;
    }

    public  boolean aBoolean(int a , int b , int c) {

        if (a < b && b < c) {
            return true;
        } else {
            return false;
        }
    }

    public  int MinMax(int a, int b) {
        int max = a;
        //int a = 0,b = 0;

        if (max < b) {
            max = b;
        } else {
            max = a;
        }
        return max;
    }

    public  double Mass(double length, int numOfLength) {
        switch (numOfLength) {
            case 1:
                return (length / 10);

            case 2:
                return (length * 1000);

            case 3:
                return (length);

            case 4:
                return (length / 1000);

            case 5:
                return (length / 100);

            default:
                return 0;

        }

    }

    public double[] Cost(int cost, double[] mass) {

        double[] res = new double[mass.length];
        for (int i = 0; i < mass.length; i++) {
            res[i] = mass[i]*cost;
        }


        return res;
    }

    public  double doubleFact(int n) {
        int res = 1;

        while (n >= 1) {
            res *= n;
            n -= 2;
        }

        return res;
    }

    public int[] minmax(int[] a) {
        int[] res = new int[2];
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        res[0] = min;
        res[1] = max;

        return res;
    }

    public  int[] arr(int a, int b, int n) {
        int[] array = new int[n];
        if (n <= 2) {
            System.out.println("n <= 2, Error!!!");
        } else {
            array[0] = a;
            array[1] = b;
            int sum = array[0] + array[1];
            for (int i = 2; i < n; i++) {
                array[i] = sum;
                sum += array[i];
            }
        }
        return array;
    }

    public void matr(int q, int[] mass) {
        int m = mass.length, n = mass.length;
        int[][] matrix = new int[m][n];
        int c = 0;

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                if (mass.length > c) matrix[i][0] = mass[c++];
            }

        }

        for (int i = 1; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                matrix[i][j] = matrix[i - 1][j] * q;
            }
        }

        for (int i = 0; i <= m; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.println(":" + matrix[i][j]);
                System.out.println(":");
            }

        }
    }


    public static void main(String[] args) {
        Variant6 obj = new Variant6();
        System.out.println(Arrays.toString(obj.aInteger(24)));

        System.out.println(obj.aBoolean(2,3,4));
        System.out.println(obj.MinMax(3, 4));
        System.out.println(  obj.Mass(2, 2));

        double[] mass = new double[]{1.2,1.4,1.6,1.8,2};
//        System.out.println(Arrays.toString(Cost(2,mass)));
        System.out.println(obj.doubleFact(4));

        //minmax(new int[]{2,3,4,5,1,9,6,1});
        //arr(3,2,9);
        //  matr(3, new int[]{2, 3, 4, 5, 1, 9, 6, 1});

    }
}

