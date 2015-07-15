import java.lang.Integer;

/**
 * Created by aviad on 10/07/2015.
 */
public class TirgulNew {

/* public static boolean samePattern (String s1, String s2)
    {
       return samePattern(s1, s2, 0, s1.length()-1, 0, s2.length()-1, 0 );

    }

    public static boolean samePattern (String s1, String s2, int i1, int j1, int i2, int j2, int jokerCount)
    {
       *//* if ((s1.isEmpty() && s2.length() == 1 && s2.charAt(0) != '*') || (s2.isEmpty() && !s1.isEmpty()))
        {
            return false;
        }*//*

        if ( i1 > j1 || i2 > j2 )
        {
            return false;
        }

        if (s1.substring(i1, i1).equals(s2.substring(i2, i2)))
        {
            i2++;
             return true;

        }

        if (s2.charAt(i1) == '*' && jokerCount<2)
        {
            jokerCount++;
            return s2.substring(i1);
        }

        return samePattern(s1, s2, i1+1, j1, i2, j2, jokerCount );
    }*/

    public static boolean samePattern(String s1, String s2) {
// base case
        if (s1.length() == 0) {
            if (s2.length() == 0 || s2.equals("*"))
                return true;
            else
                return false;
        } else if (s2.length() == 0)
            return false;
// rec calling
        if (s1.charAt(0) == s2.charAt(0))
            return samePattern(s1.substring(1), s2.substring(1));
        if ('*' == s2.charAt(0))
            return samePattern(s1.substring(1), s2) || samePattern(s1, s2.substring(1));
        else
            return false;
    }

    public static int sameAvgGroups(int[] a, int n, int[] res) {
        return sameAvgGroups(a, a.length, res, res.length, 0, 0, 0, 0);
    }

    public static int sameAvgGroups(int[] a, int n, int[] res, int m, int i, int j, int sumA, int sumRes) {
        if (i > n - 1 || j > m - 1)
            return 0;

        if (sumA == sumRes && n == m) {
            if (sumA / n == sumRes / m) {
                System.out.println("SecFunc: Array =  ");
                for (int k = 0; k < m; k++) {
                    System.out.print(res[k] + ", ");

                }
                System.out.println("\nSecFunc: Size of array is:");
                return m;
            }
            System.out.println("Array =  ");
            for (int k = 0; k < m; k++) {
                System.out.print(res[k] + ", ");

            }
            System.out.println("\nSize of array is:");
            return m;
        } else {
            return sameAvgGroups(a, n, res, m, i + 1, j, a[i], res[j]) != 0 ?
                    sameAvgGroups(a, n, res, m, i, j + 1, a[i], res[j]) != 0 ?

                            sameAvgGroups(a, n, res, m, i + 1, j + 1, a[i], res[j]) : 0 : 0;


        }
    }

    public static boolean isSumOf(int[] array, int n) {

        return isSumOf(array, n, "", 0);
    }

    private static boolean isSumOf(int[] array, int n, String numbers, int i) {
        if (n == 0) {
            System.out.print(numbers);
            return true;
        }
        if (n < 0 || i >= array.length)
            return false;

        return isSumOf(array, n - array[i], numbers + array[i] + "\t", i) ||
                isSumOf(array, n, numbers, i + 1) ||
                isSumOf(array, n - array[i], numbers + array[i] + "\t", i + 1);
    }


    public static int fixedPoint(int[] a) {
        int arraySize = a.length;
        int res = 0;
        for (int i = 0; i < arraySize; i++) {
            int currentNum = a[i];
            if (currentNum > i) return -1;
            else if (currentNum <= i) {
                if (currentNum == i) {

                    res = a[i];

                }
            }

        }
        return res;
    }

    public static boolean split(int[] a, int diff)
    {
        return split(a, diff, " ", 0, 0, 0, a.length - 1);
    }

    public static boolean split(int[] a, int diff, String message, int tempSum, int tempSum2, int i, int j)
    {
        //int otherSum = 29 - tempSum;
        if (a.length == 1 && a[i] == diff)
            return true;

        if (i >= a.length || j < 0) {
            return false;
        }

        /*if (29 - tempSum == diff || tempSum - 29 == diff)
        {

            return true;
        }*/

        if (tempSum2 - tempSum == diff || tempSum - tempSum2 == diff) return true;

        return split(a, diff, a[i] + "/t", tempSum += a[i], tempSum2, i + 1, j)
                ||
                split(a, diff, a[j] + "/t", tempSum2 += a[j], tempSum, i, j - 1);

    }


