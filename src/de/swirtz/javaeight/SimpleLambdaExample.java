package de.swirtz.javaeight;

public class SimpleLambdaExample {

    public static void main(String[] args) {
        System.out.println(multiplyValueBy(()->{return 42/2;}, 2));
        System.out.println(multiplyValueBy(()->42, 2));
    }


    public static Integer multiplyValueBy(ICallback cb, int y){
        return cb.getValue()*y;
    }

    @FunctionalInterface
    private interface ICallback {
        Integer getValue();
    }
}
