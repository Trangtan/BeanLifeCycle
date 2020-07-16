package post;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("post")
@Configuration
public class MainConfigOfLifeCycle {
// * 4）、BeanPostProcessor【interface】：bean的后置处理器；
// * 		在bean初始化前后进行一些处理工作；
// * 		postProcessBeforeInitialization:在初始化之前工作
// * 		postProcessAfterInitialization:在初始化之后工作
// *
}