    public static int findDuplicated (int [] arr)
    {
        int sumVectors = 0, sumSquares = 0, sumSquares1 = 0;
        int n = arr.length;
        int dup = 0;

        for (int num : arr)
        {
            sumVectors += num;
            sumSquares += Math.pow(num, 2);
        }
        System.out.println("SumVectores: " + sumVectors);
        System.out.println("sumSquares: " + sumSquares);
        int sumVectorsNew = (n * (n - 1) / 2) - sumVectors;
        System.out.println("SumVectores new: " + sumVectorsNew);
        sumSquares1 = (n * (n - 1) * ((2*n) -1) / n) - sumSquares;
        System.out.println("sumSquares1: " + sumSquares1);
        int tenp = (sumVectorsNew + sumSquares1) /2;
        System.out.println("tenp: " + tenp);
        dup = (sumVectorsNew - sumSquares1) /2;
        System.out.println("dup: " + dup);



        return dup;
    }

    public static void  zeroDistance (int []a)
    {
        int counter = 1;
        int lastKnownZeroIndex = -1;
        int currentZeroIndex = -1;
        int indexDelta = 0;
        for (int i = 0, j = a.length, mid = a.length/2; i < j; i++)
        {
            if (a[i] != 0)
            {
                a[i] = counter;
                counter++;
            }
            else
            {
                if (lastKnownZeroIndex == -1) //This is the first "Zero" Show
                {
                    lastKnownZeroIndex = i;
                    counter = 1;

                }
                else
                {
                    currentZeroIndex = i;
                    counter = 1;
                    indexDelta = (currentZeroIndex - lastKnownZeroIndex) /2;
                    lastKnownZeroIndex = i;
                    for (mid = currentZeroIndex-1; counter <= indexDelta; mid--)
                    {
                        a[mid] = counter;
                        counter++;
                    }
                    counter = 1;
                }
            }
        }
        for (int i : a)
        {
            System.out.print(i + " ,");
        }

    }

    public static boolean f1 (int n)
    {
        if (n < 10)
            return true;
        if (n %10 <= (n / 10) %10)
            return false;
        return f1(n/10);
    }

    public static boolean f2 (int n)
    {
        if (n < 10)
            return true;
        if (n %10 >= (n / 10) %10)
            return false;
        return f2(n / 10);
    }

    public static boolean f3 (int n)
    {
        if (n < 10)
            return true;
        if (n %10 > (n / 10) %10)
            return f1(n);
        if (n %10 == (n / 10) %10)
            return false;
        return f3(n / 10);
    }

    public static boolean f4 (int n)
    {
        if (n < 10)
            return true;
        if (n %10 < (n / 10) %10)
            return f1(n);
        if (n %10 == (n / 10) %10)
            return false;
        return f4(n / 10);
    }

    public static boolean something (int n)
    {
        if (n < 10)
            return true;

        if (n %10 == (n / 10) %10)
            return false;
        if (n %10 < (n / 10) %10)
            return f3(n);
        return f4(n);
    }

    public static int shortestPath(int[][] mat)
    {
        int route = shortestPath(mat, 0, 0, 0);
        if (route == Integer.MAX_VALUE)
            return route;
            else
            return 0;
    }

    public static int shortestPath (int [][] mat, int i, int j, int stepsCount)
    {
        int M = mat[0].length;
        int N = mat.length;

        if (mat.length == 1)
            return 1;


        if (i == M-1 && j == N-1)

        {
            return stepsCount;
        }

        int up = Integer.MAX_VALUE;
        if(j-1 >= 0 && mat[i][j-1] > mat[i][j])
        {
            up = shortestPath(mat,i,j-1, stepsCount + 1);
        }
        int down = Integer.MAX_VALUE;
        if(j+1 < N  && mat[i][j+1] > mat[i][j])
        {
            down = shortestPath(mat,i,j+1, stepsCount + 1);
        }
        int left = Integer.MAX_VALUE;
        if(i-1 >= 0 && mat[i-1][j] > mat[i][j])
        {
            left = shortestPath(mat,i-1,j, stepsCount + 1);
        }
        int right = Integer.MAX_VALUE;
        if(i+1 < M && mat[i+1][j] > mat[i][j])
        {
            up = shortestPath(mat,i+1,j-1, stepsCount + 1);
        }

        if (up <= down && down <= left && left <= down)
        {
            return up;
        }
        if (down <= left && down <= up && down <= right)
            return down;
        if (left <= right && left <= up && left <= down)
            return left;
        else
            return right;
    }


    public static boolean sum2 (int [] arr, int num)
    {
        int sum = 0, firstNum = 0, secondNum = 0, i = 0, mid = arr.length/2, j = arr.length-1;
        if (num < arr[0]) return false;
        if (arr.length == 1) return false;

        while (i < j)
        {
            if (arr[i] + arr [j] < num)
            {
                i++;

            }

            else if (arr[i] + arr[j] > num)
            {
                j--;

            }

            else  if (arr[i] + arr[j] == num)
            {
                return true;
            }
        }
        return false;
    }

    public static boolean sum3 (int [] arr, int num)
    {
        int i = 0, mid = arr.length/2, j = arr.length-1;
        if (num < arr[0]) return false;
        if (arr.length == 1) return false;
        boolean res = false;
        while (i < j && !res )
        {
             res = sum2(arr, num - arr[i]);
            i++;
        }
        return res;
    }

}
