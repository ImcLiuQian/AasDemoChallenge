package com.imc.aasdemochallenge.util;

import lombok.SneakyThrows;
import java.io.*;

public class JsonFileUtil {

    // 用于读取JSON文件
    @SneakyThrows
    public static String read(String filePath) {
        char[] buff = new char[1024];
        FileReader fileReader = new FileReader(filePath);
        fileReader.read(buff);
        fileReader.close();
        return new String(buff);
    }
}
