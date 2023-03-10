package com.imc.aasdemochallenge.util;

import java.util.UUID;

public class IRIUtil {
    private static String root = "https://siemens.com/ids/sm/";
    public static final String randomSuffix() {
        StringBuilder builder = new StringBuilder(
                UUID.randomUUID().toString()
                        .replaceAll("-", "")
                        .substring(0, 16));
        builder.insert(4, '_');
        builder.insert(9, '_');
        builder.insert(14, '_');
        return builder.toString();
    }

    public static final String randomIRI() {
        return root + randomSuffix();
    }
}
