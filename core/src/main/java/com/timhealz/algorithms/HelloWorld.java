package com.timhealz.algorithms;

public class HelloWorld {

    private String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getHelloWorldMsg() {
        return "Hello " + name + "!";
    }

    public static void main(String[] args) {
        System.out.println("Names to greet: " + args.length);
        for (String name : args) {
            HelloWorld hello = new HelloWorld(name);
            System.out.println(hello.getHelloWorldMsg());
        }
    }
}
