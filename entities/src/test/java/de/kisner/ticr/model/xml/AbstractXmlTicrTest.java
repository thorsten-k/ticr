package de.kisner.ticr.model.xml;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.test.AbstractTicrXmlTest;

public abstract class AbstractXmlTicrTest<T extends Object> extends AbstractTicrXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractXmlTicrTest.class);	
	
	public AbstractXmlTicrTest(Class<T> cXml)
	{
		super(cXml,"ticr");
	}
}