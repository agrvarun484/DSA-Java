package DSA;

import java.util.*;

public class two_darrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int [][] arr = new int[n][m];

        for(int i = 0; i < n; i++){     
            for(int j = 0; j < m; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int [][]varun = new int[n2][m2];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                varun[i][j] = scn.nextInt();
            }
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < varun[i].length; j++){
                System.out.println(varun[i][j]);
            }
        }
    }
}
