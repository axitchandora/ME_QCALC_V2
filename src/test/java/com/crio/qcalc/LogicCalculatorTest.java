package com.crio.qcalc;


public class LogicCalculatorTest {
    private LogicCalculator logicCalculator;
    @BeforeEach
    void setup(){
        logicCalculator = new LogicCalculator();
    }

    @Test
    @DisplayName("Test AND of two Integers")
    void testANDOperation(){
        //Arrange
        double expectedResult = 5;
        //Act
        logicCalculator.AND(5,7);
        double actualResult = logicCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test OR of two Integers")
    void testOROperation(){
        //Arrange
        double expectedResult = 7;
        //Act
        logicCalculator.OR(5,7);
        double actualResult = logicCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test XOR of two Integers")
    void testXOROperation(){
        //Arrange
        double expectedResult = 2;
        //Act
        logicCalculator.XOR(5,7);
        double actualResult = logicCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }
    @Test
    @DisplayName("Test NOT of given Integer")
    void testNOTOperation(){
        //Arrange
        double expectedResult = -6;
        //Act
        logicCalculator.NOT(5);
        double actualResult = logicCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

}
