package es.upm.miw.spai.ecp2;


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection collection;

    @Before
    public void before() { 
    	collection = new DecimalCollection();
    	collection.add(2.5);
    	collection.add(3.5);
    }
    
    @Test 
   	public void testSize() { 
   		assertEquals(2, collection.size());  
   	} 

    @Test 
   	public void testHigher() { 
    	assertEquals(3.5, collection.higher(), 0.1);
   	} 

    @Test 
   	public void testSum() { 
    	assertEquals(6, collection.sum(), 0.1);
   	} 
   

}
