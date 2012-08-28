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
    PrintWriter w = resp.getWriter();
    System.getProperties()
      .filter((l, r) -> r.toString().contains("1.8"))
      .sorted((l, r) -> l.toString().compareTo(r.toString()))
      .forEach((l, r) -> w.println(l.toString() + "=" + r.toString()));
  }
}
