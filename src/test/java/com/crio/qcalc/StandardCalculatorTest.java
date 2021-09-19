package com.crio.qcalc;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StandardCalculatorTest {
    private StandardCalculator standardCalculator;

    @BeforeEach
    void setup(){
        standardCalculator = new StandardCalculator();
    }

    @Test
    @DisplayName("Test Addition of Two Integers")
    void testAdditionOperation(){
        //Arrange
        int expectedResult = 2;
        //Act
        standardCalculator.add(1,1);
        int actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        //Arrange
        int expectedResult = 0;
        //Act
        standardCalculator.subtract(1,1);
        int actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }





}
