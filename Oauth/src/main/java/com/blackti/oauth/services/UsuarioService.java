package com.blackti.oauth.services;

import com.blackti.oauth.dto.UsuarioDTO;
import com.blackti.oauth.feignclients.UsuarioFeignClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements UserDetailsService {

    private static Logger logger = LoggerFactory.getLogger(UsuarioService.class);

    @Autowired
    private UsuarioFeignClient usuarioFeignClient;

    public UsuarioDTO findByEmail (String email) throws IllegalAccessException{
        UsuarioDTO dto = usuarioFeignClient.findByEmail(email).getBody();
        if(dto == null ){
            throw new IllegalAccessException("Email não encontrado");
        }
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        UsuarioDTO dto = usuarioFeignClient.findByEmail(email).getBody();
        if(dto == null ){
            logger.error("Email não encontrado = " + email);
            throw new UsernameNotFoundException("Email não encontrado");
        }
        logger.info("Email encontrado = " + email);
        return dto;
    }
}
