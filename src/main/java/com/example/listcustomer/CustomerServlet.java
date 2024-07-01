package com.example.listcustomer;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/customerList")
public class CustomerServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = Arrays.asList(
                new Customer("Mai Văn Hoàn", "1983-08-20", "Hà Nội", "images/1.jpg"),
                new Customer("Nguyễn Văn Nam", "1983-08-21", "Bắc Giang", "images/2.jpg"),
                new Customer("Nguyễn Thái Hòa", "1983-08-22", "Nam Định", "images/3.jpg"),
                new Customer("Trần Đăng Khoa", "1983-08-17", "Hà Tây", "images/4.jpg"),
                new Customer("Nguyễn Đình Thi", "1983-08-19", "Hà Nội", "images/5.jpg")
        );
        request.setAttribute("customers", customers);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
