package com.company;

public class Main {


    public static String exclaimGluier(String str) {
        char exclaim = '\u0021';
        return str + exclaim;
    }

    public static String hobbyGenerator(String hobby) {
        return "My hobby is " + hobby;
    }

    public static void main(String[] args) {
        byte myAge = 123;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hi");
        stringBuilder.append("\n");
        stringBuilder.append("I am ");
        stringBuilder.append(myAge);
        stringBuilder.append(" years old");
        stringBuilder.append("\n");
        stringBuilder.append(hobbyGenerator("shashlik eating"));
        System.out.println(exclaimGluier(stringBuilder.toString()));
    }
}
