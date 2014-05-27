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
		<br/>
		<s:form action="doLogin" method="POST">
			<tr>
				<td colspan="2">
					<s:actionerror />
					<!--<s:fielderror />-->
				</td>
			</tr>
			<s:textfield name="telefono" label="%{getText('label.telefono')}" value="telefono"/>
			<s:textfield name="antiguedad" label="%{getText('label.antiguedad')}"/>
			<s:textfield name="activo" label="%{getText('label.activa')}"/>
			<s:textfield name="promocion" label="%{getText('label.promocion')}"/>
			<s:textfield name="tarifaVoz" label="%{getText('label.tarifaVoz')}"/>
			<s:textfield name="tarifaDatos" label="%{getText('label.tarifaDatos')}"/>
			<s:textfield name="cliente" label="%{getText('label.cliente')}"/>
			<s:submit value="%{getText('button.label.guardar')}" align="right"/>
			<s:submit value="%{getText('button.label.cancel')}" align="right"/>
		</s:form>
		
	</body>
</html>
