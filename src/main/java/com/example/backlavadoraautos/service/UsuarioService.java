package com.example.backlavadoraautos.service;

import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepo;

    public List<Usuario> lista() {
        return (List<Usuario>) usuarioRepo.findAll();
    }

    public Usuario findbyId(Integer id) {
        return usuarioRepo.findById(id).get();
    }

    public Usuario save(Usuario tbaUsuario) {
        return usuarioRepo.save(tbaUsuario);
    }

    public void delete(Usuario tbaUsuario) {
        usuarioRepo.delete(tbaUsuario);
    }

    public Usuario findbyNick(String nick) {
        return usuarioRepo.findByNickUsr(nick);
    }

    public Usuario findbyLogin(String nick, String pass) {
        return usuarioRepo.findByNickUsrAndPassUsr(nick, pass);
    }
}