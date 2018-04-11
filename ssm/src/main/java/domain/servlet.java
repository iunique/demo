package domain;

import Dao.UserDao;
import entity.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class servlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String pwd=req.getParameter("pwd");
        User user=new User();
        user.setName(name);
        user.setPwd(pwd);
        UserDao.insert(user);
        System.out.println("shit");
        System.out.println("name:"+name);
        System.out.println("pwd:"+pwd);

    }
}

