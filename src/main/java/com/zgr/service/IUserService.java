package com.zgr.service;

import com.zgr.domain.User;

import java.util.List;

public interface IUserService {

    List<User> getUsers();

    User getUserById(Integer id);

    Integer insert (User user);

    Integer update (User user);

    Integer delete (Integer id);

}
