/*class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            if(!list.contains(a[i])){
                list.add(a[i]);
            }
        }
         for(int i=0;i<b.length;i++){
            if(!list.contains(b[i])){
                list.add(b[i]);
            }
        }
        Collections.sort(list);
        return list;
    }
}*/
class Solution {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {

        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = 0;

        while (i < a.length && j < b.length) {

            if (a[i] < b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
            }
            else if (a[i] > b[j]) {
                if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                    ans.add(b[j]);
                }
                j++;
            }
            else { // a[i] == b[j]
                if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                    ans.add(a[i]);
                }
                i++;
                j++;
            }
        }

        // Remaining elements of a[]
        while (i < a.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != a[i]) {
                ans.add(a[i]);
            }
            i++;
        }

        // Remaining elements of b[]
        while (j < b.length) {
            if (ans.isEmpty() || ans.get(ans.size() - 1) != b[j]) {
                ans.add(b[j]);
            }
            j++;
        }

        return ans;
    }
}