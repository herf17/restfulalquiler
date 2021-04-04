package rivas.hiram.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import rivas.hiram.app.model.Usuarios;
import rivas.hiram.app.repository.UsuariosRepository;

@Service
public class UsuariosDetailsServicesImpl implements UserDetailsService {
	
	@Autowired
	private UsuariosRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuarios user = userRepository.findByUsername(username);
		if (user == null) {
            throw new UsernameNotFoundException("No se encontro");
        }
		//UserDetails usuario = User.withUsername(user.getUsername()).password(user.getPassword()).authorities("USUARIO").build();
        return new UsuariosDetailsImpl(user);
	}

}
