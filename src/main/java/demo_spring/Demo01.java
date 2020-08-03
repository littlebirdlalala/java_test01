package demo_spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo01 {
    public static void main(String[] args) {
        quickStart();
    }
    public static void quickStart(){
        // 1、ApplicationContext
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2、通过控制反转来创建对象
        Person p = (Person) applicationContext.getBean("c1");
        Person sb = (Person) applicationContext.getBean("a1");
        // 3、调用
        p.showInfo();
        sb.showInfo();
    }
}
