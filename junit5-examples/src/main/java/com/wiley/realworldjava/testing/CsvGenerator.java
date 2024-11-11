package com.wiley.realworldjava.testing;

import java.util.Arrays;
import java.util.stream.Collectors;

public final class CsvGenerator {

    public static String create(String... names) {
        return Arrays.stream(names)
                .map(s -> "%s,%d".formatted(s, s.length()))
                .collect(Collectors.joining("\n"));
    }
}
