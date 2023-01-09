package com.empresa.app.funcionario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroFuncionario(

        @NotBlank
        String nome,
        @NotBlank
        String cpf,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String telefone
) {

        public DadosCadastroFuncionario(Funcionario funcionario){
                this(funcionario.getNome(), funcionario.getCpf(), funcionario.getTelefone());
        }

}
