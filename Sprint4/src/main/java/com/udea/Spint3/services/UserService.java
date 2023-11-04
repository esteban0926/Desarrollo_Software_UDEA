package com.udea.Spint3.services;

import com.udea.Spint3.entity.User;
import com.udea.Spint3.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Metodo para consultar todos los usuarios
    public List<User> getUsers(){
        return userRepository.findAll();
     }

     //Metodo para consultar el Usuario por ID
    public User getUserById(Integer id){
        return userRepository.findById(id).orElse(null);
    }

    // Metodo para crear usuario.
    public User saveUser (User user){
        return userRepository.save(user);
    }

    // Metodo para editar usuario.
    public User updateUser(Integer id, User user) {
        User existing = userRepository.findById(id).orElse(null);
        if (existing != null) {
            user.setId(id);
            User updateUser = userRepository.save(user);
            return updateUser;
        }
        return null;
    }
        // Metodo para eliminar usuario por su ID.
        public String deleteUser (Integer id){
            userRepository.deleteById(id);
            return "Has eliminado el usuario con el ID: " + id;
        }
    }
