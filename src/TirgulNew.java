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

    public static boolean split(int[] a, int diff) {
        return split(a, diff, " ", 0, 0, 0, a.length - 1);
    }

    public static boolean split(int[] a, int diff, String message, int tempSum, int tempSum2, int i, int j) {
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


    public static int findDuplicated(int[] arr) {
        int sumVectors = 0, sumSquares = 0, sumSquares1 = 0;
        int n = arr.length;
        int dup = 0;

        for (int num : arr) {
            sumVectors += num;
            sumSquares += Math.pow(num, 2);
        }
        System.out.println("SumVectores: " + sumVectors);
        System.out.println("sumSquares: " + sumSquares);
        int sumVectorsNew = (n * (n - 1) / 2) - sumVectors;
        System.out.println("SumVectores new: " + sumVectorsNew);
        sumSquares1 = (n * (n - 1) * ((2 * n) - 1) / n) - sumSquares;
        System.out.println("sumSquares1: " + sumSquares1);
        int tenp = (sumVectorsNew + sumSquares1) / 2;
        System.out.println("tenp: " + tenp);
        dup = (sumVectorsNew - sumSquares1) / 2;
        System.out.println("dup: " + dup);


        return dup;
    }

    public static void zeroDistance(int[] a) {
        int counter = 1;
        int lastKnownZeroIndex = -1;
        int currentZeroIndex = -1;
        int indexDelta = 0;
        for (int i = 0, j = a.length, mid = a.length / 2; i < j; i++) {
            if (a[i] != 0) {
                a[i] = counter;
                counter++;
            } else {
                if (lastKnownZeroIndex == -1) //This is the first "Zero" Show
                {
                    lastKnownZeroIndex = i;
                    counter = 1;

                } else {
                    currentZeroIndex = i;
                    counter = 1;
                    indexDelta = (currentZeroIndex - lastKnownZeroIndex) / 2;
                    lastKnownZeroIndex = i;
                    for (mid = currentZeroIndex - 1; counter <= indexDelta; mid--) {
                        a[mid] = counter;
                        counter++;
                    }
                    counter = 1;
                }
            }
        }
        for (int i : a) {
            System.out.print(i + " ,");
        }

    }

    public static boolean f1(int n) {
        if (n < 10)
            return true;
        if (n % 10 <= (n / 10) % 10)
            return false;
        return f1(n / 10);
    }

    public static boolean f2(int n) {
        if (n < 10)
            return true;
        if (n % 10 >= (n / 10) % 10)
            return false;
        return f2(n / 10);
    }

    public static boolean f3(int n) {
        if (n < 10)
            return true;
        if (n % 10 > (n / 10) % 10)
            return f1(n);
        if (n % 10 == (n / 10) % 10)
            return false;
        return f3(n / 10);
    }

    public static boolean f4(int n) {
        if (n < 10)
            return true;
        if (n % 10 < (n / 10) % 10)
            return f1(n);
        if (n % 10 == (n / 10) % 10)
            return false;
        return f4(n / 10);
    }

    public static boolean something(int n) {
        if (n < 10)
            return true;

        if (n % 10 == (n / 10) % 10)
            return false;
        if (n % 10 < (n / 10) % 10)
            return f3(n);
        return f4(n);
    }


    public static boolean sum2(int[] arr, int num) {
        int i = 0, j = arr.length - 1;
        if (num < arr[0]) return false;
        if (arr.length == 1) return false;

        while (i < j) {
            if (arr[i] + arr[j] < num) {

                i++;

            } else if (arr[i] + arr[j] > num) {
                j--;

            } else if (arr[i] + arr[j] == num) {
                return true;
            }
        }
        return false;
    }

    public static boolean sum3(int[] arr, int num) {
        int i = 0, mid = arr.length / 2, j = arr.length - 1;
        if (num < arr[0]) return false;
        if (arr.length == 1) return false;
        boolean res = false;
        while (i < j && !res) {
            res = sum2(arr, num - arr[i]);
            i++;
        }
        return res;
    }


    //q1
    public static int longestWorm(int[][] mat) {
        return longestWorm(mat, 0, 0, 0);
    }


    public static boolean splitEqualMult(int[] a) {
        return splitEqualMulty(a, 0, 1, 1);
    }

    private static boolean splitEqualMulty(int[] a, int i, int sum1, int sum2) {
        if (a.length == 1) return false;
        if (a.length == 2) return a[0] == a[1];
        if (sum1 == sum2) return true;

        if (i > a.length - 1) return false;
        return splitEqualMulty(a, i + 1, a[i] * sum1, sum2) || splitEqualMulty(a, i + 1, sum1, a[i] * sum2);
        //splitEqualMulty(a, i+1, a[i]+sum1, sum2) || splitEqualMulty(a,i+1, sum1, a[i]*sum2);


    }

    private static int calculate(int[] a, int i, int mid, int sum) {
        if (a.length == 1) return a[0];
        else if (i < mid)
            sum = calculate(a, i + 1, mid, a[i] * sum);
        return sum;
    }


    public static void PrintAll(int[] a, int sum) {
        PrintAll(a, 0, 0, 0, " ");
    }


    private static void PrintAll(int[] a, int num, int sum, int i, String s) {
        if (a.length < 2) return;
        if (i >= a.length - 1 || num > sum) return;
        if (num == sum)
            s += "1";
        if (num != sum)
            s += "0";
        if (s.length() == a.length)
            System.out.print(s);

        PrintAll(a, num + a[i], sum, i + 1, s);
    }

    public static void printAllSum(int[] a, int sum) {
        printAllSum(a, sum, "0", 1, 0);
    }

    private static void printAllSum(int[] a, int sum, String s, int i, int tempNum) {
        if (s.length() == a.length)
            if (tempNum == sum)
                System.out.println(s);
            else {
                printAllSum(a, sum, s + "0", s.length() + 1, tempNum);
                printAllSum(a, sum, s + "1", s.length() + 1, tempNum + a[s.length()]);
            }

    }

    public static void printPairs(int[] a, int k) {
        if (a.length < 2)
            return;

        for (int i = 0, j = 1; i < a.length && j < a.length; ) {
            if (a[j] - a[i] == k) {
                System.out.println("Pair Found: (" + a[i] + "," + a[j] + ")");
                i++;
                j++;

            } else if (a[j] - a[i] > k) {
                i++;
            } else if (a[j] - a[i] < k) {
                j++;
            }

        }

    }


    public static int findMax(int[] arr) {
        int i = 0, mid, j = arr.length - 1;

        while (i + 1 < j) {
            mid = (i + j) / 2;
            if (arr[mid] < arr[j])
                j = mid;
            else
                i = mid;
        }
        return arr[i];
    }

    public static boolean splitEqualMult2(int[] a) {
        return splitEqualMult2(a, 0, 1, 1);
    }

    private static boolean splitEqualMult2(int[] a, int i, int sum1, int sum2) {
        if (a.length < 2) return false;
        if (a.length == 2) return a[0] == a[1] ? true : false;
        if (i > a.length - 1) return false;
        if (sum1 == sum2) return true;

        return splitEqualMult2(a, i + 1, a[i] * sum1, sum2) || splitEqualMult2(a, i + 1, sum1, a[i] * sum2);

    }

   /* public static void zubi (int n, int k)
    {
        zubi(n,k,"");
    }*/

   /* private static void zubi (int n, int k, String s)
    {
        if (k == 0) System.out.println(s);
        else if (n > 0)
        {
            zubi(n-1, k, s);
            zubi(n-1, k-1, n+s);
        }
    }*/

    public static int shortestPath(int[][] mat) {
        return shortestPath(mat, 0, 0, 1, 0);
    }

    public static int shortestPath(int[][] mat, int x, int y, int stepsCount, int min) {
        if (x == mat.length - 1 && y == mat[0].length - 1) {
            if (min == 0)
                min = stepsCount;
            else
                min = stepsCount < min ? stepsCount : min;
            return min;
        } else {
            if (y - 1 >= 0 && mat[x][y] < mat[x][y - 1])
                stepsCount += shortestPath(mat, x, y - 1, stepsCount - 1, min);

            else if (y < mat[0].length - 1 && mat[x][y] < mat[x][y + 1])
                stepsCount += shortestPath(mat, x, y + 1, stepsCount + 1, min);

            else if (x - 1 >= 0 && mat[x][y] < mat[x - 1][y])
                stepsCount += shortestPath(mat, x - 1, y, stepsCount - 1, min);

            else if (x < mat.length - 1 && mat[x][y] < mat[x + 1][y])
                stepsCount += shortestPath(mat, x + 1, y, stepsCount + 1, min);
        }
        return stepsCount;

    }

    private static int longestWorm(int[][] mat, int x, int y, int max) {
        int count = 1;
        count = checkComb(mat, x, y, count);
        if (max < count)
            max = count;
        if (y < mat[0].length - 1)
            max = longestWorm(mat, x, y + 1, max);
        if (x < mat.length - 1)
            max = longestWorm(mat, x + 1, y, max);
        return max;
    }

    private static int checkComb(int[][] mat, int x, int y, int count) {
        if (y < mat[0].length - 1 && (mat[x][y] + 1) == mat[x][y + 1])
            count = checkComb(mat, x, y + 1, count + 1);
        else if (x < mat.length - 1 && (mat[x][y] + 1) == mat[x + 1][y])
            count = checkComb(mat, x + 1, y, count + 1);
        else if (y > 0 && (mat[x][y] + 1) == mat[x][y - 1])
            count = checkComb(mat, x, y - 1, count + 1);
        else if (x > 0 && (mat[x][y] + 1) == mat[x - 1][y])
            count = checkComb(mat, x - 1, y, count + 1);
        return count;
    }

    public static void printPath(int[][] mat) {
        printPath(mat, 0, 0, "");
    }

    private static void printPath(int[][] mat, int i, int j, String path) {
        if (i < mat.length - 1 && mat[i][j] < mat[i + 1][j]) {
            path += "(" + i + "," + j + ")";
            printPath(mat, i + 1, j, path);

        } else if (j < mat[0].length - 1 && mat[i][j] < mat[i][j + 1]) {
            path += "(" + i + "," + j + ")";
            printPath(mat, i, j + 1, path);

        } else if (i - 1 >= 0 && mat[i][j] < mat[i - 1][j]) {
            path += "(" + i + "," + j + ")";
            printPath(mat, i - 1, j, path);


        } else if (j - 1 >= 0 && mat[i][j] < mat[i][j - 1]) {
            path += "(" + i + "," + j + ")";
            printPath(mat, i, j - 1, path);

        } else {
            path += "(" + i + "," + j + ")";
            System.out.println(path);

        }

    }

    public static int f(int[] a, int k) {
        int sum, count, i, prev;

        if (a.length == 1 && a[0] > k)
            return 1;
        else if (a.length == 1 && a[0] <= k)
            return 2;

        count = a.length;
        sum = a[0];
        i = 1;
        prev = 0;

        while (i < a.length) {
            if (sum + a[i] <= k) {
                sum += a[i];
                i++;
            } else if (sum + a[i] > k) {
                if (count > a[i] - a[prev] + 1)
                    count = a[i] - a[prev] + 1;
                sum -= a[prev];
                prev++;
            }
        }

        return count;
    }

    public static int longOrdNumLoop(String s) {
        String legalChars = "0123456789";
        int count = 0, bigCount = 0;

        for (int i = 0; i < s.length() - 1; i++) {

            char currentChar = s.charAt(i);
            char nextChar = s.charAt(i + 1);
            if (count > bigCount)
                bigCount = count;

            if (legalChars.indexOf(currentChar) != -1) {
                if (count == 0)
                    count = 1;
                if (currentChar < nextChar)
                    count++;
                else count = 1;
            } else count = 0;

        }
        return bigCount;
    }

    public static int longOrdNumRec(String s) {
        if (s.length() > 1)
            return longOrdNumRec(s, s.charAt(0), s.charAt(1), 0, 0, 0);
        else return longOrdNumRec(s, s.charAt(0), s.charAt(0), 0, 0, 0);
    }

    private static int longOrdNumRec(String s, char currentChar, char nextChar, int i, int count, int bigCount) {
        String legalChars = "0123456789";
        if (i > s.length() - 2) return bigCount;

        if (count > bigCount)
            bigCount = count;

        if (legalChars.indexOf(currentChar) != -1) {
            if (count == 0)
                count = 1;
            if (currentChar < nextChar)
                count++;
            else count = 1;
        } else count = 0;
        bigCount = longOrdNumRec(s, s.charAt(i), s.charAt(i + 1), i + 1, count, bigCount);
        return bigCount;
    }

    public static int smallestSub(int[] a, int k) {

        int count = 0, smallestCount = a.length, sum = 0;
        if (a.length == 0 || a == null) return 0;
        if (a.length == 1) {
            if (a[0] > k) return 1;
            else return 2;
        }
        int i = (a.length / 2) - 1;
        int j = i + 1;

        while (i > -1 && j < a.length)
        {
            if (a[i] > k || a[j] > k) return 1;
            if (sum > k) return count;
            else
            {
                if (j < a.length)
                {
                    sum += a[j];
                    j++;
                }

                else
                    if (i > -1)
                    {
                        sum += a[i];
                        i--;
                    }
                count ++;
            }
        }
        return count;
    }
}








    //end q1


