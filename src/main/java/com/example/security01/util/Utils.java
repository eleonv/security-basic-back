package com.example.security01.util;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class Utils {

    public static String base64ToString(String string){
        byte[] decoded = Base64.getDecoder().decode(string);
        String value = new String(decoded, StandardCharsets.UTF_8);
        System.out.println(value);
        return value;

    }
}
