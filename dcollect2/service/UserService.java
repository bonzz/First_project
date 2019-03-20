package com.dcollect2.service;

import com.dcollect2.model.User;

public interface UserService {
  
 public User findUserByEmail(String email);
 
 public void saveUser(User user);
}