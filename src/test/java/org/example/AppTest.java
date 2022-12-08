package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testSummationFunction(){
        // test data
        int a =12;
        int b =45;

        // define the expected result
        int expected = 57;

        // execute the code
        App app = new App();
        int result = app.sum(a,b);

        // assert  the expected  result
        Assertions.assertEquals(expected,result, "The sum of 12 and 45 should be equal to 57");
    }
}