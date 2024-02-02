package com.Cliente.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;



@Data 
@AllArgsConstructor 

@Entity

public class ModelCliente {

    @Id
    @GeneratedValue

    private Long id;
    private String Nombre;
    private String Aoellido;

}
