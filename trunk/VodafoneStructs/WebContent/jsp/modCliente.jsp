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
	
	<s:form action="editModCliente.action" method="POST">
		<tr>
			<td colspan="2">
				<s:actionerror />
			</td>
		</tr>

		<s:textfield name="dniNoHidden"
			label="%{getText('label.modCliente.dni')}" value="%{cliente.dni}" disabled="true"/>
		<s:hidden name="dni" value="%{cliente.dni}"></s:hidden>			
		<s:textfield name="nombre"
			label="%{getText('label.modCliente.nombre')}" value="%{cliente.nombre}"/>
		<s:textfield name="direccion"
			label="%{getText('label.modCliente.direccion')}" value="%{cliente.direccion}"/>
		<s:textfield name="email"
			label="%{getText('label.modCliente.email')}" value="%{cliente.email}"/>
		<br>
		<s:submit type="button" value="%{getText('label.modCliente.guardar')}" />
		<s:submit type="button" value="%{getText('label.modCliente.cancelar')}" onclick="history.go(-1);return false;"/>
	</s:form>
</body>
</html>
