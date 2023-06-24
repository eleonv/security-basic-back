# Spring security basic
Proyecto spring boot usando spring security

## Configuracion SecurityConfiguration
```java
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    http.csrf(x-> x.disable());
    http.sessionManagement(x -> x.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

    http.authorizeRequests(x -> x
            .requestMatchers("/").permitAll()
                .anyRequest().authenticated());

    http.apply(new JTokenFilterConfigurer(jwtTokenProvider));

    return http.build();
}
```

## Acknowledgements
 - [https://github.com/murraco/spring-boot-jwt](https://github.com/murraco/spring-boot-jwt/blob/master/src/main/java/murraco/security/WebSecurityConfig.java)

## Authors
- [@eleonv](https://github.com/eleonv)

