public class Tester
{
    public static void main(String[] args)
    {
        int[] arrA = {2, 4, 1, 5, 10, 5, 3};
        IntList listA = new IntList(arrA);
        System.out.println("list A: "+listA);
        System.out.println(listA.longestAscending());
        int[] arrB = {1, 2, 4, 6, 8, 10, 15};
        IntList listB = new IntList(arrB);
        System.out.println("list B: "+listB);
        System.out.println(listB.longestAscending());
    }
}
