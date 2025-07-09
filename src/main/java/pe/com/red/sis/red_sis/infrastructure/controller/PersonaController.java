package pe.com.red.sis.red_sis.infrastructure.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.red.sis.red_sis.aplication.ports.input.PersonaUseCase;

@RestController
@RequestMapping("/persona")
@RequiredArgsConstructor
public class PersonaController {

    private final PersonaUseCase personaUseCase;



}
