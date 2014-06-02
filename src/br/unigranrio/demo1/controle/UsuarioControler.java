package br.unigranrio.demo1.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.unigranrio.demo1.modelo.Usuario;
import br.unigranrio.demo1.modelo.persistencia.UsuarioDAO;

@Controller
@RequestMapping(value="/usuario")
public class UsuarioControler {

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@RequestMapping(value="cadastro")
	public String exibirFormCadastroUsuario(Model model){
		return "usuario/cadastro";
	}
	
	
	@RequestMapping(value="gravarCadastro")
	public String cadastrarUsuario(Usuario usuario, Model model){
		usuarioDAO.salvar(usuario);
		return "redirect:lista";
	}
	
	
	
	@RequestMapping(value="lista")
	public String listarUsuarios(Model model){
		List<Usuario> todosUsuarios = usuarioDAO.listarTodosUsuarios(); 
		model.addAttribute("lista", todosUsuarios);
		return "usuario/lista";
	}

	
	@RequestMapping(value="formEditar")
	public String formEditarUsuario(Model model, String nome){
		Usuario usuario = usuarioDAO.getUsuarioBy(nome);
		model.addAttribute("usuario", usuario); 
		return "usuario/editar";
	}

	
	@RequestMapping(value="alterar")
	public String alterarUsuarios(Model model, Usuario usuario){
		usuarioDAO.alterar(usuario);
		return "redirect:lista";
	}
	
	@RequestMapping(value="deletar")
	public String deletarUsuarios(Model model, String nome){
		usuarioDAO.deletarBy(nome);
		return "redirect:lista";
	}

	
	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
}
