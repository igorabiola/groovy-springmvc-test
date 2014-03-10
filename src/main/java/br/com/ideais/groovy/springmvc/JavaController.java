package br.com.ideais.groovy.springmvc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/hello2")
public class JavaController {

    @RequestMapping("/")
    public String hello(){
      return "hello2";
    }
}
