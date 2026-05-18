class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer>map = new HashMap<>();
        for (int num: nums){
            if (!map.containsKey(num)){
                map.put(num, 1);
            } else{
                map.put(num, map.get(num)+ 1);
            }
            
        }
        List<Integer>[] buckets = new ArrayList[nums.length + 1];
        for (int num: map.keySet()){
            int freq = map.get(num);

            if (buckets[freq] == null){
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(num);
        }

        int[]result = new int[k];
        int index = 0;

        for (int freq = buckets.length - 1; freq >=0; freq--){
            if (buckets[freq] != null){
                for (int num: buckets[freq]){
                    result[index] = num;
                    index++;
                
                if (index == k){
                    return result;
                }
            }
        }
        

        
    }
    return result;
}
}
