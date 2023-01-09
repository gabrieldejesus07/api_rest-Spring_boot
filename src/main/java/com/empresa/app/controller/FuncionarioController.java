package com.empresa.app.controller;

import com.empresa.app.funcionario.DadosCadastroFuncionario;
import com.empresa.app.funcionario.Funcionario;
import com.empresa.app.funcionario.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    public FuncionarioRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroFuncionario dados){
        repository.save(new Funcionario(dados));
    }

    @GetMapping
    public Page<DadosCadastroFuncionario> listar(Pageable paginacao){
        return repository.findAll(paginacao).map(DadosCadastroFuncionario::new);
    }
}
