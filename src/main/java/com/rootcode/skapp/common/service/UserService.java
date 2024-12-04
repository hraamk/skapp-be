package com.rootcode.skapp.common.service;

import com.rootcode.skapp.common.model.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService {

	UserDetailsService userDetailsService();

	User getCurrentUser();

}
