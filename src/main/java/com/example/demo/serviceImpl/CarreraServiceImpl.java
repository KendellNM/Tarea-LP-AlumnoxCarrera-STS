package com.example.demo.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.CarreraDao;
import com.example.demo.entity.Carrera;
import com.example.demo.service.CarreraService;

@Service
public class CarreraServiceImpl implements CarreraService{

	@Autowired
	private CarreraDao carreraDao;
	
	@Override
	public Carrera create(Carrera a) {
		// TODO Auto-generated method stub
		return carreraDao.create(a);
	}

	@Override
	public Carrera update(Carrera a) {
		// TODO Auto-generated method stub
		return carreraDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		carreraDao.delete(id);
	}

	@Override
	public Optional<Carrera> read(Long id) {
		// TODO Auto-generated method stub
		return carreraDao.read(id);
	}

	@Override
	public List<Carrera> readAll() {
		// TODO Auto-generated method stub
		return carreraDao.readAll();
	}
	

}
