package com.crio.qcalc;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;


public class ScientificCalculatorTest {
    private ScientificCalculator scientificCalculator;
    @BeforeEach
    void setup(){
        scientificCalculator = new ScientificCalculator();
    }

    @Test
    @DisplayName("Test Sin of given Double")
    void testSinOperation(){
        //Arrange
        double expectedResult = 1.0;
        //Act
        scientificCalculator.sin(Math.PI / 2);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Cos of given Double")
    void testCosOperation(){
        //Arrange
        double expectedResult = -1.0;
        //Act
        scientificCalculator.cos(Math.PI);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Tan of given Double")
    void testTanOperation(){
        //Arrange
        double expectedResult = 0;
        //Act
        scientificCalculator.tan(0);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Log of given Double")
    void testLogOperation(){
        //Arrange
        double expectedResult = 1;
        //Act
        scientificCalculator.log(Math.exp(1));
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square Root of given Double")
    void testSquareRootOperation(){
        //Arrange
        double expectedResult = 2;
        //Act
        scientificCalculator.sqrt(4);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Cube Root of given Double")
    void testCubeRootOperation(){
        //Arrange
        double expectedResult = 2;
        //Act
        scientificCalculator.cbrt(8);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    @DisplayName("Test Square of given Double")
    void testSquareOperation(){
        //Arrange
        double expectedResult = 16;
        //Act
        scientificCalculator.square(4);
        double actualResult = scientificCalculator.getResult();
        //Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @DisplayName("Test Square Overflow")
    void testSquareOverflow(){
        //Assert
        Assertions.assertThrows(ArithmeticException.class,new Executable(){
            @Override
            public void execute() throws Throwable{
                scientificCalculator.square(Double.MAX_VALUE);
            }
        });
    }
}
