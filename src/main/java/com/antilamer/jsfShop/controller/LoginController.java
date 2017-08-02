package com.antilamer.jsfShop.controller;

import com.antilamer.jsfShop.entity.UserEntity;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;

@Scope(value = "session")
@Component(value = "loginController")
@ELBeanName(value = "loginController")
@Join(path = "/login", to = "/view/login.jsf")
public class LoginController {
}
