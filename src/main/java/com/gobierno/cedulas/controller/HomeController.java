package main.java.com.gobierno.cedulas.controller;

import com.gobierno.cedulas.model.Persona;
import com.gobierno.cedulas.service.DireccionService;
import com.gobierno.cedulas.service.PersonaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class HomeController {

    private final PersonaService personaService;
    private final DireccionService direccionService;

    public HomeController(PersonaService personaService, DireccionService direccionService) {
        this.personaService = personaService;
        this.direccionService = direccionService;
    }

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("personas", personaService.findAll());
        model.addAttribute("direcciones", direccionService.findAll());
        return "home";
    }

    @GetMapping("/form")
    public String form() {
        return "form";
    }

    @PostMapping("/enviar")
    public String enviar(@ModelAttribute Persona persona) {
        personaService.save(persona);
        return "redirect:/home";
    }
}
