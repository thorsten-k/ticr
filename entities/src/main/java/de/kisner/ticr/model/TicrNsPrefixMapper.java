package de.kisner.ticr.model;

import net.sf.exlp.xml.ns.NsPrefixMapperInterface;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

public class TicrNsPrefixMapper extends NamespacePrefixMapper implements NsPrefixMapperInterface
{
    public String getPreferredPrefix(String namespaceUri, String suggestion, boolean requirePrefix)
    {
    	if("http://ticr.kisner.de".equals(namespaceUri) ){return "ticr";}
    	
        return suggestion;
    }

    public String[] getPreDeclaredNamespaceUris()
    {
        return new String[0];
    }
}