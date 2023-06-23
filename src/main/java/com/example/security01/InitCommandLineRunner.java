package com.example.security01;

import com.example.security01.entity.JPAUsuario;
import com.example.security01.util.Constante;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class InitCommandLineRunner implements CommandLineRunner {

    public static List<JPAUsuario> listUsuarios = new ArrayList<>();
    @Override
    public void run(String... args) throws Exception {
        JPAUsuario sscAbdUsuario = new JPAUsuario();
        sscAbdUsuario.setName("edwin");
        sscAbdUsuario.setPassword("edwin");
        //sscAbdUsuario.setEmail("edwin@gmail.com");
        sscAbdUsuario.setUsername(sscAbdUsuario.getName());
        sscAbdUsuario.setRoles(Constante.ROL_ADMIN);
        listUsuarios.add(sscAbdUsuario);
        //repository.save(sscAbdUsuario);

        JPAUsuario sscAbdUsuario2 = new JPAUsuario();
        sscAbdUsuario2.setName("david");
        sscAbdUsuario2.setPassword("david");
        //sscAbdUsuario2.setEmail("correo2@gmail.com");
        sscAbdUsuario2.setUsername(sscAbdUsuario2.getName());
        sscAbdUsuario2.setRoles(Constante.ROL_ADMIN);
        listUsuarios.add(sscAbdUsuario2);
        //repository.save(sscAbdUsuario2);

        JPAUsuario sscAbdUsuario3 = new JPAUsuario();
        sscAbdUsuario3.setName("usuario 3");
        sscAbdUsuario3.setPassword("usuario 3");
        //sscAbdUsuario3.setEmail("correo3@gmail.com");
        sscAbdUsuario3.setUsername(sscAbdUsuario3.getName());
        sscAbdUsuario3.setRoles(Constante.ROL_USER);
        listUsuarios.add(sscAbdUsuario3);
        //repository.save(sscAbdUsuario3);

        JPAUsuario sscAbdUsuario4 = new JPAUsuario();
        sscAbdUsuario4.setName("usuario 4");
        sscAbdUsuario4.setPassword("usuario 4");
        //sscAbdUsuario4.setEmail("correo4@gmail.com");
        sscAbdUsuario4.setUsername(sscAbdUsuario4.getName());
        sscAbdUsuario4.setRoles(Constante.ROL_USER);
        listUsuarios.add(sscAbdUsuario4);
        //repository.save(sscAbdUsuario4);

        //repository.findAll().forEach(System.out::println);

        listUsuarios.forEach(x->System.out.println(x));
    }
}
