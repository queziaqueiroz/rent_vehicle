package br.com.quezia.rentvehicle.entities;
import javax.persistence.*;


import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
public class Vehicle {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    protected Long id;
    protected Long locator_id;
    @Transient
    protected Locator locator;
    @Column(name="potencia",nullable = false)
    protected Double motor;
    protected String modelo;
    protected String marca;
    protected Date anoFabricacao;
    protected int numeroPassageiros;
    @Enumerated(EnumType.STRING)
    protected TipoCombustivel combustivel;
    public static String dizOla(String nome)
    {

        return "Ola seu nome é: " + nome;
    }
}
