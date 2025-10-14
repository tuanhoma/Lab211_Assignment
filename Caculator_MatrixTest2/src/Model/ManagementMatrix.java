package Model;

public class ManagementMatrix {

    public int[][] addtionMatrix(int[][] a, int[][] b, int n, int m){
        int[][] result = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = a[i][j] + b[i][j];
            }
        }

        return result;
    }

    public int[][] submationMatrix(int[][] a, int[][] b, int n, int m){
        int[][] result = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = a[i][j] - b[i][j];
            }
        }

        return result;
    }

    public int[][] muntiableMatrix(int[][] a, int[][] b, int n, int m){
        int[][] result = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = a[i][j] * b[i][j];
            }
        }

        return result;
    }
}
