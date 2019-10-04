package fytyr.HelloWorldServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class HelloWorldServlet extends HttpServlet {
    private static final long serialVersionUID = 7776547773979597560L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.getOutputStream().write("Hello from HelloWorldServlet!".getBytes(StandardCharsets.UTF_8));
        res.getOutputStream().flush();
        res.getOutputStream().close();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String hello = req.getParameter("Hello");
        res.getOutputStream().write(hello.getBytes(StandardCharsets.UTF_8));
        res.getOutputStream().flush();
        res.getOutputStream().close();
    }
}
