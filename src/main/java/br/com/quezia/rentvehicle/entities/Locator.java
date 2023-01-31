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
public class Locator {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    protected  Long id;
    protected String name;
    protected String cpf;
    protected String Rg;
    protected String email;
    protected String numeroTelefone;

}
