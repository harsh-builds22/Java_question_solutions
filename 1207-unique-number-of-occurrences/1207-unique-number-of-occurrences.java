class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int arrvalue : arr) {
            map.put(arrvalue, map.getOrDefault(arrvalue , 0) + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (!set.contains(entry.getValue())) {
                set.add(entry.getValue());
            } else {
                return false;
            }
        }

        return true;

    }

}