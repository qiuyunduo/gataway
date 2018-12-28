package cn.qyd.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @Author qyd
 * @Date 18-12-27 上午9:37
 **/
@SpringBootApplication
@EnableZuulProxy
public class app {
    public static void main(String[] args) {
//        SpringApplication.run(app.class,args);
        new SpringApplicationBuilder(app.class).profiles("server.port=8090").run(args);
    }
}
