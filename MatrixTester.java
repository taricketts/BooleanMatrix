public class MatrixTester {

	public static void main(String[] args) {
		
		int[][] matrix = {{1,0,0},
						{0,1,1},
						{1,0,1}};
		
		Matricies m = new Matricies(matrix);
		
		int[][] matrix2 = m.warshallMethod();
		
		for(int x = 0; x < matrix.length; x++){
			for(int y = 0; y < matrix[0].length; y++){
				System.out.print(matrix2[x][y] + " ");
			}
			System.out.println();
		}
	}
}
