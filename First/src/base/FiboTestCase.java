package base;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FiboTestCase {

	@Parameters
	public static List<Object[]> getData()
	{	
		Object data[][]={
				{0,0},{1,1},{2,1},{3,3},{4,5},{6,8},{7,13},{8,21}
				};
		return Arrays.asList(data);
	}
	

	@Parameter(0)
	public int first;
	
	@Parameter(1)
	public int second;

	@Test
	public void testfiboSeries(){
		
		System.out.println("i m in ");
		assertEquals(second,new Fibo().getSumAssured(first));
		
	}
	
	
}
