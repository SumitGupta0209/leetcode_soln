class Solution {
   public void setZeroes(int[][] arr) {
    HashSet<Integer> row=new HashSet<>();
    HashSet<Integer> col=new HashSet<>();
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            if(arr[i][j]==0){
                row.add(i);
                col.add(j);
            }
        }
    }
    for(int i=0;i<arr.length;i++){
        if(row.contains(i)){
            removeRows(i,arr);
        }
    }
    for(int i=0;i<arr[0].length;i++){
        if(col.contains(i)){
            removeCols(i,arr);
        }
    }
}
private void removeRows(int index,int[][] arr){
    for(int i=0;i<arr[0].length;i++){
        arr[index][i]=0;
    }
}
private void removeCols(int index,int[][] arr){
    for(int i=0;i<arr.length;i++){
        arr[i][index]=0;
    }
}
}