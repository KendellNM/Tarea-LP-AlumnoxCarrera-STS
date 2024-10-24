package com.example.demo.daoImpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.CarreraDao;
import com.example.demo.entity.Carrera;
import com.example.demo.respository.CarreraRepository;

@Component
public class CarreraDaoImpl implements CarreraDao {
	
	@Autowired
	private CarreraRepository carreraRepository;

	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carreraRepository.save(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carreraRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraRepository.deleteById(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return carreraRepository.findById(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreraRepository.findAll();
	}

}
