package com.telran;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.stream.Collectors;

public class AnnotationExample {

    public static void main(String[] args) {
        Arrays.stream(UserTest.class
                .getDeclaredMethods())
                .toList()
                .stream()
                .filter(method -> method.isAnnotationPresent(Test.class))
                .collect(Collectors.toList());
    }
}

//@Test
class UserTest {

//    @Test
    private String abc;

    @Test
    public UserTest() {
    }

    @Test(testName = "This test is for user testing")
    public void testUserTest(@Test String name) {
        System.out.println("Started... ");
    }
}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.PARAMETER})
@interface Test {
    String testName() default "";
}
