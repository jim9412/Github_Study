<%@ tag body-content="empty" pageEncoding="UTF-8"%>
<%@ tag import = "java.time.format.DateTimeFormatter" %>
<%@ tag trimDirectiveWhitespaces="true" %>
<%@ tag attribute name = "value" required = "true" type ="java.time.temporal.TemporalAccessor" %>
<%@ tag attribute name = "pattern" type ="java.lang.String" %>
<% 
	if(pattern == null) pattern = "yyyy-MM-dd";  
%>
<%= DateTimeFormatter.ofPattern(pattern).format(value)  %>

