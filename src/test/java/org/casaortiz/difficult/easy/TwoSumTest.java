package org.casaortiz.difficult.easy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TwoSumTest {
    private TwoSum twoSum;
    @Before
    public void init(){
        twoSum = new TwoSum();
    }

    @Test
    public void twoSumTest1(){
        int nums[] = {2,7,11,15};
        int target = 9;
        int outputExpected[] = {0,1};
        Assert.assertArrayEquals(outputExpected, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTest2(){
        int nums[] = {3,2,4};
        int target = 6;
        int outputExpected[] = {1,2};
        Assert.assertArrayEquals(outputExpected, twoSum.twoSum(nums, target));
    }

    @Test
    public void twoSumTest3(){
        int nums[] = {3,3};
        int target = 6;
        int outputExpected[] = {0,1};
        Assert.assertArrayEquals(outputExpected, twoSum.twoSum(nums, target));
    }
}
