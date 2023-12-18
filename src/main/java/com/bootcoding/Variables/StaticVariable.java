class StaticVariable{
	static int a=20;
	void fun()
	{
	int b=40;
	System.out.println(a);
	System.out.println(b);
	a++;
	b++;
	}
public static void main(String []args){
	StaticVariable obj=new StaticVariable();
	obj.fun();
	obj.fun();
	}
}