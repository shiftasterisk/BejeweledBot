package GhoulCatchersBot;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Settings {
	public Properties settings = new Properties();
	public boolean debugMsg = false;
	public boolean saveScreenshots = false;
	public int gamesToPlay = 50;
	public int originXOffset = 0;
	public int originYOffset = 0;
	public int squareDimensionOffset = 0;
	public int replayButtonXOffset = 0;
	public int replayButtonYOffset = 0;
	public int replayClickXOffset = 0;
	public int replayClickYOffset = 0;
	public double slowestMoveSpeed = 1.5;
	public double fastestMoveSpeed = 3;
	
	public Settings() throws IOException {	
		InputStream configFile = null;
		try {
			configFile = new FileInputStream("config.properties");
		} catch (FileNotFoundException e) {
			System.out.println("FNF - Creating config file");
		}
		
		if(configFile == null) {
			savePropertiesFile();
		} else {
			settings.load(configFile);
			setValues();
		}
	}
	
	public void savePropertiesFile() throws IOException {
		settings.setProperty("debugMsg", new Boolean(debugMsg).toString());
		settings.setProperty("saveScreenshots", new Boolean(saveScreenshots).toString());
		settings.setProperty("gamesToPlay", Integer.toString(gamesToPlay));
		settings.setProperty("slowestMoveSpeed", Double.toString(slowestMoveSpeed));
		settings.setProperty("fastestMoveSpeed", Double.toString(fastestMoveSpeed));
		settings.setProperty("originXOffset", Integer.toString(originXOffset));
		settings.setProperty("originYOffset", Integer.toString(originYOffset));
		settings.setProperty("squareDimensionOffset", Integer.toString(squareDimensionOffset));
		settings.setProperty("replayButtonXOffset", Integer.toString(replayButtonXOffset));
		settings.setProperty("replayButtonYOffset", Integer.toString(replayButtonYOffset));
		settings.setProperty("replayClickXOffset", Integer.toString(replayClickXOffset));
		settings.setProperty("replayClickYOffset", Integer.toString(replayClickYOffset));
		
		OutputStream configFile = new FileOutputStream("config.properties");
		settings.store(configFile, "Ghoul Catchers Bot Config");
	}
	
	public void setValues() {
		debugMsg = Boolean.parseBoolean(settings.getProperty("debugMsg"));
		saveScreenshots = Boolean.parseBoolean(settings.getProperty("saveScreenshots"));
		gamesToPlay = Integer.parseInt(settings.getProperty("gamesToPlay"));
		slowestMoveSpeed = Double.parseDouble(settings.getProperty("slowestMoveSpeed"));
		fastestMoveSpeed = Double.parseDouble(settings.getProperty("fastestMoveSpeed"));
		originXOffset = Integer.parseInt(settings.getProperty("originXOffset"));
		originYOffset = Integer.parseInt(settings.getProperty("originYOffset"));
		squareDimensionOffset = Integer.parseInt(settings.getProperty("squareDimensionOffset"));
		replayButtonXOffset = Integer.parseInt(settings.getProperty("replayButtonXOffset"));
		replayButtonYOffset = Integer.parseInt(settings.getProperty("replayButtonYOffset"));
		replayClickXOffset = Integer.parseInt(settings.getProperty("replayClickXOffset"));
		replayClickYOffset = Integer.parseInt(settings.getProperty("replayClickYOffset"));
	}
}
