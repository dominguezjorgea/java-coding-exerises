package datastructures.matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

/*
*
*
* */

public class LockBoxKeyPad1 {
    private int mat[][] = {  { 0, 2, 3 },
                             { 4, 0, 6 },
                             { 7, 8, 9 },};
    private HashMap<Integer, Coordenate> coordenates;
    private List<TreeMap<Integer, Coordenate> > paths = new ArrayList<>();
    private List<TreeMap<Integer, Coordenate> > subTrees;
    int totalPaswords = 0;
    int level = 2;

    public LockBoxKeyPad1() {
        this.coordenates  = new HashMap<Integer, Coordenate>();
        coordenates.put(2, new Coordenate(0, 1));
        coordenates.put(3, new Coordenate(0, 2));
        coordenates.put(4, new Coordenate(1, 0));
        coordenates.put(6, new Coordenate(1, 2));
        coordenates.put(7, new Coordenate(2, 0));
        coordenates.put(8, new Coordenate(2, 1));
        coordenates.put(9, new Coordenate(2, 2));
    }

    private int passwordCombination(int n){

        for(int x =0; x<=2;x++){
            for(int y=0; y<=2; y++){
                if(mat[x][y] != 0){
                    paths.add(findRootPaths(x, y)) ;
                }
            }
        }

        System.out.println(paths.toString());

        subTrees = new ArrayList<>(paths);

        for (TreeMap<Integer, Coordenate> tree: paths) {
            System.out.println(tree.lastEntry().getKey());

        }

        return totalPaswords;
    }

    TreeMap<Integer, Coordenate> findRootPaths(int p, int q) {
        int X[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int Y[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
        int count = 0;

        TreeMap<Integer, Coordenate> tree = new TreeMap<>();
        tree.put(mat[p][q], new Coordenate(p,q));
            // All possible moves of a knight
            // Check if each possible move is valid or not
            for (int i = 0; i < 8; i++) {

                // Position of knight after move
                int x = p + X[i];//2
                int y = q + Y[i];//2

                // count valid moves
                if (x >= 0 && y >= 0 && x < 3 && y < 3 && mat[x][y]!=0){
                    tree.put(mat[x][y], new Coordenate(x,y));
                    System.out.println("(" + mat[p][q] + "," + mat[x][y] +")");
                }
            }
        return tree;
    }

    public static void main(String[] args) {
        LockBoxKeyPad1 keyPad = new LockBoxKeyPad1();
        System.out.println(keyPad.passwordCombination(2));
    }
}