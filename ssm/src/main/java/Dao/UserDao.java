package Dao;

import domain.sessionBean;
import entity.User;
import org.apache.ibatis.session.SqlSession;

public class UserDao {
    private static SqlSession session;
    static
    {
        session= sessionBean.getSession();
    }
    public static  void insert(User user)
    {
        session.insert("insertUser",user);
        session.commit();
    }
/*    public static void main(String args[])
    {
        User user=new User();
        user.setPwd("123");
        user.setName("hjy");
        insert(user);
    }*/
}
