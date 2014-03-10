package br.com.ideais.groovy.springmvc

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/hello")
class HelloWorldController {

    @RequestMapping("/")
    public Object hello(){
       Map map = [name: 'hello']
       return map
    }

}
