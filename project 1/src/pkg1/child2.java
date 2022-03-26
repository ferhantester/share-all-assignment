package pkg1;

public class child2 extends Father
{
public void profession()
{
	System.out.println("Child2's profession-Business");
}
public static void main(String[] args) 
{
System.out.println("Hierarchical inheritance- child1 and child2 acquire property of father but not of each other");
	child2 c3= new child2();
	c3.behaviour();
	c3.character();
	c3.profession();
}
}
