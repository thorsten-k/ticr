package de.kisner.ticr.test;

import net.sf.ahtutils.test.AbstractAhtUtilsXmlTest;
import net.sf.exlp.util.io.LoggerInit;
import net.sf.exlp.util.xml.JaxbUtil;

import org.junit.BeforeClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.kisner.ticr.model.TicrNsPrefixMapper;

public class AbstractTicrXmlTest<T extends Object> extends AbstractAhtUtilsXmlTest<T>
{
	final static Logger logger = LoggerFactory.getLogger(AbstractTicrXmlTest.class);

	public AbstractTicrXmlTest(){this(null,null);}
	public AbstractTicrXmlTest(Class<T> cXml,String xmlDirSuffix)
	{
		super(cXml,xmlDirSuffix);
	}
	
	@BeforeClass
    public static void initLogger()
	{
		LoggerInit loggerInit = new LoggerInit("log4junit.xml");	
		loggerInit.addAltPath("ticr-entites.test/config");
		loggerInit.init();
    }
	
	@BeforeClass
	public static void initPrefixMapper()
	{
		JaxbUtil.setNsPrefixMapper(new TicrNsPrefixMapper());
	}
}