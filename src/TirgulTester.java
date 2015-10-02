import java.io.Console;
import java.util.Stack;

public class TirgulTester {

    public static void main(String args[]) {
        TirgulNew tirgul = new TirgulNew();
       // String s1 = "TheExamIsEasy";
       // String s2 = "The*xamIs*y";
//        String s4 = "**";
      //  String s5 = " TheExamIsEasy";
      //  String s6 = " The*IsHard";
       // String s7 = " The**IsHard";




/*
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
*/

        // System.out.println(tirgul.split(new int [] {6,1,2,4} , 3));
        //System.out.println(tirgul.findDuplicated(new int [] {6,1,2,4, 2}));
        //tirgul.zeroDistance(new int [] {0,1,1,1,1,1,1,0,1,1,1,1,1,0,1,1});
        //System.out.println(tirgul.f1(2468));
        //System.out.println(tirgul.f3(46789));
        //System.out.println(tirgul.f4(87654));
        //System.out.println(tirgul.something(5555));
 /*B w1 = new B (2,3);
      B w2 = new D (1.5,6);
      B w3 = new D (2.3,8,9);
      A w4 = new A (null,w1);
      A w5 = new A (w4,w3);

      w1.f(w1);
      w1.f(w2);
      w2.f(w1);
      w2.f(w2);*/
   /* BinaryTree bint = new BinaryTree() {};
      Node root = new Node(300);
      Node p3 = root._leftSon = new Node(125);
      Node q2 = root._rightSon = new Node(40);
      Node p2 = root._rightSon._rightSon = new Node(500);

      Node p1 = root._leftSon._leftSon =  new Node(180);
      Node q3 = root._leftSon._rightSon = new Node(15);
      root._leftSon._leftSon._leftSon = new Node(150);


      Node q1 = root._leftSon._rightSon._rightSon = new Node(200);
      Node p4 = root._leftSon._rightSon._leftSon = new Node(175);
      root._leftSon._rightSon._leftSon._rightSon = new Node(140);
      root._leftSon._rightSon._leftSon._leftSon = new Node(130);

       // System.out.println(bint.secret(root, p1, q1).get_data());
       // System.out.println(bint.secret(root, p2, q2).get_data());
        System.out.println(bint.secret(root, p3, q3).get_data());
        System.out.println(bint.secret(root, p4, q1).get_data());*/
      //Stack s11 = new Stack();

      //s11.toString();
     // bint.g(root, s11);

      /*int mat[][] = new int[][]
              {
                      {3,13,15,28,30},
                      {40,51,52,29,30},
                      {28,10,53,54,53},
                      {53,12,55,53,60},
                      {70,62,56,20,80},
                      {80,81,90,95,100},

              };*/
        //System.out.println(tirgul.shortestPath(mat));
        //int mat [] = {-2,3,5,7,12};
        //System.out.println(tirgul.sum2(mat, 10));
        //System.out.println(tirgul.sum3(mat, 17));
        //General
       //int mat2[][] = new int[][]
                {
                      //  {3,13,15,28,30},
                      //  {50,51,52,29,30},
                     //   {51,10,53,54,55},
                    //    {53,12,14,53,11},
                    //    //{80,81,90,95,100},

                };
        //System.out.println(tirgul.longestWorm(mat2));
       // int [] arr = new int [] {2,15,3,4,2,5};
        //int[] arr2 = new int[]{1, 1, 3, 7};
        //int[] arr3 = new int[]{-7, -3, 0, 1, 3, 5, 12, 14, 17, 19, 25, 30};

        //System.out.println(tirgul.splitEqualMult(arr));
        //System.out.println(tirgul.splitEqualMult(arr2));//**//*//**//**//**//**//*
        // TirgulNew.printAllSum(arr2, 8);
      /* // tirgul.printPairs(arr3, 6);
        Base [] arr = new Base[5];
        arr[0] = new Derived1(12,20);
        arr[1] = new Derived2(33,44);
        arr[2] = new Derived3(34,10);
        arr[3] = new Derived1(51,72);
        arr[4] = new Derived2(58,99);

        for (int i = 0; i < arr.length; i++)
        {
            System.out.println("i = " +i);
            arr[i].run();
        }

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
        System.out.println(arr[0].equals(arr1[1]));*/

/*
        int mat3[][] = new int[][]
                {
                        {3, 8, 7, 1},
                        {5, 15, 2, 4},
                        {12, 14, -13, 22},
                        {13, 16, 17, 52},
                        //{80,81,90,95,100},

                };

        tirgul.printPath(mat3);*/

        /*int [] arr4 = new int [] {49,51,52,53,54,65,70,-5,3,48};
        System.out.println(tirgul.findMax(arr4));*/

       // tirgul.zubi(5,3);
        //int [] farr = new int [] {2,4,14, 1,2,3,4, 86, 2, 4, 7, 54, 16, 10, 15 };
        //System.out.println(tirgul.f(farr, 100));
      /*  String s3 = "x12y3348";
        String s1 = "321";
        String s0 = "xyz";
        String sEmpty = "";
        String s4 = "23256892";*/

       // System.out.println(tirgul.longOrdNumRec(s4));
        //int[] a1 = new int[] {1,4,13,6,0,19};
        //System.out.println(tirgul. smallestSub(a1, 42));


    }
}
