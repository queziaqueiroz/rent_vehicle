package br.com.quezia.rentvehicle.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@Entity
public class Renter {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    protected  Long id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String numeroTelefone;

}
