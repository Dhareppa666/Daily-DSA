package com.org.JUnit_By_ME.ex02_parameterized_Test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertTrue;

@RunWith(Parameterized.class)
public class isTrueTest {

    private boolean istrue;

    private checkTrue checkTrue;

    @Before
    public void initialize() {
        checkTrue = new checkTrue();
    }

    public isTrueTest(boolean istrue){
        this.istrue = istrue;
    }

    @Parameters
    public static Collection primeNumbers() {
        return Arrays.asList(true, true, true, true);
    }

    @Test
    public void isTrueTests() {
        System.out.println("Parameterized Number is : " + istrue);
        assertTrue(checkTrue.isTrue(istrue));
    }
}
