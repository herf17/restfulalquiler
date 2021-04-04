package rivas.hiram.app.services;

import java.util.Arrays;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import rivas.hiram.app.model.Usuarios;

public class UsuariosDetailsImpl implements UserDetails {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Usuarios usuarios;
	
	

	public UsuariosDetailsImpl(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(usuarios.getRole());
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return usuarios.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return usuarios.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

}
