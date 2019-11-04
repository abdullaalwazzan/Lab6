package LabSix;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BuddyInfoTest {

	private BuddyInfo me = null;
	private BuddyInfo him = null;
	
	@Before
	public void setUp() throws Exception {
		me = new BuddyInfo("Abdulla", 24, "8195933339");
		him = new BuddyInfo("Obama", 1, "0000000001");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetName() {
		me.setName("Saleh");
		assertEquals("Name is set to Saleh", "Saleh", me.getName());
	}

	@Test
	public void testGetName() {
		assertEquals("Abdulla", me.getName());
	}

	@Test
	public void testIsOver18() {
		assertTrue(me.isOver18());
		assertFalse(him.isOver18());
		assertEquals("buddy is over 18", true, me.isOver18());
		assertEquals("him is NOT over 18", false, him.isOver18());
	}

	@Test
	public void testSetAge() {
		me.setAge(8);
		assertEquals(8, me.getAge());
	}
	
	@Test
	public void testGetAge() {
		assertEquals(24, me.getAge());
	}

	@Test
	public void testGetNumber() {
		assertEquals("8195933339", me.getNumber());
	}
	
	
	@Test
	//also tests toString()
	public void testCopyConstructor() {
		BuddyInfo testBuddy = new BuddyInfo(me);
		
		
		assertEquals(me, testBuddy);
	}

}
