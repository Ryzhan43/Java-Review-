import java.util.HashMap;
import java.util.Map;

public class TestTwoSum {
    public static void main(String[] args) {
        int[] arrayAtt = new int[]{2,7,9,11,22};
        int[] arrayResult = twoSumSolutionBetterOne(arrayAtt, 20);

        for (int i : arrayResult) System.out.println(i);
    }

    public static int[] twoSumSolution(int[] array, int target){

        for(int i=0; i<array.length-1; i++){
            for(int j=i+1; j<array.length; j++){
                if((array[i]+array[j] == target)) return new int[]{i,j};
            }
        }

        return new int[]{};
    }

    public static int[] twoSumSolutionBetterOne(int[] array, int target){
        Map<Integer, Integer> map = new HashMap<>();


        for(int i=0; i<array.length;i++){
            int potentialMatch=target-array[i];
            if(map.containsKey(potentialMatch)) return new int[]{map.get(potentialMatch), i};
            else map.put(array[i], i);
        }
        return null;
    }
}
