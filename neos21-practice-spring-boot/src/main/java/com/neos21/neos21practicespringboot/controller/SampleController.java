package com.neos21.neos21practicespringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SampleController {
  // URL パス
  @RequestMapping("/sample")
  public String sample() {
    // テンプレート名
    return "sample";
  }
}