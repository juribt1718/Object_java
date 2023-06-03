package main;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private String name;
    private int age;
    private String[] hobbies;


    public Human(String name, int age, String[] hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = hobbies;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age && name.equals(human.name) && Arrays.equals(hobbies, human.hobbies);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        result = 31 * result + Arrays.hashCode(hobbies);
        return result;
    }
}
