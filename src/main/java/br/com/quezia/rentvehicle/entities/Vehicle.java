package br.com.quezia.rentvehicle.entities;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Vehicle {
    protected Double motor;
    protected String modelo;
    protected String marca;
    protected Date anoFabricacao;
    protected int numeroPassageiros;
    protected TipoCombustivel combustivel;
    public static String dizOla(String nome)
    {

        return "Ola seu nome é: " + nome;
    }
}
