package init;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class Cat implements InitializingBean, DisposableBean {
    public Cat() {
        System.out.println("init.Cat Constructor...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init.Cat afterPropertiesSet...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("init.Cat Destory...");
    }
}
