/**
 * 
 */
package me.furtherit.myfirstjavaproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author jmoreno
 *
 */ 

@RestController
public class HelloGradleController {

    @RequestMapping("/api/v1")
    public String helloGradle() {
        return "Estamos empezando!";
    }

 
    @RequestMapping("/api/v2")
    public String byeGradle() {
        return "Estamos terminando!";
    }
}


