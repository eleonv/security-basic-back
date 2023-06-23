package com.example.security01.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Constante {
    public static final String RESPONSE_OK = "1";
    public static final String RESPONSE_ERROR = "0";

    public static final String ROL_ADMIN = "ADMIN";
    public static final String ROL_USER = "ROL_USER";

    public static final String SECRET_TOKEN = "404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970404E635266556A586E3272357538782F413F4428472B4B6250645367566B5970";

    /*
    * Los tokens se crean convirtiendo los nombres de usuario en base64. Ejemplo: edwin -> ZWR3aW4=
    * La lista de usuario se encuentra en la clase InitCommandLineRunner.
    * edwin -> ZWR3aW4=
    * david -> ZGF2aWQ=
    * usuario 3 -> dXN1YXJpbyAz
    * */
    public static final List<String> TOKENS_APP = new ArrayList<>(Arrays.asList("ZWR3aW4=", "ZGF2aWQ=", "dXN1YXJpbyAz"));
}