package org.casaortiz.difficult.easy;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromeNumberTest {
    private PalindromeNumber palindromeNumber;

    @Before
    public void init(){
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void isPalindromeTest1(){
        int x = 121;
        boolean outputExpected = true;
        Assert.assertEquals(outputExpected, palindromeNumber.isPalindrome(x));
    }

    @Test
    public void isPalindromeTest2(){
        int x = -121;
        boolean outputExpected = false;
        Assert.assertEquals(outputExpected, palindromeNumber.isPalindrome(x));
    }

    @Test
    public void isPalindromeTest3(){
        int x = 10;
        boolean outputExpected = false;
        Assert.assertEquals(outputExpected, palindromeNumber.isPalindrome(x));
    }

    @Test
    public void isPalindromeTest4(){
        int x = 1234567899;
        boolean outputExpected = false;
        Assert.assertEquals(outputExpected, palindromeNumber.isPalindrome(x));
    }
}
