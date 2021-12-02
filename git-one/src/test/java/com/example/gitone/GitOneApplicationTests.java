package com.example.gitone;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GitOneApplicationTests {

    @Test
    void contextLoads() {
        System.out.println("this one");
    }

    @Test
    void contextLoads2(){
        System.out.println("test222222222222222222222222");
        System.out.println("test1111111111111111111111");
    }

    @Test
    void contextLoads3(){
        System.out.println("this test2");
    }

    @Test
    void contextLoads4(){
        System.out.println("test rebase");
    }

    @Test
    void test1(){
        int i1 = 1;
        Integer i2 = 2;
        Integer i3 = new Integer(3);

        i1 = i3;
        i3 = i1;
        i2 = i1;
        System.out.println(i3);
    }

}
