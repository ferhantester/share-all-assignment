package pkg1;

public class grandchild extends child1
{
public void Bloodgroup()
{
	System.out.println("Grandchild's blood group-O positive");
}
public static void main(String[] args)
{
System.out.println("Multilevel Inheritance- grandchild inhertis both father and child1 properties");
	grandchild c2=new grandchild();
	c2.behaviour();
	c2.character();
	c2.nature();
	c2.weakness();
	c2.Bloodgroup();
}
}
