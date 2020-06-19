<% @include file="<!--Adicionar aqui o diretório cabeçalho-->" %>
<div>
<h2>Tela de login</h2>
</div>
<hr>
<hr>
<div>
    <form action="#" method="get">
        <label for="id">ID: </label>
        <input id="id" type="number" class="Credentials.id"> <!--precisa do credentials no id?-->
        <br><br>
        <label for="senha">Senha: </label>
        <input id="senha" type="password" class="Credentials.senha">
        <br><br>
        <button>Login</button>
        <br>
    </form>
</div>
<% @include file="<!--Adicionar aqui o diretório do rodapé-->" %>