package ru.trainings.jf.threads;

import lombok.extern.log4j.Log4j2;
import lombok.val;

@Log4j2
public class UncaughtException {

    public static void main(String[] args) {

        val t = Thread.currentThread();

//        Thread t = new Thread(() -> {
//            throw new RuntimeException("It is a great exception.");
//        });

        Thread.currentThread().setUncaughtExceptionHandler(
                (t1, e) -> log.info("{} throws exception: {}", t1 == t, e)
        );

        throw new RuntimeException("It is a great exception.");

//        t.start();
    }
}
