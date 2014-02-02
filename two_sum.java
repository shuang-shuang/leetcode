public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int [] results = new int[2];
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < numbers.length; i++){
            if(hm.containsKey(numbers[i])){
                results[0] = hm.get(numbers[i]) + 1;
                results[1] = i+1;
                break;
            }
            else{
                hm.put(target - numbers[i], i);
            }
        }
        
        return results;
    }
}
