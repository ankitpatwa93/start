
interface One
{
	public static int id=1;
}

interface Two
{
	public static int id=1;
}

public class Time implements One,Two
{

	Integer name;
	String time;
	String displySize;
	
	public static void main(String[] args) 
	{
		System.out.println("Yes id==="+One.id);
		System.out.println(new Time().name+" "+new Time().time+"address==");
	}
	
	public static void instanceMethod(){
			
		 String  address;
	}

}
