/**
 *  Caleb Ellis
 *  Mango.java
 *  The mango is a very healthy enemy with varying speed. Its also very large.
 *  */
package com.brackeen.javagamebook.tilegame.sprites;


import com.brackeen.javagamebook.graphics.Animation;
import com.brackeen.javagamebook.util.RandomUtil;
import com.brackeen.javagamebook.codereflection.*;

public class Mango extends Creature{

//    private Throwable e = new Throwable();
    private float mangoSpeed = 0.1f;
    private boolean speedUp = false;
    public Mango(Animation left, Animation right,
        Animation deadLeft, Animation deadRight)
    {
        super(left, right, deadLeft, deadRight);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=1)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
    	health = 5;
    }


    public float getMaxSpeed() {
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=2)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
        return  mangoSpeed * enemySpeedMultiplier;
    }
    
	public void update(long elapsedTime) {
		// Call super to maintain animation behavior
		super.update(elapsedTime);
    	if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
        	if(CodeReflection.getAbstactionLevel()>=4)
        	{//check to make sure it's this level of abstraction
        		e.fillInStackTrace();		
        		CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
        								e.getStackTrace()[0].getMethodName());
        	}
    	}
    	
    	if(speedUp) {
    		mangoSpeed += 0.5f;
    		speedUp = false;
    	}
    	else {
    		mangoSpeed = 0.1f;
    		speedUp = true;
    	}
    	
    	
	
	}
    
}

