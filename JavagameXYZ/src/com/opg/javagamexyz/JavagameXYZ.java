package com.opg.javagamexyz;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.opg.javagamexyz.screens.GameMapTestingScreen;

public class JavagameXYZ extends Game {
	@Override
	public void create() {
		//setScreen(new SpaceshipWarriorGameScreen(this));
		//setScreen(new SpriteAnimationTestScreen(this));
		setScreen(new GameMapTestingScreen(this));
	}
	
	@Override
	public void render() {
		super.render();
		
		Gdx.graphics.setTitle(Constants.Game.TITLE + " - " + Gdx.graphics.getFramesPerSecond() + "fps");
	}
	
	public static class Constants {
		public static class Game {
			public static final int FRAME_WIDTH = 1300;
			public static final int FRAME_HEIGHT = 720;
			
			public static final String TITLE = "JavagameXYZ";
		}
		
		public static class Groups {
			public static final String PLAYER_BULLETS = "player bullets";
			public static final String ENEMY_SHIPS = "enemy ships";
		}
	}
}