package com.epam.prejap.teatrees.block;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

@Test
public class JBlockTest {

    public void shouldHaveExactAmountOfColumns(){
        int expectedColumns = 2;
        JBlock jBlock = new JBlock();
        int actualAmountOfColumns = jBlock.cols();
        assertEquals(actualAmountOfColumns, expectedColumns);
    }


}
