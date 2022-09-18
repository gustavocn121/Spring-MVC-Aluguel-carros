package labDev.AluguelCarros.form.contratante;

import labDev.AluguelCarros.model.Usuario;
import labDev.AluguelCarros.repository.UsuarioRepository;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Optional;

@Getter
@Setter
public class UsuarioFormAtualizacao {

	private String login;
	private String senha;
	private String nome;
	
	
	public Usuario atualizar(Long id, UsuarioRepository usuarioRepo) {
		Optional<Usuario> u = usuarioRepo.findById(id);
		if(u.isPresent()) {
			Usuario usuario= u.get();
			usuario.setLogin(this.login);
			usuario.setSenha(this.senha);
			usuario.setNome(this.nome);
			usuario.setDataModificacao(LocalDate.now());
			return usuario;
		}
		
		return null;
	}

}
