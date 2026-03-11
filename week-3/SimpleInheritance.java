class A 
{
	int i,j;
	void showij(){
		System.out.println("i:"+i);
		System.out.println("j:"+j);
	}
}
class B extends A
{
	int k;
	void showk(){
      System.out.println("k:"+k);
	} 
	void sum(){
		System.out.println("i+j+k:"+(i+j+k));
	}
}
class SimpleInheritance
{
	public static void main(String[] args) 
	{
		A superOb=new A();
		superOb.i=5;
		superOb.j=6;
		superOb.showij();
		B subOb=new B();
		subOb.i=7;
		subOb.j=8;
		subOb.k=10;
		superOb.showij();
		subOb.sum();
	}
}
