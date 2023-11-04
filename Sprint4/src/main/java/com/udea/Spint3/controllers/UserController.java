package com.udea.Spint3.controllers;

import com.udea.Spint3.entity.User;
import com.udea.Spint3.services.UserService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    //Mostrar todos los usuarios
    @GetMapping("/users")
    public List<User>getUsers(){
        return userService.getUsers();
    }

    //Guardar un nuevo usuario
    @PostMapping("/addUser")
    public RedirectView saveUser(@ModelAttribute User usuario, Model model){
        model.addAttribute(usuario);
        userService.saveUser(usuario);
        return new RedirectView("/");

    }

    //Mostrar el usuario por ID.
    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    //Actualizar o modificar el usuario
    @PatchMapping("/updateUser/{id}")
    public void updateUser (@PathVariable Integer id, @RequestBody User user){
        userService.updateUser(id,user);
    }

    //Eliminar un usuario
    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }

}
