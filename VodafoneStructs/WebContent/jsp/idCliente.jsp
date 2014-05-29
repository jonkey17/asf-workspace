<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
	<head>
	    <link href="<s:url value='/css/main.css'/>" rel="stylesheet" type="text/css"/>
	    <title><s:text name="label.languagedesigner.subject"/></title>
	</head>
	<body>
		<s:form action="searchClient" method="POST" validate="true">
			<div class="titleDiv"><s:text name="application.idCliente.title"/></div>
			<h1><s:text name="label.idCliente.subject"/></h1>
			<br>
			<table class="borderAll">
				<tr>			      
			        <td><s:textfield name="dni" label="%{getText('label.dni')}" key="dni"/></td>
			        <th><s:submit value="%{getText('label.button')}" align="right"/></th>
			    </tr>
			</table>
			<br>
			<s:actionerror />
		</s:form>
	</body>
</html>
