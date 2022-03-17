package xyz.bugboom.comicapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("xyz.bugboom.comicapi.mapper")
@SpringBootApplication
public class ComicApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ComicApiApplication.class, args);
    }

}
