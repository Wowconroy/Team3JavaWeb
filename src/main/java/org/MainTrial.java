package org;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.teamwork.dao.UserDao;

public class MainTrial {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                    new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao user = applicationContext.getBean("sessionFactory", UserDao.class);
        user.testQuery();

    }
}
