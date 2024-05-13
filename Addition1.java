import java.util.Scanner;
class Addition1{
public  static void main(String args[])
{
	Scanner obj = new Scanner(System.in);
	System.out.println("Enter the first no");
	int a=obj.nextInt();
	System.out.println("Enter the first no");
	int b=obj.nextInt();
	Addition1 obj1=new Addition1();
		System.out.println(obj1.sum(a,b));
}
public int sum(int c,int d)
{
	int E=c+d;
	return E;
}

}