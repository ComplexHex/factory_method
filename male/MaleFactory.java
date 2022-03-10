package com.javarush.task.task37.task3702.male;

import com.javarush.task.task37.task3702.Human;

public class MaleFactory {

    public Human getPerson(int age) {
        if (age >= 0 && age < 13) {
            return new KidBoy();
        }
        if (age > 12 && age < 20)
            return new TeenBoy();
        else return new Man();

    }
}