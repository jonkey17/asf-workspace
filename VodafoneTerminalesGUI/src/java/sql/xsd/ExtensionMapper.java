/**
 * ExtensionMapper.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:34:40 IST)
 */

package java.sql.xsd;

/**
 * ExtensionMapper class
 */
@SuppressWarnings({ "unchecked", "unused" })
public class ExtensionMapper {

	public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
			java.lang.String typeName, javax.xml.stream.XMLStreamReader reader)
			throws java.lang.Exception {

		if ("http://sql.java/xsd".equals(namespaceURI)
				&& "SQLException".equals(typeName)) {

			return java.sql.xsd.SQLException.Factory.parse(reader);

		}

		if ("http://dto.dao.vodafone.pr/xsd".equals(namespaceURI)
				&& "Terminal".equals(typeName)) {

			return pr.vodafone.dao.dto.xsd.Terminal.Factory.parse(reader);

		}

		throw new org.apache.axis2.databinding.ADBException("Unsupported type "
				+ namespaceURI + " " + typeName);
	}

}
