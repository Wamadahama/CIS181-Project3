package com.brackeen.javagamebook.tilegame.sprites;
import com.brackeen.javagamebook.codereflection.CodeReflection;
import com.brackeen.javagamebook.graphics.Animation;
import com.brackeen.javagamebook.util.RandomUtil;


public class SuperMonkey extends Monkey {
	private static final int MILI_PER_SECOND = 1050; 
	//TODO set a jump interval to only jump after a certain number of seconds
	// have elapsed.
	private long initJumpInterval = 3 * MILI_PER_SECOND; 
	private long jumpInterval = initJumpInterval;
	//    private Throwable e = new Throwable();

	public SuperMonkey(Animation left, Animation right, Animation deadLeft, Animation deadRight) {
		super(left, right, deadLeft, deadRight);
		if(CodeReflection.getAbstactionLevel()>=1)
		{//check to make sure it's this level of abstraction
			e.fillInStackTrace();		
			CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
					e.getStackTrace()[0].getMethodName());


			//TODO set the creatures jump speed using protected jumpSpeed class variable
			this.jumpSpeed = 0.80f;
			this.trackPlayer=true;
		}	
	}
	public float getMaxSpeed() {
		if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
			if(CodeReflection.getAbstactionLevel()>=5)
			{//check to make sure it's this level of abstraction
				e.fillInStackTrace();		
				CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
						e.getStackTrace()[0].getMethodName());
			}
		}
		return 0.25f * enemySpeedMultiplier;
	}
	public void update(long elapsedTime) {
		// Call super to maintain animation behavior
		super.update(elapsedTime);
		if(CodeReflection.isTracing() && SpritesPackageTracingEnabled.getSpritesPackageTracingEnabledInstance().isEnabled()) {
			if(CodeReflection.getAbstactionLevel()>=5)
			{//check to make sure it's this level of abstraction
				e.fillInStackTrace();		
				CodeReflection.registerMethod(e.getStackTrace()[0].getClassName(),
						e.getStackTrace()[0].getMethodName());
			}
			//See if its time for the super monkey to jump
			//Because time comes in at intervals we have to make sure that
			//we jump in whichever elapsedTime interval that the timer has gone off in.
			if((totalElapsedTime % jumpInterval)-elapsedTime<0){
				//Make the super monkey jump if he's not already in the air
				jump();
				jumpInterval = initJumpInterval + RandomUtil.getRandomInt(400);
			}
		}
	}
}
