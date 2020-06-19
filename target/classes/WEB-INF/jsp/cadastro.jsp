<% @include file="cabecalho.jsp" %>

<div>

    <h2>Cadastro de usuário</h2>

    <p>
    <!--Adiocionar aqui algo se necessário(dentro dessa div, não necessáriamente nesse parágrafo-->
    </p>

</div>

<hr><hr>

<div>

    <form action="#" method="post">

        <label for="name">Nome: </label>
        <input id="name" type="text">
        <br><br>

        <label for="nick">Nick: </label>
        <input id="nick" type="text">
        <br><br>

        <label for="mail">E-mail: </label>
        <input id="mail" type="text">
        <br><br>

        <label for="senha">Senha: </label>
        <input id="senha" type="text">
        <br><br>

        <button>Cadatrar</button>

    </form>

</div>

<% @include file="rodape.jsp" %>