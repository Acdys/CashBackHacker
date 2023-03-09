package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldHowMuchIsMissing(){
        int amount = 500;

        int expected = 500;
        int actual = service.remain(amount);

        assertEquals(actual,expected);
    }

    @Test
    public void shouldHowMuchIsMissingIfZero(){
        int amount = 0;

        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchIsMissingIfMinLimit(){
        int amount = 1000;

        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldHowMuchIsMissingIfOneUnit(){
        int amount = 999;

        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

}
