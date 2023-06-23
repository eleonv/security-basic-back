package com.example.security01.config;

import com.example.security01.util.Constante;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    private final JTokenProvider jwtTokenProvider;

    public SecurityConfiguration(JTokenProvider jwtTokenProvider) {
        this.jwtTokenProvider = jwtTokenProvider;
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        //http.authorizeRequests((requests) -> requests.anyRequest().authenticated());

        //http.sessionManagement();
        http.csrf(x-> x.disable());
        http.sessionManagement(x -> x.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        http.authorizeRequests(x -> x
                .requestMatchers("/").permitAll()
                //.requestMatchers("/api/register", "/api/register", "/api/authenticate").permitAll()
                //.requestMatchers("/api/v1/usuarios/**").hasAuthority(Constante.ROL_ADMIN)
                .requestMatchers("/api/v1/usuarios/listar").hasAuthority(Constante.ROL_ADMIN)
                .requestMatchers("/api/v1/usuarios/registrar").hasAuthority(Constante.ROL_ADMIN)
                .requestMatchers("/api/v1/usuarios/validar").hasAuthority(Constante.ROL_USER)
                        //.requestMatchers("/api/v1/usuarios/**").anonymous()
                        .anyRequest().authenticated());
                //.httpBasic();

        http.apply(new JTokenFilterConfigurer(jwtTokenProvider));

        //sessionManagement()
        //.sessionCreationPolicy(SessionCreationPolicy.STATELESS)
        //http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
        //http.authenticationProvider(authenticationProvider());

        /*return http
                // other configuration options
                .authorizeHttpRequests(authCustomizer -> authCustomizer
                        .requestMatchers(HttpMethod.POST, "/api/subscriptions").permitAll()
                        .requestMatchers(
                                "/api/register", "/api/register", "/api/authenticate"
                        ).permitAll()
                        .requestMatchers("/api/logs/**").hasAuthority(AuthoritiesConstants.ADMIN)
                        .requestMatchers("/api/**").authenticated()
                )
                .build();*/

        //http.httpBasic(ht-> ht.disable());

        return http.build();
    }
}