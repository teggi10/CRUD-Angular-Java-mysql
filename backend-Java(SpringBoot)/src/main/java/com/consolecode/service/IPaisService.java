package com.consolecode.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.consolecode.model.Pais;


@Service
public interface IPaisService {
	List<Pais> listar();
	Pais registrar(Pais pais);
	Pais actualizar(Pais pais);
	void eliminar(Integer codigo);
	Pais ListarPorId(Integer codigo);
}
