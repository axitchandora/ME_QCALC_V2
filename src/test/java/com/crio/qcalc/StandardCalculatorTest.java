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
        double expectedResult = 2;
        //Act
        standardCalculator.add(1,1);
        double actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Integers")
    void testSubtractionOperation(){
        //Arrange
        double expectedResult = 0;
        //Act
        standardCalculator.subtract(1,1);
        double actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    


















    












    @Test
    @DisplayName("Test Addition of Two Doubles")
    void testAdditionOperationForDoubles(){
        //Arrange
        double expectedResult = 2.5;
        //Act
        standardCalculator.add(1.0,1.5);
        double actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Substraction of Two Doubles")
    void testSubtractionOperationForDoubles(){
        //Arrange
        double expectedResult = -10.5;
        //Act
        standardCalculator.subtract(10.0,20.5);
        double actualResult = standardCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    


}
