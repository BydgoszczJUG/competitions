package pl.jug.bydgoszcz.competition;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MagicJavaParameter {
    private static class MyComparator implements Comparator<Integer> {
        private int comparisonCount = 0;
        
        @Override
        public int compare(Integer o1, Integer o2) {
            comparisonCount++;
            return o1 - o2;
        }

        public int getComparisonCount() {
            return comparisonCount;
        }
    }

    public static void main(String ... argv){
        List<Integer> inputList = Arrays.asList(new Integer[] { 66, 121, 100, 103, 111, 115, 122, 99, 122, 32, 74, 85, 71 });
        MyComparator comparator = new MyComparator();
        inputList.sort(comparator);
        System.out.println(comparator.getComparisonCount());
    }
}
