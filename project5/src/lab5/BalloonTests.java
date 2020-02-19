package lab5;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import balloon4.Balloon;

public class BalloonTests {
	
	private Balloon b;
	
	@Before
	public void setup() {
		b = new Balloon(5);
	}
	
	@Test
	public void constructorTest() {
		String msg = "New Balloon object should have 0 radius";
		assertEquals(msg,0, b.getRadius());
	}
	
	@Test
	public void constructorTest2() {
		String msg = "New Balloon object should have 0 radius";
		assertFalse(msg,b.isPopped());
	}
	
	@Test
	public void blowTest() {
		b.blow(5);
		String msg = "blow(5) should inflate a new balloon object to radius 5";
		assertEquals(msg,5, b.getRadius());
	}
	
	@Test
	public void deflateTest() {
		b.blow(2);
		b.deflate();
		String msg = "deflate() should return balloons radius back to 0";
		assertEquals(msg,0, b.getRadius());
	}
	
	@Test
	public void maxInflateTest() {
		b.blow(6);
		String msg = "Inflate past max should deflate the balloon";
		assertEquals(msg,0, b.getRadius()); // Balloon1 Error: expected <0> but was <6>.  
	}
	
	@Test
	public void maxInflateTest2() {
		b.blow(6);
		String msg = "Inflate past max should pop the balloon";
		assertTrue(msg,b.isPopped()); // Balloon1 Error. 
	}
	
	@Test
	public void popTest() {
		b.blow(2);
		b.pop();
		String msg = "pop() should pop the balloon";
		assertTrue(msg,b.isPopped());
	}
	
	@Test
	public void popTest2() {
		b.blow(2);
		b.pop();
		String msg = "pop() should set radius to 0";
		assertEquals(msg,0, b.getRadius());
	}
	
	@Test
	public void popTest3() {
		b.blow(2);
		b.pop();
		b.blow(3);
		String msg = "pop() should set radius to 0 and should not be able to be inflated";
		assertEquals(msg,0, b.getRadius()); // Balloon2 Error: expected <0> but was: <3>. 
	}
	
	@Test
	public void blowTest2() {
		b.blow(-4);
		String msg = "blow(-3) should have the balloons radius be 0";
		assertEquals(msg,0, b.getRadius());
	}
	
	@Test
	public void deflateTest2() {
		b.blow(3);
		b.deflate();
		String msg = "delflate() should not pop the balloon";
		assertFalse(msg, b.isPopped()); //Balloon4 Error.
	}
	
	@Test
	public void blowTest3() {
		b.blow(3);
		b.blow(2);
		String msg = "blow(3) then blow(2) should increase the radius to 5";
		assertEquals(msg,5, b.getRadius()); // Error Balloon3: expected <5> but was <2>.
	}
	
	
	
	
	
	
	
	
	

}
