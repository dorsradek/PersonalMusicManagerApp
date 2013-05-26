<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TechcubeTalk.com - Let's build apps from scratch series - Personal Music Manager Application</title>
</head>
<body>
<h2>:: TechcubeTalk.com - Personal Music Manager ::</h2>
<div style="margin-bottom: 25px;">
<s:form action="addAlbum" method="POST">
		<s:textfield label="Album Title" name="album.albumTitle"/>
		<s:textfield label="Music Genre" name="album.albumGenre"/>
		<s:textarea label="Artist Names" name="album.albumArtists" cols="40" rows="10"/>
		<s:textfield label="Total No of Tracks" name="album.noOfTracks"/>
		
		<s:submit value="Add Music Album" align="center"/>
</s:form>
</div>
<div>
	<table style="border: 1px dotted black;">
	<tr>
	    <th style="background-color:#ABDCFF;">Album Title</th>
	    <th style="background-color:#ABDCFF;">Music Genre</th>
	    <th style="background-color:#ABDCFF;">Artist Names</th>
	    <th style="background-color:#ABDCFF;">Total No of Tracks</th>
	    <th style="background-color:#ABDCFF;">Delete</th>
	</tr>
	<s:iterator value="albumList" var="album">
	    <tr>
	        <td><s:property value="albumTitle"/></td>
	        <td><s:property value="albumGenre"/></td>
	        <td><s:property value="albumArtists"/></td>
	        <td><s:property value="noOfTracks"/></td>
	        <td><a href="delAlbum.action?musicId=<s:property value="musicId"/>">delete</a></td>
	    </tr>
	</s:iterator>
	</table>
</div>
</body>
</html>