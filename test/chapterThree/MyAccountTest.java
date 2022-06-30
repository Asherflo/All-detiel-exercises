package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyAccountTest {
    private  MyAccount account;
    @BeforeEach
    public void setUp(){
        account = new MyAccount();
    }
    @Test
    public void accountCanBeCreated() {
        assertNotNull(account);
    }
    @Test
    public  void accountIsEmptyTest(){
        assertFalse(account.isEmpty());

    }
    @Test
    public void testThatAccountCanAddName(){
        account.setName("Aniyi seun");
        assertEquals("Aniyi seun",account.getName());
    }
    @Test
    public void testThatAccountCanDeposit(){
        account.deposit(5000.00);
        assertEquals(5000.00,account.getBalance());
    }
    @Test
    public void testThatAccountCanAddToTheAmountDeposited(){
        account.deposit(5000.00);
        account.deposit(4000);
        assertEquals(9000.00,account.getBalance());
    }
    @Test
    public void testToWithdraw(){
        account.deposit(5000.00);
        account.deposit(4000);
        assertEquals(9000.00,account.getBalance());
        account.withdraw(4500.00);
        assertEquals(4500.00,account.getBalance());
    }
//    @Test
//    public void testThatAccountCanTransfer(){
//        MyAccount account1 = new MyAccount();
//        MyAccount account2 = new MyAccount();
//
//        account1.deposit(7000);
//        assertEquals(7000,account1.getBalance());
//        account1.transfer(5000);
//        assertEquals(5000,account2.getBalance());


    }





