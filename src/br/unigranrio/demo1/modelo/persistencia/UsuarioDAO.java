package br.unigranrio.demo1.modelo.persistencia;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import br.unigranrio.demo1.modelo.Usuario;

@Component
public class UsuarioDAO {
	
	private static List<Usuario> usuarios;
	
	static{
		usuarios = new ArrayList<Usuario>();
	}	
	
	public void salvar(Usuario usuario){
		usuarios.add(usuario);
	}
	
	public Usuario getUsuarioBy(String nome){
		for (Usuario u : usuarios) {
			if(u.getNome().equals(nome))
				return u;
		}
		return null;
	}
	
	public void deletarBy(String nome){
		for (Usuario u : usuarios) {
			if(u.getNome().equals(nome))
				usuarios.remove(u);		
		}
	}
	
	public void alterar(Usuario usuarioParam){
		for (int i = 0; i < usuarios.size(); i++) {
			if(usuarios.get(i).getNome().equals(usuarioParam.getNome()))
				usuarios.set(i, usuarioParam);
		}
	}

	public List<Usuario> listarTodosUsuarios(){
		return usuarios;
	}
	

}
