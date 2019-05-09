package com.zs.SmartTeam.security;


import com.zs.SmartTeam.security.handler.AuthenticationFailHandler;
import com.zs.SmartTeam.security.provider.JwtAuthenticationTokenFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecuerityConfig extends WebSecurityConfigurerAdapter{

    @Autowired
    private DatabaseUserDetailsService databaseUserDetailsService;

    @Autowired
    private AuthenticationSuccessHandler successHandler;

    @Autowired
    private AuthenticationFailHandler failHandler;

    @Autowired
    private AuthenticationEntryPoint entryPoint;

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }

//    @Override
//    public void configure(HttpSecurity http) throws Exception {
//        http.httpBasic()
//                .and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//                .and().csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/v2/api-docs/**").permitAll()
//                .anyRequest().authenticated()
//                .and().formLogin().loginProcessingUrl("/api/login");
//                .successHandler(successHandler)
//                .failureHandler(failHandler)
//                .and().exceptionHandling().authenticationEntryPoint(entryPoint);
//    }

//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic()
//            .and()
//            .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED)
//            .and().csrf().disable()
//            .authorizeRequests()
//            .antMatchers("/index.html", "/", "/home", "/login").permitAll()
//            .anyRequest().authenticated()
//            .and().formLogin();
//    }

    @Bean
    public JwtAuthenticationTokenFilter authenticationTokenFilterBean() throws Exception {
        return new JwtAuthenticationTokenFilter();
    }

    @Override
    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .addFilterBefore(authenticationTokenFilterBean(), UsernamePasswordAuthenticationFilter.class)
                // 由于使用的是JWT，我们这里不需要csrf
                .csrf().disable()
                // 基于token，所以不需要session
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                //.antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                // 允许对于网站静态资源的无授权访问
                .antMatchers(
                        HttpMethod.GET,
                        "/",
                        "/*.html",
                        "/favicon.ico",
                        "/**/*.html",
                        "/**/*.css",
                        "/**/*.js"
                ).permitAll()
                // 对于获取token的rest api要允许匿名访问
                .antMatchers("/auth/token").permitAll()
                // 除上面外的所有请求全部需要鉴权认证
                .anyRequest().authenticated()
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()));

        // 禁用缓存
        httpSecurity.headers().cacheControl();
    }

    @Bean
    public static NoOpPasswordEncoder passwordEncoder() {
        return (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance();
    }

    //装载BCrypt密码编码器
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(databaseUserDetailsService)
        .passwordEncoder(passwordEncoder());
    }
}
