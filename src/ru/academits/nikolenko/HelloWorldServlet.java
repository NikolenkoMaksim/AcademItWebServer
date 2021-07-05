package ru.academits.nikolenko;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serial;
import java.nio.charset.Charset;

public class HelloWorldServlet extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 6056418773018318646L;

    protected void doGet(HttpServletRequest reg, HttpServletResponse resp) throws IOException {
        resp.getOutputStream().write("Hello from HelloWorldServlet".getBytes(Charset.forName("UTF-8")));
        resp.getOutputStream().flush();
        resp.getOutputStream().close();
    }
}
