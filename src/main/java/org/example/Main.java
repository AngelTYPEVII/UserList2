package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        List<User> woman = new ArrayList<>();
        List<User> men = new ArrayList<>();
        int s = 99;
        int[] run=new Random().ints(1,s+2).distinct().limit(s+1).toArray();
        for (int i=0;i<=s;i++){
            User user =new User(run[i],Name_generator.genName(),(int) (Math.random() * 110));

            users.add(user);
        }
        System.out.println("Все пользователи: \n"+ users.size()+users);
        System.out.println("\nЖенщины:");
        List<User> womanFilter =users.stream().filter(x-> x.getName().equals("Кристина")||x.getName().equals("Ева")||x.getName().equals("Вика")||x.getName().equals("Роза"))
                .collect(Collectors.toList());


        System.out.println(womanFilter+"\n Количество женщин "+womanFilter.size());

        System.out.println("\nМужчины:");
        List<User> menFilter =users.stream().filter(x-> x.getName().equals("Тимур")||x.getName().equals("Андрей")||x.getName().equals("Илья")||x.getName().equals("Боб"))
                .collect(Collectors.toList());

        System.out.println(menFilter+"\n Количество мужчин "+menFilter.size());
    }
}