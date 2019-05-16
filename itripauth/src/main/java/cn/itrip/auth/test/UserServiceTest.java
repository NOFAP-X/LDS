package cn.itrip.auth.test;

import cn.itrip.auth.service.UserService;
import cn.itrip.beans.pojo.ItripUser;


import cn.itrip.common.RedisAPI;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

    @Test
    public void testInsertUser() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-mybatis.xml");
        UserService userService = (UserService)ctx.getBean("userService");
        ItripUser user = new ItripUser();
        user.setUserCode("itripczkt@aliyun.com");
        user.setUserName("小明");
        try {
            userService.insertUser(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

  /*  @Test
    public void testInsertUsers() {
        RedisAPI jedis = new RedisAPI("192.168.98.131", 6379);
        jedis.auth("123456");  //密码
        jedis.set("uname", "xiaohua");  //将kye为uname值为xiaohua存入redis数据库中。
        String value = jedis.get("uname");  //取出key为uname的值
        System.out.println("uanme的值为："+ value);
        jedis.del("uname");
        jedis.expire("uname", 6);
        long seconds = jedis.ttl("uname");
        boolean isfalg = jedis.exists("uname");

    }*/
}

