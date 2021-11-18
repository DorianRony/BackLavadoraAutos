package com.example.backlavadoraautos.repository;

import com.example.backlavadoraautos.entity.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    Usuario findByNickUsr(String nickUser);
    Usuario findByNickUsrAndPassUsr(String nickUser, String pass);
}