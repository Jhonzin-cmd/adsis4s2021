package br.unicesumar.adsis4s2021.meu.joao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joao-controller")
public class JoaoController {
	
	@GetMapping
	public String Get() {
		return "Olha, o joao-controller está funcionando";
	}
	
	
	
}
