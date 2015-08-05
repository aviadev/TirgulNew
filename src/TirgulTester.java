import java.util.Stack;

public class TirgulTester {

    public static void main (String args[]) {
        TirgulNew tirgul = new TirgulNew();
 /* String s1 = "TheExamIsEasy";
        String s2 = "The*xamIs*y";
        String s3 = "Th*mIsEasy*";
        String s4 = "**";
        String s5 = " TheExamIsEasy";
        String s6 = " The*IsHard";
        String s7 = " The**IsHard";




System.out.println(tirgul.samePattern(s1, s2));
		System.out.println(tirgul.samePattern(s1, s3));
		System.out.println(tirgul.samePattern(s1, s4));
		System.out.println(tirgul.samePattern(s1, s5));
		System.out.println(tirgul.samePattern(s1, s6));
		System.out.println(tirgul.samePattern(s1, s7));
        int[] a = {1, 3};
        int[] res = {1, 4};
        int[] s = {4, 5};
        int[] ss1 = {4, 9, 3};
        System.out.println(tirgul.isSumOf(s, 13));
        System.out.println(tirgul.isSumOf(ss1, 15));
        System.out.println(tirgul.fixedPoint(new int[]{-3, 0, 2, 4, 11, 12, 15}));

       // System.out.println(tirgul.split(new int [] {6,1,2,4} , 3));
      //System.out.println(tirgul.findDuplicated(new int [] {6,1,2,4, 2}));
      //tirgul.zeroDistance(new int [] {0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1});
      //System.out.println(tirgul.f1(2468));
      //System.out.println(tirgul.f3(46789));
      //System.out.println(tirgul.f4(87654));
      //System.out.println(tirgul.something(5555));
 B w1 = new B (2,3);
      B w2 = new D (1.5,6);
      B w3 = new D (2.3,8,9);
      A w4 = new A (null,w1);
      A w5 = new A (w4,w3);

      w1.f(w1);
      w1.f(w2);
      w2.f(w1);
      w2.f(w2);
    BinaryTree bint = new BinaryTree() {};
      Node root = new Node(50);
      root._leftSon = new Node(45);
      root._rightSon = new Node(100);
      root._rightSon._rightSon = null;
      root._rightSon._leftSon = null;
      root._leftSon._leftSon =  new Node(10);
      root._leftSon._leftSon._leftSon = new Node(20);
      root._leftSon._leftSon._leftSon._leftSon = null;
      root._leftSon._rightSon = new Node(25);
      root._leftSon._rightSon._rightSon = new Node(30);
      //null right + left
      root._leftSon._rightSon._rightSon._leftSon = null;
      root._leftSon._rightSon._rightSon._rightSon = null;
      root._leftSon._rightSon._leftSon = new Node(15);
      root._leftSon._rightSon._leftSon._rightSon = new Node(40);
      root._leftSon._rightSon._leftSon._rightSon._rightSon = null;
      root._leftSon._rightSon._leftSon._rightSon._leftSon = null;

      root._leftSon._rightSon._leftSon._leftSon = new Node(80);
      root._leftSon._rightSon._leftSon._leftSon._leftSon = null;
      root._leftSon._rightSon._leftSon._leftSon._rightSon = null;



      Stack s11 = new Stack();

      s11.toString();
      bint.g(root, s11);

      int mat[][] = new int[][]
              {
                      {3,13,15,28,30},
                      {40,51,52,29,30},
                      {28,10,53,54,53},
                      {53,12,55,53,60},
                      {70,62,56,20,80},
                      {80,81,90,95,100},

              };
      // System.out.println(tirgul.shortestPath(mat));
      //int mat [] = {-2,3,5,7,12};
      //System.out.println(tirgul.sum2(mat, 10));
      //System.out.println(tirgul.sum3(mat, 17));
	    //General
*//*int mat2[][] = new int[][]
                {
                        {3,13,15,28,30},
                        {50,51,52,29,30},
                        {51,10,53,54,55},
                        {53,12,14,53,11},
                        //{80,81,90,95,100},

                };
        System.out.println(tirgul.longestWorm(mat2));*//*
       // int [] arr = new int [] {2,15,3,4,2,5};
        int [] arr2 = new int [] {1,1,3,7};
        int [] arr3 = new int [] {-7,-3,0,1,3,5,12,14,17,19,25,30};

      *//*  System.out.println(tirgul.splitEqualMult(arr));
        System.out.println(tirgul.splitEqualMult(arr2));*//*
       // tirgul.printAllSum(arr2, 8);
       // tirgul.printPairs(arr3, 6);*/
       /* Base [] arr = new Base[5];
        arr[0] = new Derived1(12,20);
        arr[1] = new Derived2(33,44);
        arr[2] = new Derived3(34,10);
        arr[3] = new Derived1(51,72);
        arr[4] = new Derived2(58,99);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("i = " +i);
            arr[i].run();
        }*/

        AA [] arr = new AA[4];
        arr[0] = new AA();
        arr[1] = new AA(1);
        arr[2] = new BB();
        arr[3] = new BB(1,2);

        BB [] arr1 = new BB [2];
        arr1[0] = new BB();
        arr1[1] = new BB(1,2);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + "\t" +arr[i]);
        }

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(i + "\t" +arr1[i]);
        }

        System.out.println(arr[0].equals(arr[1]));
        System.out.println(arr[2].equals(arr[3]));
        System.out.println(arr1[0].equals(arr1[1]));
        System.out.println(arr1[0].equals(arr[0]));
        System.out.println(arr[0].equals(arr1[0]));
        System.out.println(arr1[1].equals(arr[0]));
        System.out.println(arr[0].equals(arr1[1]));
    }




}
