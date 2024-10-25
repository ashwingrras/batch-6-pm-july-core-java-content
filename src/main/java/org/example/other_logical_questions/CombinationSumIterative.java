package org.example.other_logical_questions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIterative {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<List<Integer>> queue = new ArrayList<>();

        queue.add(new ArrayList<>());

        while (!queue.isEmpty())
        {
            // Get the current combination
            List<Integer> current = queue.removeLast();
            int currentSum = sum(current);

            // Check if we reached the target
            if (currentSum == target)
            {
                result.add(new ArrayList<>(current));
            }

            if (currentSum >= target)
            {
                continue;
            }

            for (int candidate : candidates)
            {
                List<Integer> newCombination = new ArrayList<>(current);
                newCombination.add(candidate); // Add the candidate to the current combination
                queue.add(newCombination); // Add new combination to the queue
            }
        }

        return result;
    }

    private int sum(List<Integer> combination)
    {
        int total = 0;
        for (int num : combination) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        CombinationSumIterative cs = new CombinationSumIterative();
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        System.out.println(cs.combinationSum(candidates1, target1)); // Output: [[2, 2, 3], [7]]

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        //System.out.println(cs.combinationSum(candidates2, target2)); // Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

        int[] candidates3 = {2};
        int target3 = 1;
        //System.out.println(cs.combinationSum(candidates3, target3)); // Output: []
    }
}


