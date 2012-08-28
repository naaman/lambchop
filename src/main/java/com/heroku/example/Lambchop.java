package com.heroku.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Lambchop {
  public static void main(String[] a) {
    Arrays.asList(a).sorted((l, r) -> l.compareTo(r)).forEach(s -> System.out.println(s));
  }
}
