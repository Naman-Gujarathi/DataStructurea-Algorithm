class Pair{
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString(){
        return "(" + row + "," + col + ")";
    }
}

class Solution {
    public void setZeroes(int[][] matrix) {
        Queue<Pair> queue = new LinkedList<>();
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 0) {
                    queue.add(new Pair(i, j));
                }
            }
        }

        System.out.println( queue );

        while(!queue.isEmpty()){
            Pair poppedNode = queue.poll();
            int row = poppedNode.row;
            int col = poppedNode.col;
            for(int i=0; i<matrix[0].length; i++){
                    matrix[row][i] = 0;       
            }  

            for(int j=0; j<matrix.length; j++){
                     matrix[j][col] = 0;        
            } 

           
       }
    } 
}