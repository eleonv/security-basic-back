package com.example.security01.controller;

import com.example.security01.entity.RequestUsuario;
import com.example.security01.entity.ResponseApi;
import com.example.security01.util.Constante;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1/usuarios")
public class UserController {

    @GetMapping(value = "listar", produces = "application/json")
    public ResponseEntity<?> listar(HttpServletRequest request) {

        ResponseApi responseAppBean = new ResponseApi();
        try {

            responseAppBean.setStatus(Constante.RESPONSE_OK);
            responseAppBean.setMessage("Listar usuarios");
            return new ResponseEntity<>(responseAppBean, HttpStatus.OK);
        } catch (Exception e) {
            responseAppBean.setStatus(Constante.RESPONSE_ERROR);
            return new ResponseEntity<>(responseAppBean, HttpStatus.ACCEPTED);
        }
    }

    @PostMapping(value = "registrar", produces = "application/json")
    public ResponseEntity<?> registrar(@RequestBody RequestUsuario requestUsuario, HttpServletRequest request) {

        ResponseApi responseAppBean = new ResponseApi();
        try {

            responseAppBean.setStatus(Constante.RESPONSE_OK);
            responseAppBean.setMessage("registrar usuario");
            return new ResponseEntity<>(responseAppBean, HttpStatus.OK);
        } catch (Exception e) {
            responseAppBean.setStatus(Constante.RESPONSE_ERROR);
            return new ResponseEntity<>(responseAppBean, HttpStatus.ACCEPTED);
        }
    }

    @PostMapping(value = "validar", produces = "application/json")
    public ResponseEntity<?> validar(@RequestBody RequestUsuario requestUsuario, HttpServletRequest request) {

        ResponseApi responseAppBean = new ResponseApi();
        try {

            responseAppBean.setStatus(Constante.RESPONSE_OK);
            responseAppBean.setMessage("validar usuario");
            return new ResponseEntity<>(responseAppBean, HttpStatus.OK);
        } catch (Exception e) {
            responseAppBean.setStatus(Constante.RESPONSE_ERROR);
            return new ResponseEntity<>(responseAppBean, HttpStatus.ACCEPTED);
        }
    }


}
