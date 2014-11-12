
public class Matricies {
	private int[][] matrix;
	
	
	public Matricies(int[][] matrix){
		this.matrix = matrix;
	}
	
	public int getMatrixWidth(){
		return matrix.length;
	}
	
	public int getMatrixLength(){
		return matrix[0].length;
	}
	
	public int getMatrixValue(int x, int y){
		return matrix[x][y];
	}
	
	public void setMatrixValue(int value, int x, int y){
		matrix[x][y] = value;
	}
	
	public int[][] warshallMethod(){
		if(matrix.length != matrix[0].length)
			throw new IllegalArgumentException("Matrix not appropriate for this method.");
		
		for(int x = 0; x < matrix.length; x++){
			for(int y = 0; y < matrix.length; y++){
				if(matrix[x][y] != 1 && matrix[x][y] != 0)
					throw new IllegalArgumentException("Non 1 or 0 " +
							"number at matrix location: " + x + ", " + y);
			}
		}
		
		int[][] output = matrix;
		
		for(int x = 0; x < output.length; x++){
			for(int y = 0; y < output.length; y++){
				if(output[x][y] == 1){
					for(int i = 0; i < output.length; i++){
						if(output[i][x] == 1 || output[i][y] == 1){
							output[i][y] = 1;
						}
					}
				}
			}
		}
		return output;
	}
}
