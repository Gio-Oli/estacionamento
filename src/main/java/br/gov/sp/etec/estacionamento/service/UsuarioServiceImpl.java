package br.gov.sp.etec.estacionamento.service;

import br.gov.sp.etec.estacionamento.entity.UsuarioEntity;
import br.gov.sp.etec.estacionamento.model.Usuario;
import br.gov.sp.etec.estacionamento.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    UsuarioRepository repository;


    @Override
    public String cadastrarUsuario(Usuario usuario) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNome(usuario.getNome());
        usuarioEntity.setCpf(usuario.getCpf());
        usuarioEntity.setEmail(usuario.getEmail());
        usuarioEntity.setNascimento(usuario.getNascimento());
        usuarioEntity.setTelefone(usuario.getTelefone());
        usuarioEntity.setSenha(usuario.getSenha());
        repository.save(usuarioEntity);
        return "";
    }

    @Override
    public List<Usuario> listarUsuario() {
        return List.of();
    }

    @Override
    public String atualizarUsuario(Usuario usuario) {
        return "";
    }

    @Override
    public String deletarUsuario(Long id) {
        return "";
    }

    @Override
    public Usuario buscaUsuarioPorEmail(String email) {

        UsuarioEntity entity = repository.findByEmail(email);
        Usuario user = toUsuario(entity);
        return user;
    }

    private Usuario toUsuario(UsuarioEntity entity){
     Usuario usuario = new Usuario();
     usuario.setEmail(entity.getEmail());
     usuario.setNome(entity.getNome());
     usuario.setCpf(entity.getCpf());
     usuario.setNascimento(entity.getNascimento());
     usuario.setTelefone(entity.getTelefone());
     usuario.setSenha(entity.getSenha());

     return usuario;
    }
}