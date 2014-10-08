package es.upm.miw.spai.ecp2;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class UserTest {
	private User u;

	@Before 
	public void before() { 
		u = new User(1, "David", "Marchante"); 
	} 

	@Test 
	public void testUserIntStringString() { 
		assertEquals(1, u.getNumber() ); 
		assertEquals("David", u.getName()); 
		assertEquals("Marchante", u.getFamilyName()); 
		
	} 

	@Test 
	public void testFullName() { 
		assertEquals("David Marchante", u.fullName());  
	} 
	
	@Test 
	public void testInitials() { 
		assertEquals("D.", u.initials());  
	} 
	
	@Test
	public void testUpperName(){
		assertEquals("DAVID", u.nombreMayusculas());
	}
	 
	
}