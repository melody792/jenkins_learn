package org.gradle;

import org.apache.commons.collections.list.GrowthList;

public class Car {
    private final String name;

    public Car(String name) {
        this.name = name;
        new GrowthList();
    }

    public String getName() {
        return name;
    }
}
