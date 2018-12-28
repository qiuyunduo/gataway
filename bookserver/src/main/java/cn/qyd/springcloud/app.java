package cn.qyd.springcloud;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author qyd
 * @Date 18-12-27 上午10:32
 **/
@SpringBootApplication
@RestController
public class app {


    @GetMapping(path = "/hello/{name}")
    public String hello(@PathVariable("name")String name){
        return "Hello "+name;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(app.class).profiles("server.port=8090").run(args);
    }
}
