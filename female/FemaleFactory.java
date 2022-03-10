package com.javarush.task.task37.task3702.female;

import com.javarush.task.task37.task3702.Human;
import com.javarush.task.task37.task3702.male.KidBoy;
import com.javarush.task.task37.task3702.male.Man;
import com.javarush.task.task37.task3702.male.TeenBoy;

public class FemaleFactory {
    public Human getPerson(int age) {
        if (age >= 0 && age < 13) {
            return new KidGirl();
        }
        if (age > 12 && age < 20)
            return new TeenGirl();
        else return new Woman();

    }
}