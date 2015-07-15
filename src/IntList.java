/**
 * Created by aviad on 11/07/2015.
 */
public class IntList {

       // private IntNode _head;
        public IntList( ) {
            _head = null;
        }
        public IntList (IntNode node) {
            _head = node;
        }
    public int longestAscending ()
    {
        return longestAscending(_head, _head.getValue(), 0 ,0);
    }

    public int longestAscending (IntNode _head, int currentValue, int highestValue, int count)
    {
        if (_head == null)
        {
            return 0;
        }
        if (_head.getNext() != null)
        {

            if (currentValue > highestValue)
            {
                highestValue = currentValue;
                count++;
            }

        }
        if (_head.getNext() == null )
       return count += currentValue > highestValue ? 1 : 0;
        return longestAscending(_head.getNext(),_head.getNext().getValue(), highestValue, count);

    }


        private IntNode _head;



        public IntList(int[] arr)
        {
            _head = new IntNode (arr[0], null);
            IntNode prv = _head;
            for(int i = 1; i < arr.length; i++)
            {
                prv.setNext(new IntNode(arr[i], null));
                prv = prv.getNext();
            }
        }

        /*public IntList (IntNode node)
        {
            _head = node;
        }

        public int longestAscending()
        {
            return longestAscending(_head, 0);
        }

        public int longestAscending(IntNode ind, int max)
        {
            if(ind == null || ind.getNext() == null)
                return max;
            int test = countAscending(ind, ind, ind.getNext(),1);
            if(test > max)
                max = test;
            return longestAscending(ind.getNext(), max);

        }

        public int countAscending(IntNode head, IntNode last, IntNode ind, int count)
        {
            if(ind == null || ind.getValue() < head.getValue())
                return count;

            if(last.getValue() < ind.getValue())
                return countAscending(head, ind,ind.getNext(),count+1);

            return countAscending(head, last,ind.getNext(),count);
        }

        public String toString()
        {
            String print = "";
            for(IntNode prv = _head; prv != null; prv = prv.getNext())
                print += prv.getValue()+" ";
            return print;
        }
    }*/

    }
