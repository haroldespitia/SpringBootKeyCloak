<#import "/spring.ftl" as spring>
<html>
	<h1>My Teams</h1>
	<ul>
		<#list teams as team>
			<li>${team}</li>
		</#list>
	</ul>
	<a href="/logout">LogOut</a>
</html>