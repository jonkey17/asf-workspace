<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<div class="titleDiv"><s:text name="application.facturaTel.title"/></div>
		<h1><s:text name="label.lineaTel.subject"/></h1>
		<s:url id="showLineas" action="editLineasTel.action">
			<s:param name="dni" value="%{dni}"/>
		</s:url>
		<s:form action="%{showLineas}" method="POST">
			<tr>
				<td colspan="2">
					<s:actionerror />
					<!--<s:fielderror />-->
				</td>
			</tr>
			<s:textfield name="linea.telefono" label="%{getText('label.telefono')}" value="%{linea.telefono}"/>
			<s:textfield name="linea.antiguedad" label="%{getText('label.antiguedad')}" value="%{linea.antiguedad}"/>
			<%--<s:combobox name="activa" label="%{getText('label.activa')}" list="{'true','false'}" headerKey="-1" headerValue="elige" value="%{linea.activa}"></s:combobox>--%>
			<s:select name="linea.activa" label="%{getText('label.activa')}" list="{'true','false'}" headerKey="-1" value="%{linea.activa}"/>
			<%-- <s:textfield name="activo" label="%{getText('label.activa')}" value="%{linea.activa}"/>--%>
			<s:textfield name="linea.promocion" label="%{getText('label.promocion')}" value="%{linea.promocion}"/>
			<s:textfield name="linea.tarifaVoz" label="%{getText('label.tarifaVoz')}" value="%{linea.tarifaVoz}"/>
			<s:textfield name="linea.tarifaDatos" label="%{getText('label.tarifaDatos')}" value="%{linea.tarifaDatos}"/>
			<%--<s:textfield name="linea.dni" label="%{getText('label.cliente')}" value="%{linea.dni}"/>--%>
			<s:select name="linea.dni" label="%{getText('label.cliente')}" list="clientes" listKey="dni" listValue="nombre" headerKey="-1" value="%{linea.dni}"/>
			<s:hidden name="telefono" value="%{telefono}"></s:hidden>
			<s:submit value="%{getText('label.modCliente.guardar')}" align="left" />
			<s:submit value="%{getText('label.modCliente.cancelar')}" align="left" />
		</s:form>
		
	</body>
</html>
