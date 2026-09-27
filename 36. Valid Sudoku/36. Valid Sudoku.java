class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rowSet = new HashSet[9]; 
        Set<Character>[] colSet = new HashSet[9];
        Set<Character>[] gridSet = new HashSet[9];
        for(int i=0;i<9;i++)
        {
            rowSet[i] = new HashSet<>();
            colSet[i] = new HashSet<>();
            gridSet[i] = new HashSet<>();
        }

        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                int gridNo = (i/3)*3 +(j/3);
            

            if(board[i][j] != '.')
            {
                boolean rowPresent = rowSet[i].contains(board[i][j]);
                boolean colPresent = colSet[j].contains(board[i][j]);
                boolean gridPresent = gridSet[gridNo].contains(board[i][j]);
            if(rowPresent || colPresent || gridPresent)
            return false;
                       
            rowSet[i].add(board[i][j]);
            colSet[j].add(board[i][j]);
            gridSet[gridNo].add(board[i][j]);
            }
        }
        }
        return true;
    }
}