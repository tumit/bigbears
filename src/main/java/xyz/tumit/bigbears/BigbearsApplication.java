package xyz.tumit.bigbears;

public class BigbearsApplication {

    public String hello(String name) {
        return String.format("Hello, %s!", name);
    }

    public static void main(String[] args) {
        System.out.println(new BigbearsApplication().hello("World"));
    }
}
