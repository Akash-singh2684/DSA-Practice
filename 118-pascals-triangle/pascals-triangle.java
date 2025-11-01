class Solution {
    public List<Integer> generateRow(int numRows){
         long ans = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for(int i =1; i< numRows; i++){
            ans = ans* (numRows - i);
            ans = ans / i;
            list.add((int)ans);
             }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> newlist = new ArrayList<>();
        for(int j=1; j<= numRows ; j++){
            newlist.add(generateRow(j));
        }
        return newlist;


    }
}