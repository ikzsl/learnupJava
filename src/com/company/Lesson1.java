package com.company;
import static com.company.StringGenerator.*;

public class Lesson1 {
    public static void about() {
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
