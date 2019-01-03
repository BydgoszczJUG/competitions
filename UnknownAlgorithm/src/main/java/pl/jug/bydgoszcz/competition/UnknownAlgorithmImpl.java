package pl.jug.bydgoszcz.competition;

import java.util.List;

public class UnknownAlgorithmImpl {
    public static List<Integer> doCalculation(List<Integer> input) {
        // find buckets number
        int max = 0;
        for (int value : input) if (max < value) max = value;

        // create buckets
        int counter[] = new int[max + 1];

        // fill buckets
        for (int i : input) counter[i]++;

        // do something
        for (int idx = 0, i = 0; i < counter.length; i++) while (0 < counter[i]--) input.set(idx++, i);

        return input;
    }
}
