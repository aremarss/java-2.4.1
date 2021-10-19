package ru.netology.sqr;

public class SQRService {
    int sqrNumber = 0;

    public int sqrCalculate(int lowValue, int highValue) {
        for (int i = 10; i < 100; i++) {
            if (i * i <= highValue) {
                if (i * i >= lowValue) {
                    sqrNumber = sqrNumber + 1; // Счётчик количества попаданий квадрата числа в диапазон значений
                }
            }
        }
        return sqrNumber; // После выхода из цикла возвращается счётчик
    }
}