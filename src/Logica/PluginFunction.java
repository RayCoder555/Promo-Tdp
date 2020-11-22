package Logica;

public interface PluginFunction {
	
	public void setParameters(int p1,int p2);
	
	public int getResult();
	
	public String getPluginName();
	
	public boolean hasError();

}
