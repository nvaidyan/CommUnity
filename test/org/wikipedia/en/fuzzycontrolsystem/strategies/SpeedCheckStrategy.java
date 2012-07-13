package org.wikipedia.en.fuzzycontrolsystem.strategies;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class SpeedCheckStrategy implements Strategy {

	@Override
	public Object evaluate(Object obj) {
		String result = "";
		if(!(obj instanceof Integer)){
			return result;
		}
		int val = (Integer) obj;
		if(val < 60){
			result = "very slow";
		}
		else if(val < 70){
			result = "slow";
		}
		else if(val < 80){
			result = "not very fast";
		}
		else if(val < 90){
			result = "kinda fast";
		}
		else if(val < 100){
			result = "sorta fast";
		}
		else{
			result = "fast";
		}
		
		return result;
	}

}
