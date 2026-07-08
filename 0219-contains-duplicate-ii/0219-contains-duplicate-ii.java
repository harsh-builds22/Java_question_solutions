class Solution {
        public boolean containsNearbyDuplicate(int[] arr , int k){
      Set<Integer> set = new HashSet<>();

      for (int i = 0; i <  Math.min(k , arr.length); i++){
          if(set.contains(arr[i])){
              return true;
          }

          set.add(arr[i]);
      }


   for (int i = k ; i< arr.length; i++){
        if(set.contains(arr[i])){
            return true;
       }

        set.add(arr[i]);
        set.remove(arr[i-k]);
   }




         return false;
  }
}