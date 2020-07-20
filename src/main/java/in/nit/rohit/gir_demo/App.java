package in.nit.rohit.gir_demo;

public class App 
{
	String str = GetValue.str;
	public String message(String str )
	{
		return "welcome"+str;
	}
	
	public void newMethodadded()
	{
		System.out.println("Welcome");
	}
    public static void main( String[] args )
    {
    	new App().message("ROHIT");
         
    }
}
