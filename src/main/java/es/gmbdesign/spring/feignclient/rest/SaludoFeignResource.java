package es.gmbdesign.spring.feignclient.rest;

import es.gmbdesign.spring.feignclient.feign.Saludo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SaludoFeignResource {
    @Autowired
    Saludo saludo;

    @RequestMapping("/get-saludo")
    public String getSaludo(){
        return saludo.saludo();
    }
}
