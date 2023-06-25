# Spring security basic
Proyecto spring boot usando spring security

## Configuracion SecurityConfiguration
```java
@Bean
public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

    http.csrf(x -> x.disable());

    // setting stateless session, because we choose to implement Rest API
    http.sessionManagement(x -> x.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

    http.authorizeRequests(x -> x
    .requestMatchers("/").permitAll()
    .requestMatchers("/api/v1/usuarios/autenticar").permitAll()
    .anyRequest().authenticated());

    // setting custom entry point for unauthenticated request
    http.exceptionHandling(x->x.authenticationEntryPoint(new CustomAuthenticationEntryPoint()));

    http.addFilterBefore(new JTokenFilter(jTokenProvider), UsernamePasswordAuthenticationFilter.class);

    return http.build();
}
```
## Spring Security: Exception Handling
La excepción se lanzará cuando el usuario no está autenticado, entonces, se invocará a _CustomAuthenticationEntryPoint_.

## Usuarios demo

| Usuario             | Password |
| ----------------- |----------|
| edwin             | edwin    |
| david             | david    |
| usuario3          | usuario3 |
| usuario4          | usuario4 |


## Acknowledgements
 - [https://github.com/murraco/spring-boot-jwt](https://github.com/murraco/spring-boot-jwt/blob/master/src/main/java/murraco/security/WebSecurityConfig.java)

## Authors
- [@eleonv](https://github.com/eleonv)

