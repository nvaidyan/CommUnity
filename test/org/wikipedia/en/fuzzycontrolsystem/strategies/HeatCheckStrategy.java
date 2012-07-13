package org.wikipedia.en.fuzzycontrolsystem.strategies;

import com.nicholasvaidyanathan.community.strategies.Strategy;

public class HeatCheckStrategy implements Strategy {
	
	@Override
	public Object evaluate(Object obj) {
		String result = "";
		if(!(obj instanceof Integer)){
			return result;
		}
		int val = (Integer) obj;
		if(val < 60){
			result = "cold";
		}
		else if(val < 70){
			result = "not so cold";
		}
		else if(val < 80){
			result = "kinda warm";
		}
		else if(val < 90){
			result = "warm";
		}
		else if(val < 100){
			result = "hot";
		}
		else{
			result = "hatchi matchi";
		}
		
		return result;
	}

}
