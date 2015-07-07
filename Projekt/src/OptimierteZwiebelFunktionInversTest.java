import static org.junit.Assert.*;

import org.junit.Test;


public class OptimierteZwiebelFunktionInversTest {

	@SuppressWarnings("static-access")
	@Test
	public void oopt_Zwiebel_Invers1() {
		long y=322580;
		  int size = 5;
		  int m[]={30,20,10,10,10};
		  
		OptimierteZwiebelFunktionInvers test=new OptimierteZwiebelFunktionInvers();
		int[] b=test.opt_Zwiebel_Invers(m, size, y);
		for(int i=0;i<size;i++){
			int platzklasse[]={20,12,7,3,5};
		assertEquals(platzklasse[i],b[i]);
		assertTrue(platzklasse[i]==b[i]);
		
	 
		}
		
	}
	
	@Test
	@SuppressWarnings("static-access")
	public void opt_z_goedel2() {
		long y=322580;
		  int size = 12;
		  int m[]={30,20,10,10,10,100,50,70,200,500,80,30};
		  
		OptimierteZwiebelFunktionInvers test1=new OptimierteZwiebelFunktionInvers();
		int[] b=test1.opt_Zwiebel_Invers(m, size, y);
		for(int i=0;i<size;i++){
			int platzklasse[]={20,12,7,3,5,0,0,0,0,0,0,0};
		assertEquals(platzklasse[i],b[i]);
		assertTrue(platzklasse[i]==b[i]);
		
	 
		}
		
		
	}
	@Test
	@SuppressWarnings("static-access")
	public void opt_z_goedel3() {
		long y=322580;
		  int size = 10;
		  int m[]={30,20,10,10,10,10,1,1,1,1};
		  
		OptimierteZwiebelFunktionInvers test2=new OptimierteZwiebelFunktionInvers();
		int[] b=test2.opt_Zwiebel_Invers(m, size, y);
		for(int i=0;i<size;i++){
			int platzklasse[]={20,12,7,3,5,0,0,0,0,0};
		assertEquals(platzklasse[i],b[i]);
		assertTrue(platzklasse[i]==b[i]);
		
	 
		}
	}		
}
