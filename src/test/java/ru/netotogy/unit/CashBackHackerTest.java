package ru.netotogy.unit;

import static org.testng.Assert.assertEquals;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void cash900 () {
        CashBackHacker CashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = CashBackHacker.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }
    @org.testng.annotations.Test
    public void cash1000() {
        CashBackHacker CashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = CashBackHacker.remain(amount);
        int expected = 0;

       assertEquals(actual, expected);
    }

}