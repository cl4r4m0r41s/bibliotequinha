<% @include file="<!--Adicionar aqui o diretório cabeçalho-->" %>
<div>
<h2>Cadastro de usu�rio</h2>
<p>
    <!--Adiocionar aqui algo se necessário(dentro dessa div, não necessáriamente nesse parágrafo-->
</p>
</div>
<hr>
<hr>
<div>
    <form action="AuthSession.java" method="post">
        <label for="name">Nome: </label>
        <input id="name" type="text">
        <br><br>
        <label for="email">E-mail: </label>
        <input id="email" type="text">
        <br><br>
        <label for="password">Password: </label>
        <input id="password" type="text">
        <br><br>
        <button>Cadastrar</button>
    </form>
</div>
<% @include file="<!--Adionar aqui o diretório do rodapé-->" %>