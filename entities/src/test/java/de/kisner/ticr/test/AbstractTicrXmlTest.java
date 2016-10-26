package de.kisner.ticr.test;

import org.jeesl.test.AbstractJeeslXmlTest;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.model.TicrNsPrefixMapper;
import net.sf.exlp.util.io.LoggerInit;
import net.sf.exlp.util.xml.JaxbUtil;

@Ignore
public class AbstractTicrXmlTest<T extends Object> extends AbstractJeeslXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractTicrXmlTest.class);

	public AbstractTicrXmlTest(Class<T> cXml,String xmlDirSuffix)
	{
		super(cXml,"ticr-entities.test/data/xml",xmlDirSuffix);		
	}
	
	@BeforeClass
    public static void initLogger()
	{
		LoggerInit loggerInit = new LoggerInit("log4junit.xml");	
		loggerInit.addAltPath("ticr-entities.test/config");
		loggerInit.init();
    }
	
	@BeforeClass
	public static void initPrefixMapper()
	{
		JaxbUtil.setNsPrefixMapper(new TicrNsPrefixMapper());
	}
}