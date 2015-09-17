package QuickSort;

import java.util.ArrayList;

/**
 * Created by Jesus Zarate on 9/16/15.
 *
 * Implementation of QuickSort
 */
public class QuickSort
{
    private static ArrayList<Integer> list;
    public static void Sort(ArrayList<Integer> _list)
    {
        list = _list;

        if(list != null && list.size() > 0)
            QuickSort(0, list.size() - 1);
    }

    public static void QuickSort(int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = list.get(pivotPoint(low, high));

        while(i <= j)
        {
            // Walk through the list until we find
            // a number that is on the wrong side of
            // the pivot
            while (list.get(i) < pivot)
                i++;
            while (list.get(j) > pivot)
                j--;

            // If the indices have not overlapped
            // swap them to put their values on
            // the correct side of the list.
            if(i <= j)
            {
                swap(i, j);
                i++;
                j--;
            }
        }
        if(low < j)
            QuickSort(low, j);
        if(high > i)
            QuickSort(i, high);
    }

    /**
     * Given two indices from the list it will
     * swap them.
     *
     * @param index1
     * @param index2
     */
    private static void swap(int index1, int index2)
    {
        int temp1 = list.get(index1);
        int temp2 = list.get(index2);

        list.remove(index1);
        list.add(index1, temp2);
        list.remove(index2);
        list.add(index2, temp1);
    }

    /**
     * Returns the index of the location of the pivot point
     * in the arrayList.
     * @return
     */
    public static int pivotPoint(int low, int high)
    {
        if(list == null || list.isEmpty())
            return 0;

        int mid = high / 2;

        int average = (list.get(low) + list.get(mid) + list.get(high)) / 3;

        // Take the difference of the number in the list and which ever has the smallest
        // difference will be the median.
        int min = Math.abs(average - list.get(low)) < Math.abs(average - list.get(mid)) ? low : mid;
        return  Math.abs(average - list.get(min)) < Math.abs(average - list.get(high)) ? min : high;
    }

}
