class Solution {
    public int maxConsecBits(int[] arr) {
        // code here
        int max=0,cnt=1;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]==arr[i+1]){
                cnt+=1;
            }else{
                max=Math.max(max,cnt);
                cnt=1;
            }
        }
        
        max=Math.max(cnt,max);
        return max;
    }
}
