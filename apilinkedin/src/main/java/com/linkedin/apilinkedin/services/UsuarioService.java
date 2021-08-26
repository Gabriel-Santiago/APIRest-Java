package com.linkedin.apilinkedin.services;

import com.linkedin.apilinkedin.repositories.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    IUsuarioRepository IUsuarioRepository;

    @Autowired
    public UsuarioService(com.linkedin.apilinkedin.repositories.IUsuarioRepository IUsuarioRepository) {
        this.IUsuarioRepository = IUsuarioRepository;
    }
}
