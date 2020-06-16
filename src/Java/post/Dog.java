package post;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Dog {
    public Dog() {
        System.out.println("Dog Constructor...");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog....@PostConstruct...");
    }

    //容器移除对象之前
    @PreDestroy
    public void detory(){
        System.out.println("Dog....@PreDestroy...");
    }

}
