package br.com.integra.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Idealizador{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;

}
