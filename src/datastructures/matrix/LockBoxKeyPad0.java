package datastructures.matrix;

public class LockBoxKeyPad0 {
    private int mat[][] = {  { 0, 2, 3 },
            { 4, 0, 6 },
            { 7, 8, 9 },};

    private int passwordCombination(int n){
        int totalMovements = 0;
        for(int x =0; x<=2;x++){
            for(int y=0; y<=2; y++){
                if(mat[x][y] != 0){
                    totalMovements += findPossibleMoves(x, y, n);
                }
            }
        }
        return totalMovements;
    }

    int findPossibleMoves(int p, int q, int n) {
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int count = 0;

        if(n>1){
            // All possible moves of a knight
            // Check if each possible move is valid or not
            for (int i = 0; i < 8; i++) {

                // Position of knight after move
                int x = p + X[i];//2
                int y = q + Y[i];//2

                // count valid moves
                if (x >= 0 && y >= 0 && x < 3 && y < 3 && mat[x][y]!=0){
                    count= count + findPossibleMoves(x,y,n-1)+1;
                    System.out.println("(" + mat[p][q] + "," + mat[x][y] +")");
                }
            }

        }else
            return 0;
        // Return number of possible moves
        return count;
    }

    public static void main(String[] args) {
        LockBoxKeyPad0 keyPad = new LockBoxKeyPad0();
        System.out.println(keyPad.passwordCombination(3));
    }
}