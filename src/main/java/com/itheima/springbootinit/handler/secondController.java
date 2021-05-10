package com.itheima.springbootinit.handler;

import com.itheima.springbootinit.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secondController {
    //获取yaml文件内容方式一
    @Value("${carName1}")
    private String car;

    @Value("${carN[0]}")
    private String car2;

    @Value("${person3.age}")
    private String age;

    //获取yaml文件内容方式二
    @Autowired
    private Environment env;

    //方式三
    @Autowired
    private Person person;

    @RequestMapping("/second")
    public String getYaml(){
        System.out.println(car);
        System.out.println(car2);
        System.out.println(age);
        System.out.println("---------------------------------");
        System.out.println(env.getProperty("person3.age"));
        System.out.println(env.getProperty("person4"));
        System.out.println(env.getProperty("person5"));
        System.out.println("---------------------------------");
        System.out.println(person.getAge());
        System.out.println(person);
        return "控制台输出获取到的yaml文件内容";
    }
}
