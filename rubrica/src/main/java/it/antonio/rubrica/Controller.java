package it.antonio.rubrica;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;






@org.springframework.stereotype.Controller
public class Controller {
	@Autowired
	private ContattoRepository contattoRepository; 
	public Controller() {
		// TODO Auto-generated constructor stub
	}
	
	
	@GetMapping("/rubrica")
	public String visualizza(Model model) {
		
		List<Contatto> contatti =  contattoRepository.findAll(); 
		model.addAttribute("contatti",contatti);
		return "rubrica";
		
	}
	
	@PostMapping(path = "/eliminacontatto")
	public String cancella(@ModelAttribute Contatto contatto,Model model) 
	{
		contattoRepository.deleteById(contatto.getId());
		return visualizza(model);
	}
	
	@PostMapping(path = "/aggiungicontatto")
	public String aggiungi(@ModelAttribute Contatto contatto,Model model ) 
	{
		contattoRepository.save(contatto);
		return visualizza(model);
	}
	
	
	
	//Chiamare questo controller per fare dei test di inserimento
	@GetMapping("/testDatabase")
	public String insertOnForTest() {
		
		Contatto contatto = new Contatto();
		contatto.setId("3447523458");
		contatto.setFirstName("Gaetano");
		contatto.setLastName("D'Orsi");
		contattoRepository.save(contatto);
		return "";
	}

}

