package ru.netotogy.unit;

import junit.framework.TestCase;

public class CashBackHackerTest {
    @org.junit.Test
    public void cash900 () {
        CashBackHacker CashBackHacker = new CashBackHacker();
        int amount = 900;

        int actual = CashBackHacker.remain(amount);
        int expected = 100;

        org.junit.Assert.assertEquals(actual, expected);
    }
    @org.junit.Test
    public void cash1000() {
        CashBackHacker CashBackHacker = new CashBackHacker();
        int amount = 1000;

        int actual = CashBackHacker.remain(amount);
        int expected = 0;

        org.junit.Assert.assertEquals(actual, expected);
    }

}