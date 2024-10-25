package org.example.other_logical_questions;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target)
    {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = start; i < candidates.length; i++)
        {
            if (candidates[i] > target) continue; // Skip if the candidate exceeds the remaining target
            current.add(candidates[i]);
            // We can use the same candidate again, hence we don't increment 'i'
            backtrack(result, current, candidates, target - candidates[i], i);
            current.removeLast(); // Backtrack
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] candidates1 = {2, 3, 6, 7};
        int target1 = 7;
        //System.out.println(cs.combinationSum(candidates1, target1)); // Output: [[2, 2, 3], [7]]

        int[] candidates2 = {2, 3, 5};
        int target2 = 8;
        System.out.println(cs.combinationSum(candidates2, target2)); // Output: [[2, 2, 2, 2], [2, 3, 3], [3, 5]]

        int[] candidates3 = {2};
        int target3 = 1;
        //System.out.println(cs.combinationSum(candidates3, target3)); // Output: []
    }
}
