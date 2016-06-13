package com.compareexample;

import java.util.Comparator;

/**
 * Created by bogdan on 12-Jun-16.
 */
public class PersonAgeComparator implements Comparator<Person>{
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}
