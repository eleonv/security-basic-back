package com.example.security01;

import com.example.security01.entity.JPAToken;
import com.example.security01.entity.JPAUsuario;
import com.example.security01.util.Constante;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitCommandLineRunner implements CommandLineRunner {

    public static List<JPAUsuario> listUsuarios = new ArrayList<>();
    public static List<JPAToken> listTokens = new ArrayList<>();
    @Override
    public void run(String... args) throws Exception {
        JPAUsuario sscAbdUsuario = new JPAUsuario();
        sscAbdUsuario.setName("edwin");
        sscAbdUsuario.setPassword("edwin");
        sscAbdUsuario.setUsername(sscAbdUsuario.getName());
        listUsuarios.add(sscAbdUsuario);

        JPAUsuario sscAbdUsuario2 = new JPAUsuario();
        sscAbdUsuario2.setName("david");
        sscAbdUsuario2.setPassword("david");
        sscAbdUsuario2.setUsername(sscAbdUsuario2.getName());
        listUsuarios.add(sscAbdUsuario2);

        JPAUsuario sscAbdUsuario3 = new JPAUsuario();
        sscAbdUsuario3.setName("usuario3");
        sscAbdUsuario3.setPassword("usuario3");
        sscAbdUsuario3.setUsername(sscAbdUsuario3.getName());
        listUsuarios.add(sscAbdUsuario3);

        JPAUsuario sscAbdUsuario4 = new JPAUsuario();
        sscAbdUsuario4.setName("usuario4");
        sscAbdUsuario4.setPassword("usuario4");
        sscAbdUsuario4.setUsername(sscAbdUsuario4.getName());
        listUsuarios.add(sscAbdUsuario4);

        listUsuarios.forEach(x->System.out.println(x));

    }
}
