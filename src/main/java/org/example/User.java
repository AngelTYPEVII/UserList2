package org.example;

public class User {
    private Integer id;
    private String name;
    private int age;

    public User() {}

    public User(Integer id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Пользователь: " + "id = " + id + ", Имя = " + name + ", Возраст = " + age + ']';
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}