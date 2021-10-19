package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCalculateCountNumberOfSquare() {
        SQRService service = new SQRService();

        int expected = 3;

        int actual = service.sqrCalculate(200, 300); // Диапазон чисел

        assertEquals(expected, actual);
    }
}