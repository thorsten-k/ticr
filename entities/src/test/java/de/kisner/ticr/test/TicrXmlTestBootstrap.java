package de.kisner.ticr.test;

import net.sf.exlp.util.io.LoggerInit;
import net.sf.exlp.util.xml.JaxbUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.model.TicrNsPrefixMapper;

public class TicrXmlTestBootstrap
{
	final static Logger logger = LoggerFactory.getLogger(TicrXmlTestBootstrap.class);
		
	public static void init()
	{
		LoggerInit loggerInit = new LoggerInit("log4j.xml");	
		loggerInit.addAltPath("config.ticr-xml.test");
		loggerInit.init();
		JaxbUtil.setNsPrefixMapper(new TicrNsPrefixMapper());
	}
}