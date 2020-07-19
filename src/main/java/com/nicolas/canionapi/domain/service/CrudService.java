package com.nicolas.canionapi.domain.service;

import java.util.List;
import java.util.Optional;

public interface CrudService<T, ID> {
	
	public Optional<T> buscar(ID id);
	
	public List<T> buscarTodos();
	
	public T salvar(T t);
	
	public void excluir(ID id);
	
	

}
