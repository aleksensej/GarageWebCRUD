package com.alex.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alex.dao.LevelDao;
import com.alex.model.Level;

@Repository
public class LevelDaoImpl implements LevelDao {
	@Autowired
	private SessionFactory session;

	@Override
	public void add(Level level) {
		session.getCurrentSession().save(level);

	}

	@Override
	public Level getLevel(int levelNumber) {
		return (Level)session.getCurrentSession().get(Level.class, levelNumber);
	}

}
