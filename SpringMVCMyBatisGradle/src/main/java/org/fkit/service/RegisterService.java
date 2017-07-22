package org.fkit.service;

import org.fkit.domain.User;


public interface RegisterService {
User register(String username,String password,String email,String phone,String address);
}
