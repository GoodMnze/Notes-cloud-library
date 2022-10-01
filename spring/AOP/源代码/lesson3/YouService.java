package org.example.lesson3;

import org.springframework.stereotype.Service;

/**
 * 业务类
 */
@Service
public class YouService {
    public void doDelete(){
        System.out.println("You业务类模拟执行删除操作@@@@");
    }

    public void show(){
        System.out.println("You业务类中的show方法");
    }
}
