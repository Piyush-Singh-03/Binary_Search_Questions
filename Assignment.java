public class Assignment {
    public static void main(String[] args) {
        int[][] indices = {
                {1,2},{2,2}
        };
        int m =3;
        int n=2;
        int[][] numbers = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                numbers[i][j] = 0;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println(" ");
        }
        for(int i=0;i<numbers.length;i++){
            for(int j=0;j<numbers[i].length;j++){
                indices[i][j] = numbers[i][j]+1;
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println(" ");
        }

    }
}
