class Solution {
    public ArrayList<Integer> twoSum(int[] arr, int target) {
        // code here
        /*
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    list.add(i+1);
                    list.add(j+1);
                    return list;
                }
            }
        }
        list.add(-1);
        list.add(-1);
        return list;
        */
        

                ArrayList<Integer> list = new ArrayList<>();

                int left = 0;
                int right = arr.length - 1;

                while (left < right) {

                    int sum = arr[left] + arr[right];

                    if (sum == target) {
                        list.add(left + 1);
                        list.add(right + 1);
                        return list;
                    }
                    else if (sum > target) {
                        right--;
                    }
                    else {
                        left++;
                    }
                }

                list.add(-1);
                list.add(-1);

                return list;
            }
        }
