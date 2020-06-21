<% @include file="cabecalho.jsp" %>
<div>
<h2>Tela de login</h2>
</div>
<hr>
<hr>
<div>
    <form action="Customer.java" method="get">
        <label for="id">ID: </label>
        <input id="id" type="number" class="Credentials.userName">
        <br><br>
        <label for="password">Password: </label>
        <input id="password" type="password" class="Credentials.password">
        <br><br>
        <button>Login</button>
        <br>
    </form>
</div>
<% @include file="rodape.jsp" %>