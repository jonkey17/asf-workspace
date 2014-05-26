<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<div class="titleDiv"><s:text name="application.facturaTel.title"/></div>
		<h1><s:text name="label.facturaTel.subject1"/></h1>
		<br/>
		<table class="borderAll">
			<tr>
		        <th><s:text name="label.telefono"/></th>
		        <td><s:property value="linea.telefono"/></td>
		        <th><s:text name="label.promocion"/></th>
		        <td><s:property value="linea.promocion"/></td>
		    </tr>
		    <tr>
		        <th><s:text name="label.antiguedad"/></th>
		        <td><s:property value="linea.antiguedad"/></td>
		        <th><s:text name="label.tarifavoz"/></th>
		        <td><s:property value="linea.tarifaVoz"/></td>
		    </tr>
		    <tr>
		        <th><s:text name="label.activa"/></th>
		        <td><s:property value="linea.activa"/></td>
		        <th><s:text name="label.tarifaDatos"/></th>
		        <td><s:property value="linea.tarifaDatos"/></td>
		    </tr>
		</table>
		<h1><s:text name="label.facturaTel.subject2"/></h1>
		<br/>
		<table class="borderAll">
		    <tr>
		        <th><s:text name="label.facturaTel.ref"/></th>
		        <th><s:text name="label.facturaTel.fecha"/></th>
		        <th><s:text name="label.facturaTel.periodo"/></th>
		        <th><s:text name="label.facturaTel.importe"/></th>
		        <th><s:text name="label.facturaTel.telefono"/></th>
		    </tr>
		    <s:iterator value="listaFacturas" status="status">
		        <tr class="<s:if test="#status.even">even</s:if><s:else>odd</s:else>">
		            <td class="nowrap"><s:property value="idFactura"/></td>
		            <td class="nowrap"><s:property value="fecha"/></td>
		            <td class="nowrap"><s:property value="periodo"/></td>
		            <td class="nowrap"><s:property value="importe"/></td>
		            <td class="nowrap"><s:property value="telefono"/></td>
		        </tr>
		    </s:iterator>
		</table>
	</body>
</html>
