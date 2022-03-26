package pkg1;

public class globalvariable {
	int globalvariable=12;
	public void variable (int globalvariable)
	{ 
		System.out.println(" vale of globalvariable="+globalvariable);
		this.globalvariable=globalvariable;
		
		System.out.println("value of global variable"+globalvariable);
	}

	public static void main(String[] args) 
	{
    	globalvariable ob=new globalvariable();
    	System.out.println(" value of global variable="+ob.globalvariable);
	    ob.variable(1);
	    System.out.println("value of global variable"+ob.globalvariable);
		
	
	
	
}
}