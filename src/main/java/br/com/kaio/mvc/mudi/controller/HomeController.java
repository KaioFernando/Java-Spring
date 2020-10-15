package br.com.kaio.mvc.mudi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.kaio.mvc.mudi.model.Pedido;
import br.com.kaio.mvc.mudi.model.StatusPedidoType;
import br.com.kaio.mvc.mudi.repository.PedidoRepository;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/home")
public class HomeController {
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@GetMapping
	public String home(Model model, Principal principal) {
		List<Pedido> pedidos = pedidoRepository.findByStatus(StatusPedidoType.ENTREGUE);
		model.addAttribute("pedidos", pedidos);	
		return "home";
	}

}
