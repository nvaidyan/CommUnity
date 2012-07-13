package org.wikipedia.en.fuzzycontrolsystem;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.wikipedia.en.fuzzycontrolsystem.domain.Brakes;
import org.wikipedia.en.fuzzycontrolsystem.domain.Car;
import org.wikipedia.en.fuzzycontrolsystem.sensors.BrakeTemperatureSensor;
import org.wikipedia.en.fuzzycontrolsystem.sensors.Speedometer;
import org.wikipedia.en.fuzzycontrolsystem.strategies.BrakeTemperatureReaderStrategy;
import org.wikipedia.en.fuzzycontrolsystem.strategies.DecreaseBrakePressureStrategy;
import org.wikipedia.en.fuzzycontrolsystem.strategies.HeatCheckStrategy;
import org.wikipedia.en.fuzzycontrolsystem.strategies.SpeedCheckStrategy;
import org.wikipedia.en.fuzzycontrolsystem.strategies.SpeedometerReaderStrategy;

import com.nicholasvaidyanathan.community.agents.Agent;
import com.nicholasvaidyanathan.community.agents.Analyst;
import com.nicholasvaidyanathan.community.agents.Planner;
import com.nicholasvaidyanathan.community.agents.Scout;
import com.nicholasvaidyanathan.community.strategies.Strategy;

public class BreaksTest {
	Brakes dems;
	Car batMobile;
	
	@Before
	public void setup(){
		// Given : The existence of a break control system with sensors that can check 
				// brake temperature, speed, and Autobots that can change the brake pressure
				BrakeTemperatureSensor sensor = new BrakeTemperatureSensor(75);
				dems = new Brakes(sensor);
				batMobile = new Car(dems, new Speedometer(100));
	}
	
	@Test
	public void testScoutCorrectlyRetrievesData(){
		int temp = retrieveReading(dems, new BrakeTemperatureReaderStrategy());
		assertEquals(75, temp);
	}

	private int retrieveReading(Object obj, Strategy strat) {
		Scout hermes = new Scout();
		int reading = (Integer) hermes.get(obj,strat);
		return reading;
	}
	
	@Test
	public void testAnalystCorrectlyAnalyzesData(){
		String heatResult = retrieveAnalysis(75, new HeatCheckStrategy());
		assertEquals("kinda warm", heatResult);
	}

	private String retrieveAnalysis(Object obj, Strategy strat) {
		Analyst iLikeIt = new Analyst();
		String heatResult = iLikeIt.analyze(obj, strat).toString();
		return heatResult;
	}
	
	@Test
	public void testPlannerPlansOnData(){
		executePlan("kinda warm", "not very fast", batMobile);
		assertEquals(0, batMobile.getBrakePressure());
	}

	private void executePlan(String heat, String speed, Object obj) {
		Planner brain = new BrakePressurePlanner(heat, speed);
		brain.act(obj, new DecreaseBrakePressureStrategy());
	}
	
	@Test
	public void testBrakesWhenConditionNotMet() {
		makeItSo();
		assertEquals(0, batMobile.getBrakePressure());
	}

	private void makeItSo() {
		int temp = retrieveReading(dems, new BrakeTemperatureReaderStrategy());
		int speed = retrieveReading(batMobile, new SpeedometerReaderStrategy());
		String heatResult = retrieveAnalysis(temp, new HeatCheckStrategy());
		String speedResult = retrieveAnalysis(speed, new SpeedCheckStrategy());
		executePlan(heatResult, speedResult, batMobile);
	}
	
	@Test
	public void testDecreaseBrakesPressureWhenConditionMet() {
		createChangeCondition();
		makeItSo();
		assertEquals(-5, batMobile.getBrakePressure());
	}

	private void createChangeCondition() {
		dems = new Brakes(new BrakeTemperatureSensor(85));
		batMobile = new Car(dems, new Speedometer(79));
	}
	
	@Test
	public void testVetoPlanner() {
		createChangeCondition();
		int temp = retrieveReading(dems, new BrakeTemperatureReaderStrategy());
		int speed = retrieveReading(batMobile, new SpeedometerReaderStrategy());
		String heatResult = retrieveAnalysis(temp, new HeatCheckStrategy());
		String speedResult = retrieveAnalysis(speed, new SpeedCheckStrategy());
		Agent brain = new BrakePressurePlanner(false, new Object[]{heatResult, speedResult});
		brain.act(batMobile, new DecreaseBrakePressureStrategy());
		assertEquals(-5, batMobile.getBrakePressure());
	}

}
