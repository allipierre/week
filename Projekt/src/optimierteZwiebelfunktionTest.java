import static org.junit.Assert.*;

import org.junit.Test;


public class optimierteZwiebelfunktionTest {

	@SuppressWarnings("static-access")
	@Test
	public void opt_z_goedel1() {
		int platzklasse []={20, 12, 7, 3, 5};
		int max []={30,20,10,10,10};   
		int size=5;// 
		optimierteZwiebelfunktion test=new optimierteZwiebelfunktion();
		
		assertEquals(322580,test.opt_z_goedel(platzklasse, size, max));
		assertTrue(322580==test.opt_z_goedel(platzklasse, size, max));
		
	}
	@Test
	@SuppressWarnings("static-access")
	public void opt_z_goedel2() {
		int platzklasse []={20,12,7,3,5,0,0,0,0,0,0,0};
		int max []={30,20,10,10,10,100,50,70,200,500,80,30};   
		int size=12; 
		optimierteZwiebelfunktion test1=new optimierteZwiebelfunktion();
		
		assertEquals(322580,test1.opt_z_goedel(platzklasse, size, max));
		assertTrue(322580==test1.opt_z_goedel(platzklasse, size, max));
		
	}
	@Test
	@SuppressWarnings("static-access")
	public void opt_z_goedel3() {
		int platzklasse []={20,12,7,3,5,0,0,0,0,0};
		int max []={30,20,10,10,10,10,1,1,1,1};   
		int size=10;// 
		optimierteZwiebelfunktion test=new optimierteZwiebelfunktion();
		
		assertEquals(322580,test.opt_z_goedel(platzklasse, size, max));
		assertTrue(322580==test.opt_z_goedel(platzklasse, size, max));
		
	}

}
