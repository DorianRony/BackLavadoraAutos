package com.example.backlavadoraautos.controller;

import com.example.backlavadoraautos.entity.Usuario;
import com.example.backlavadoraautos.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioService usuarioService;

    @GetMapping(path = "/listar", produces = "application/json")
    public List<Usuario> lista() {
        return usuarioService.lista();
    }

    @PostMapping(path = "/guardar", produces = "application/json")
    public Usuario guardar(@RequestBody @Validated Usuario tbaUsuario) {
        return usuarioService.save(tbaUsuario);
    }

    @PutMapping(path = "/actualizar", produces = "application/json")
    public void actualizar(@RequestBody @Validated Usuario tbaUsuario) {
        usuarioService.save(tbaUsuario);
    }

    @DeleteMapping(path = "/eliminar", produces = "application/json")
    public void delete(@RequestBody @Validated Usuario tbaUsuario) {
        usuarioService.delete(tbaUsuario);
    }

    @GetMapping(path = "/buscarid/{id}", produces = "application/json")
    public Usuario buscauno(@PathVariable("id") Integer id) {
        return usuarioService.findbyId(id);
    }

    @GetMapping(path = "/buscarnick/{id}", produces = "application/json")
    public Usuario buscaNick(@PathVariable("id") String id) {
        return usuarioService.findbyNick(id);
    }

    @GetMapping(path = "/login/{nick}/{pass}", produces = "application/json")
    public Usuario buscaNick(@PathVariable("nick") String nick,
                             @PathVariable("pass") String pass) {
        return usuarioService.findbyLogin(nick, pass);
    }
}