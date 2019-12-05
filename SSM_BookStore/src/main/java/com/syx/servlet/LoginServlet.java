package com.syx.servlet;

import com.syx.oracle.orcaleone;
import com.syx.orcalethree.oraclethree;
import com.syx.orcaltwo.orcaletwo;
import com.syx.postgresql.posqlone;
import com.syx.postgresqlthree.posqlthree;
import com.syx.postgresqltwo.possqltwo;
import com.syx.sqlser.sqltestone;
import com.syx.sqlthree.sqltwo;
import com.syx.sqltwo.sqlthree;
import com.syx.user.userinfo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


/**
 * @author 史翼璇
 * @create 2019/11/2
 */
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)  {
        userinfo userinfo = new userinfo();
        userinfo.setUsername(request.getParameter("username"));
        userinfo.setPassword(request.getParameter("password"));
        userinfo.setZhandian(request.getParameter("zhandian"));
        userinfo.setLeiyonghu(request.getParameter("leiyonghu"));
        posqlone poone=new posqlone();
        possqltwo potwo =new possqltwo();
        posqlthree pothree=new posqlthree();
        System.out.println(userinfo.getUsername()+","+userinfo.getPassword()+","+userinfo.getLeiyonghu()+","+userinfo.getZhandian());
        try {
            if(poone.isUser(userinfo)==true ){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("postgreyemian.jsp");
            } else if(potwo.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("postgreyemian.jsp");
            }else if(pothree.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("postgreyemian.jsp");
            }else if(sqltestone.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("sqlserveyemian.jsp");
            }else if(sqltwo.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("sqlserveyemian.jsp");

            }else if(sqlthree.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("sqlserveyemian.jsp");
            }else if (orcaleone.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("oracleyemian.jsp");
            }else if(orcaletwo.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("oracleyemian.jsp");
            }else if(oraclethree.isUser(userinfo)==true){
                HttpSession httpSession = request.getSession();
                System.out.println("user = " + userinfo.getUsername());
                httpSession.setAttribute("username",userinfo.getUsername());
                response.sendRedirect("oracleyemian.jsp");
            }
            else {
              response.sendRedirect("eeor.jsp");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
