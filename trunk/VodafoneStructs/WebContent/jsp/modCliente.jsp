<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<s:form action="modCliente" method="POST">
			<div class="titleDiv"><s:text name="application.modCliente.title"/></div>
			<h1><s:text name="label.modCliente.subject"/></h1>
			<br>
			<table class="borderAll">
				<tr>
			        <th><s:text name="label.dni"/></th>
			        <td><s:textfield name="dni" label="%{getText('label.modCliente.dni')}"/></td>
			    </tr>
			    <tr>
			        <th><s:text name="label.nombre"/></th>
			        <td><s:textfield name="nombre" label="%{getText('label.modCliente.nombre')}"/></td>
			    </tr>
			    <tr>
			        <th><s:text name="label.direccion"/></th>
			        <td><s:textfield name="direccion" label="%{getText('label.modCliente.direccion')}"/></td>
			    </tr>
			    <tr>
			        <th><s:text name="label.email"/></th>
			        <td><s:textfield name="email" label="%{getText('label.modCliente.email')}"/></td>
			    </tr>
			</table>
			<br>
			<s:submit value="%{getText('label.modCliente.guardar')}" align="left"/>
			<s:submit value="%{getText('label.modCliente.cancelar')}" align="left"/>
		</s:form>
	</body>
</html>
