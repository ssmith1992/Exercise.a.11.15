package Chapter11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
If the list is empty, return 0.
 */
public class Exercise15 {
    public static void main(String[] args)
    {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(4);
        list.add(4);
        list.add(4);
        list.add(4);

        Exercise15 exercise15 = new Exercise15();
        System.out.println("max occurrences: " + exercise15.maxOccurrences(list));
    }

    private int maxOccurrences(List<Integer> list)
    {
        if(list.size() == 0) return 0;
        else
        {
            Map<Integer, Integer> map = new HashMap<>();
            int max = 0;

            for (Integer values:list)
            {
                if (map.containsKey(values))
                {
                    map.put(values, map.get(values)+1);
                    if (map.get(values) > max) max = map.get(values);
                }
                else
                {
                    map.put(values, 1);
                }
            }
            return max;
        }
    }
}
