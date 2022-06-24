package com.workfusion.interview;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    private Task1 task = new Task1();

    @Test
    void shouldPerformDivideOperation() {
       assertEquals(3, task.divide(10, 3));
    }


}
