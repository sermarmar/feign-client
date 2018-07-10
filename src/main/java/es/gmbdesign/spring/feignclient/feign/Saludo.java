package es.gmbdesign.spring.feignclient.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("microservicio")
public interface Saludo {
    @RequestMapping("/welcome")
    public String saludo();
}
