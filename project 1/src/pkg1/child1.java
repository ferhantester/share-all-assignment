package pkg1;


public class child1 extends Father
{
public void nature ()
{
	System.out.println("Child1's Nature-he is genuine");
}
public void weakness ()
{
	System.out.println("Child1's Weakness-he is short tempered");
}
public static void main(String[] args)
{
System.out.println("Single level inheritance- child1 inherits father's properties");
	child1 c1=new child1();
	c1.behaviour();
	c1.character();
	c1.nature();
	c1.weakness();
	
}
}
