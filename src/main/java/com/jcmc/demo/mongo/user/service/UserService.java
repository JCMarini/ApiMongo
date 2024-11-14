package com.jcmc.demo.mongo.user.service;

import com.jcmc.demo.mongo.user.model.User;
import com.jcmc.demo.mongo.user.repository.UserRepository;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository employeeRepository;

    private static final Log log = LogFactory.getLog(UserService.class);

    public User saveOrUpdate(User user) {
        log.info("Se guardaron los datos del usuario " + user.toString());
        return employeeRepository.save(user);
    }

    public List<User> findAll() {
        log.info("Se regresaron todos los usuarios");
        return employeeRepository.findAll();
    }

    public void delete(User user) {
        log.info("Se borro el usuario " + user.toString());
        employeeRepository.delete(user);
    }

}
