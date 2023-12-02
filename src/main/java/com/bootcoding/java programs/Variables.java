class Variables{
int a=10;
static int b=20;
public static void main(String[]args){
	int c=30;
	Variables obj=new Variables();
  	System.out.println("Instance:"+obj.a);
	System.out.println("Static:"+b);
	System.out.println("Local:"+c);
}
}
