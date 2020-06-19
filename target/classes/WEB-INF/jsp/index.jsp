<% @include file="cabecalho.jsp" %>

        <div id="page-wrapper">

            <div class="container-fluid">

<div class="row">
    <div class="col-lg-12">
        <h1 class="page-header">
            Gerenciamento de Livros

        </h1>
        <ol class="breadcrumb">
            <li>
                <i class="fa fa-dashboard"></i>  <a href="index.jsp">Listagem</a>
            </li>
            <li class="active">
                <i class="fa fa-file"></i>Listagem de livros
            </li>
        </ol>
    </div>
</div>

<div class="row">
    <div class="panel panel-default">

        <div class="panel-body">

            <a  href="novo.jsp" class="btn  btn-primary btn-sm fa fa-plus-square-o">Novo</a>
            
        </div>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <form action="#" method="post">
            <div class="form-group input-group">
                <input type="text" class="form-control" name="txtFiltro" placeholder="Digite...">
                                <span class="input-group-btn"><button class="btn btn-default" type="submit"><i class="fa fa-search"></i></button></span>
                            </div>
        </form>
        <div class="panel-body">
           
        
        <div class="table-responsive">
            <table class="table table-bordered table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Titulo</th>
                        <th>Editora</th>
                        <th>Autor</th>
                        <th>Avaliação</th>
                    </tr>
                </thead>
                <tbody>
                   
                    <tr>
                        <td>999999</td>
                        <td>XXXXXXXXXXX</td>
                        <td>XXXXXX</td>
                        <td>999,99</td>
                        <td><a href="upd.jsp?id=" class="btn  btn-primary btn-sm">Alterar</a>
                            <button class="btn  btn-danger btn-sm" data-toggle="modal" data-target="#myModal" onclick="removeElement();">Excluir</button>  
                        </td>
                    </tr>
                    
                </tbody>
            </table>

        </div>

        </div>
    </div>
        </div>
                
    <% @include file="rodape.jsp" %>