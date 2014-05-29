<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<link href="<s:url value='/css/main.css'/>" rel="stylesheet"
	type="text/css" />
<title><s:text name="label.languagedesigner.subject" /></title>
</head>
<body>
	<div class="titleDiv">
		<s:text name="application.idCliente.title" />
	</div>
	<h1>
		<s:text name="label.modCliente.subject" />
	</h1>
	<br>
	
	<s:url id="showLineas" action="editModCliente.action">
			<s:param name="dni" value="%{dni}"/>
	</s:url>
	<s:form action="%{showLineas}" method="POST">
		<tr>
			<td colspan="2"><s:actionerror /> <!--<s:fielderror />--></td>
		</tr>

		<s:textfield name="dni"
			label="%{getText('label.modCliente.dni')}" value="%{cliente.dni}" disabled="true"/>
		<s:textfield name="nombre"
			label="%{getText('label.modCliente.nombre')}" value="%{cliente.nombre}"/>
		<s:textfield name="direccion"
			label="%{getText('label.modCliente.direccion')}" value="%{cliente.direccion}"/>
		<s:textfield name="email"
			label="%{getText('label.modCliente.email')}" value="%{cliente.email}"/>
		<br>
		<s:submit value="%{getText('label.modCliente.guardar')}" align="left" />
		<s:submit value="%{getText('label.modCliente.cancelar')}" align="left" />
	</s:form>
</body>
</html>
