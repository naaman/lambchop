package com.heroku.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class LambdaServlet extends HttpServlet {
  @Override
  protected void doGet(final HttpServletRequest req, final HttpServletResponse resp) throws ServletException, IOException {
    final PrintWriter w = resp.getWriter();
    System.getProperties()
      .filter((k, v) -> v.toString().contains("1.8"))
      .sorted((k, v) -> k.toString().compareTo(v.toString()))
      .forEach((k, v) -> w.println(k.toString() + "=" + v.toString()));
  }
}
