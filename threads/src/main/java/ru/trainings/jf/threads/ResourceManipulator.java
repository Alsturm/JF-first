package ru.trainings.jf.threads;

import com.hegel.core.functions.ExceptionalFunction;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.function.Function;

@Log4j2
public class ResourceManipulator {

    public static void main(String[] args) {
        log.info(
                mapFile(ExceptionalFunction.toUncheckedFunction((InputStream inputStream) -> inputStream.read())));
    }

    @SneakyThrows
    private static  <T> T mapFile(Function<InputStream, T> inputStreamMapper) {
        try (InputStream inputStream = new FileInputStream("threads/src/main/resources/jhadg.txt")) {
            return inputStreamMapper.apply(inputStream);
        }
    }
}
