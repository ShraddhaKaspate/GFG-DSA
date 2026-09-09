class Solution {
    public boolean checkDuplicatesWithinK(int[] arr, int k) {
        // your code
        /*
        
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(j-i<=k){
                        return true;
                    }
                }
            }
        }
        return false;
        */
        
        HashMap<Integer,Integer>map=new HashMap<>();
        
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                
                if(i-map.get(arr[i])<=k){
                    return true;
                }
            }
            map.put(arr[i],i);
        }
        return false;
    }
}