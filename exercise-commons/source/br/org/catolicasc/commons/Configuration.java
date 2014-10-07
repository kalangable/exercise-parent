package br.org.catolicasc.commons;

import lombok.val;
import lombok.extern.java.Log;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException.Missing;
import com.typesafe.config.ConfigFactory;

@Log
public class Configuration {

	static final String CONF_REFERENCE = "conf/reference";

	/**
	 * Load default configuration from CLASS_PATH.
	 * 
	 * @return
	 */
	public static Config loadConfiguration() {
		val defaultConfiguration = ConfigFactory.load( "conf/application" );
		return defaultConfiguration.withFallback( ConfigFactory.load( CONF_REFERENCE ) );
	}

	/**
	 * Load default configuration from CLASS_PATH. The {@code rootName} argument
	 * defines which is the root of specific configuration in your code.
	 * 
	 * @param rootName
	 * @return
	 */
	public static Config loadConfiguration( String rootName ) {
		val defaultConfiguration = loadConfiguration();
		return loadConfiguration( rootName, defaultConfiguration );
	}

	public static Config loadRefenceConfiguration() {
		String confDir = System.getProperty( "catalina.base" );
		String configuration = confDir + CONF_REFERENCE;
		val defaultConfiguration = ConfigFactory.load( configuration );
		log.info( "Reading cobol configuration file: " + defaultConfiguration );
		return defaultConfiguration.withFallback( loadConfiguration() );
	}

	public static Config loadRefenceConfiguration( String rootName ) {
		return loadConfiguration( rootName, loadRefenceConfiguration() );
	}

	public static Config loadConfiguration( String rootName, Config defaultConfiguration ) {
		try {
			val config = defaultConfiguration.getConfig( rootName );
			return config.withFallback( defaultConfiguration );
		} catch ( Missing cause ) {
			log.warning( "Missing configuration for " + rootName + ". Using default configuration." );
			return defaultConfiguration;
		}
	}
}