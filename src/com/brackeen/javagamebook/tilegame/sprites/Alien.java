package com.brackeen.javagamebook.tilegame.sprites;

import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;

public class Alien extends Creature{

	public Alien(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);

		{

			if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
				if(CodeReflection.getAbstactionLevel()>=8)
				{//check to make sure it's this level of abstraction
					e.fillInStackTrace();		
					CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
							e.getStackTrace()[0].getMethodName());
				}
			}
			flying = true;
		}

	}

	public float getMaxSpeed() {
		if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
			if(CodeReflection.getAbstactionLevel()>=8)
			{//check to make sure it's this level of abstraction
				e.fillInStackTrace();		
				CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
						e.getStackTrace()[0].getMethodName());
			}
		}
		return 0.30f * enemySpeedMultiplier;
	}
	public boolean isFlying() {

		if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
			if(CodeReflection.getAbstactionLevel()>=8)
			{//check to make sure it's this level of abstraction
				e.fillInStackTrace();		
				CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
						e.getStackTrace()[0].getMethodName());
			}
		}
		return isAlive() && super.isFlying();
	}
}
