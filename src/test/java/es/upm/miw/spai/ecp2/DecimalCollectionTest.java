package es.upm.miw.spai.ecp2;


import static org.junit.Assert.assertEquals;


import org.junit.Before;
import org.junit.Test;

public class DecimalCollectionTest {
    private DecimalCollection collection;
    private DecimalCollection collection2;

    @Before
    public void before() { 
    	collection = new DecimalCollection();
    	collection2 = new DecimalCollection();
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
    
    @Test 
   	public void menor() { 
    	collection2.add(1.5);
    	collection2.add(0.3);
    	assertEquals(0.3, collection2.menor(), 10e-5);
   	} 
   

}
