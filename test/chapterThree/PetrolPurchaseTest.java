package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

public class PetrolPurchaseTest {
    private PetrolPurchase purchase;
    @BeforeEach
    public void SetUp(){
        purchase = new PetrolPurchase();
    }
    @Test
    public void petrolPurchaseCanBeCreated(){
//        PetrolPurchase purchase = new PetrolPurchase();
        assertNotNull(purchase);
    }
    @Test
    public void  petrolPurChaseIsEmpty(){
//        PetrolPurchase purchase = new PetrolPurchase();
        assertFalse(purchase.isEmpty());
    }
  @Test
    public void testForLocation(){
        purchase.setLocation("yaba");
        assertEquals("yaba",purchase.getLocation());
  }
  @Test
    public void  testForTypeOfStation(){
        purchase.typeOfPetrol("Kerosine");
        assertEquals("Kerosine",purchase.getTypeOfPetrol());
  }
  @Test
    public void testForQuantity(){
        purchase.quantity(200);
        assertEquals(200,purchase.getQuantity());
  }
  @Test
    public void testForPrice(){
        purchase.setPrice(3.00);

        assertEquals(3.00,purchase.getPrice());
    }
    @Test
    public void testForTotalPurchase(){
        purchase.setPrice(300);
        purchase.quantity(2);
        assertEquals(600,purchase.getPurchase());

    }@Test
    public void testToDeductDiscountFromPurchase(){
        purchase.setPrice(300);
        purchase.quantity(2);
        purchase.setDiscount(1.50);
        assertEquals(1.50,purchase.getDiscount());
        assertEquals(598.5,purchase.getPurchase());

    }

}
