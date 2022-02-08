package com.epam.prejap.teatrees.block;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test(groups = "blocks")
public class JBlockTest {

    @DataProvider
    public static Object[][] jBlockCoordinates(){
        return new Object[][]{
                {0, 0, 0},
                {0, 1, 1},
                {1, 0, 0},
                {1, 1, 1},
                {2, 0, 1},
                {2, 1, 1},
        };
    }


    public void shouldHaveExactAmountOfColumns(){
        int expectedColumns = 2;
        JBlock jBlock = new JBlock();
        int actualAmountOfColumns = jBlock.cols();
        assertEquals(actualAmountOfColumns, expectedColumns);
    }

    public void shouldHaveExactAmountOfRows(){
        int expectedRows = 3;
        JBlock jBlock = new JBlock();
        int actualAmountOdRows = jBlock.rows();
        assertEquals(actualAmountOdRows, expectedRows);
    }

    @Test(dataProvider = "jBlockCoordinates")
    public void shouldHaveExpectedValuesAtCoordinatesFromDataProvider(int row, int column, int expectedValue ){
        JBlock jBlock = new JBlock();
        byte actualValue = jBlock.dotAt(row,column);
        assertEquals(actualValue, expectedValue);
    }
}
