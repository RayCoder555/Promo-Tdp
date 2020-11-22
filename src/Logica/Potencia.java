package Logica;

public class Potencia implements PluginFunction {
	
	private int op1;
	private int op2;
	
	
	public void setParameters(int p1, int p2) {
		this.op1 = p1;
		this.op2 = p2;		
	}

	
	public int getResult() {
		int result; int i;
		
		i = 0;
		result = 1;
		
		while(i < op2){
			result = result * op1;			
		}	
		
		return result;
	}

	
	public String getPluginName() {		
		return "Potencia";
	}

	
	public boolean hasError() {		
		boolean error;
		
		error = false;
		
		if(op1 == 0 && op2 == 0)
			error = true;
		
		return error;
	}

}
