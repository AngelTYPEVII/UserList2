package org.example;

public class Name_generator {
    public static String genName() {
        String[] name = {"Тимур", "Андрей", "Илья", "Боб", "Кристина", "Ева", "Вика", "Роза"};
        int in = (int) (Math.random() * name.length);
        String newName = name[in];
        return newName;
    }
}