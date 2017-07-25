package com.alex.dao;

import com.alex.model.Level;

public interface LevelDao {
	public void add(Level level);
	public Level getLevel (int levelNumber);
}
