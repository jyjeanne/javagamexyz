package com.opg.javagamexyz.artemis;

import com.artemis.Entity;
import com.artemis.World;
import com.badlogic.gdx.graphics.Color;
import com.opg.javagamexyz.artemis.components.Expires;
import com.opg.javagamexyz.artemis.components.Player;
import com.opg.javagamexyz.artemis.components.Position;
import com.opg.javagamexyz.artemis.components.Sprite;
import com.opg.javagamexyz.artemis.components.Sprite.Layer;
import com.opg.javagamexyz.artemis.components.Velocity;

public class EntityFactory {
	public static Entity createPlayer(World world, float x, float y) {
		Entity e = world.createEntity();
		
		Position position = new Position(x, y);
		e.addComponent(position);
		
		Sprite sprite = new Sprite("fighter", Layer.ACTORS_3);
		sprite.color = new Color(93/255f, 255/255f, 129/255f, 1.0f);
		e.addComponent(sprite);
		
		Velocity velocity = new Velocity();
		e.addComponent(velocity);
		
		Player player = new Player();
		e.addComponent(player);
		
		return e;
	}
	
	public static Entity createBullet(World world, float x, float y) {
		Entity e = world.createEntity();
		
		Position position = new Position(x, y);
		e.addComponent(position);
		
		Sprite sprite = new Sprite("bullet", Layer.PARTICLES);
		e.addComponent(sprite);
		
		Velocity velocity = new Velocity(0, 800);
		e.addComponent(velocity);
		
		Expires expires = new Expires(2.0f);
		e.addComponent(expires);
		
		return e;
	}
	
	public static Entity createEnemyShip(World world, String name, Layer layer, float x, float y, float vx, float vy) {
		Entity e = world.createEntity();
		
		Position position = new Position(x, y);
		e.addComponent(position);
		
		Sprite sprite = new Sprite(name, layer);
		sprite.color = new Color(255/255f, 0/255f, 142/255f, 1.0f);
		e.addComponent(sprite);
		
		Velocity velocity = new Velocity(vx, vy);
		e.addComponent(velocity);
		
		return e;
	}
}