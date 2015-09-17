import QuickSort.QuickSort;

import java.util.ArrayList;

/**
 * Created by Jesus Zarate on 9/15/15.
 */
public class Main
{
    public static void main(String args[])
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(7);
        list.add(2);
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(8);
        list.add(6);
        list.add(9);
        list.add(10);


//        list.add(5);
//        list.add(7);
//        list.add(22);
//        list.add(9);
//        list.add(23);
//        list.add(14);
//        list.add(2);


        QuickSort.Sort(list);

        //QuickSort2.setList(list);
        //QuickSort.QuickSort2(list);
        //System.out.println(list.get(QuickSort.pivotPoint(0, list.size() -  1)));

        //QuickSort.Sort(list);

        System.out.println(list);
        list = new ArrayList<Integer>();
        list.add(7);
        list.add(23);
        list.add(96);
        list.add(6);
        list.add(15);
        list.add(1);
        list.add(0);
        list.add(77);
        list.add(6);
        list.add(55);
        list.add(55);
        list.add(9);
        list.add(0);
        list.add(0);
        list.add(0);
        list.add(10);
        list.add(5);

        QuickSort.Sort(list);
        System.out.println(list);

    }
}
