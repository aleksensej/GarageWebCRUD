package com.alex.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alex.dao.LevelDao;
import com.alex.model.Level;
import com.alex.service.LevelService;
@Service
public class LevelServiceImpl implements LevelService {
	@Autowired
	private LevelDao levelDao;
	
	@Override
	public void add(Level level) {
		levelDao.add(level);

	}

	@Override
	public Level getLevel(int levelNumber) {
		return levelDao.getLevel(levelNumber);
	}

}
