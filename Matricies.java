
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
	
	public int[][] booleanMatrixMult(int[][] thatMatrix){
		if(matrix[0].length != thatMatrix.length){
			throw new IllegalArgumentException("Error: " + matrix[0].length
					+ " " + thatMatrix.length + " do not match.");
		}
		
		for(int x = 0; x < matrix.length; x++){
			for(int y = 0; y < matrix.length; y++){
				if(matrix[x][y] != 1 && matrix[x][y] != 0)
					throw new IllegalArgumentException("Non 1 or 0 " +
							"number at matrix location: " + x + ", " + y);
			}
		}
		
		for(int x = 0; x < thatMatrix.length; x++){
			for(int y = 0; y < thatMatrix.length; y++){
				if(thatMatrix[x][y] != 1 && thatMatrix[x][y] != 0)
					throw new IllegalArgumentException("Non 1 or 0 " +
							"number at matrix location: " + x + ", " + y);
			}
		}
		
		int[][] output = new int[matrix.length][thatMatrix[0].length];
		
		for(int  x = 0; x < output.length; x++){
			for(int y = 0; y < output[0].length; y++){
				
			}
		}
		
		return output;// incomplete
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
