package mx.utng.sesionn21.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.utng.sesionn21.model.saludo;

@RestController
public class SaludoController {
    @GetMapping("/saludo")
    public saludo saludar (){
        saludo saludo = new saludo();
        saludo.setMensaje("Hola mundo desde SpringBoot");
        return saludo;
    }
    
    
}
