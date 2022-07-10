class Solution {
    public int[] prisonAfterNDays(int[] cells, int N) {
       Set<String> set = new HashSet<>();
       int iteration = 0;
       boolean isCycle = false;
       int i=0;
       while(i < N) {
           int[] nextState = findNextState(cells);
           String key = Arrays.toString(nextState);
           if(!set.contains(key)) {
               set.add(key);
               iteration++;
               i++;
           } else {
               isCycle = true;
               break;
           }
           cells = nextState;
       }
       int j = 0;
       if(isCycle) {
           N %= iteration;
           while(j < N) {
              cells =  findNextState(cells);
               j++;
           }
       }
       return cells;
   }
   
   private int[] findNextState(int[] cells) {
       int[] val = new int[8];
       for(int i=1; i<7; i++) {
           val[i] = cells[i-1]==cells[i+1]?1:0;
       }
       return val;
   }
}