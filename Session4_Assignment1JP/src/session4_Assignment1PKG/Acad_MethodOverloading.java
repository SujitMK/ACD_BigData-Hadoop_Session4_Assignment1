package session4_Assignment1PKG;

public class Acad_MethodOverloading {
	
	public  int Sum1(int x,int y)
	{
		return(x+y);
    }

    public  int Sum1(int x,int y,int z)
    {
        return(x+y+z);
    }
	
	public static void main(String[] args) {
		
		Acad_MethodOverloading obj = new Acad_MethodOverloading();
        System.out.println("Sum of 10 and 7 is : "+obj.Sum1(10,7));
        System.out.println("Sum of 10, 7 and 20 is : "+obj.Sum1(10,7,20));

   }
}
