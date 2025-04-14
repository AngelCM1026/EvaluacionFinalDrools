package com.carbajal.evafinal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbajal.evafinal.Compra;
import com.carbajal.evafinal.service.CompraService;

@RestController
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @PostMapping("/verificar")
    public Compra verificarCompra(@RequestBody Compra compra){
        return compraService.verificarCompra(compra);
    }

}
