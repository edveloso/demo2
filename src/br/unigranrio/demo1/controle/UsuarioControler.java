package br.unigranrio.demo1.controle;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioControler {

	@RequestMapping(value="cadastro")
	public String exibirFormCadastroUsuario(Model model){
		model.addAttribute("meuValor", ">>>>>passou no cadastro");
		return "usuario/cadastro";
	}
	
	@RequestMapping(value="lista")
	public String listarUsuarios(Model model, String nome){
		model.addAttribute("lista", "Lista de usuarios do "+ nome);
		return "usuario/lista";
	}
	
}
