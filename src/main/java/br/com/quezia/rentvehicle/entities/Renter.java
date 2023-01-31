package br.com.quezia.rentvehicle.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Entity
public class Renter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected  Long id;
    @NotBlank(message = "Campo Obrigatório")
    protected String dataNascimento;
    @NotBlank(message = "Campo Obrigatório")
    protected String name;
    @NotBlank(message = "Campo Obrigatório")
    protected String cpf;
    @NotBlank(message = "Campo Obrigatório")
    protected String Cnh;
    @NotBlank(message = "Campo Obrigatório")
    protected String Rg;
    @NotBlank(message = "Campo Obrigatório")
    protected String email;
    @NotBlank(message = "Campo Obrigatório")
    protected String numeroTelefone;

}
