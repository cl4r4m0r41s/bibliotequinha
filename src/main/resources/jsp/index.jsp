<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
    <title>Biblium</title>

    <link href="#" rel="stylesheet">

    <link href="#" rel="stylesheet" type="text/css">

</head>
<body>
    <div id="wrapper">
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">
                 Biblioteca
                </a>
            </div>
            <ul class="nav navbar-right top-nav">
                
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-user"></i> John Smith <b class="caret"></b></a>
                    <ul class="dropdown-menu">
                        <li>
                            <a href="#"><i class="fa fa-fw fa-user"></i> Perfil </a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-envelope"></i> Notificações </a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-gear"></i> Configurações </a>
                        </li>
                        <li>
                            <a href="#"><i class="fa fa-fw fa-power-off"></i> Log Out </a>
                        </li>
                    </ul>
                </li>
            </ul>
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                        <a href="../console/"><i class="fa fa-fw fa-edit"></i> Consoles</a>
                    </li>
                    <li>
                        <a href="../joystick/"><i class="fa fa-fw fa-bar-chart-o"></i> Joysticks</a>
                    </li>
                    
                </ul>
            </div>
        </nav>

        <div class="row">
            <div class="col-lg-12">
                <h1 class="page-header">
                   Biblium
                    
                </h1>
                <ol class="breadcrumb">
                    <li>
                        <i class="fa fa-dashboard"></i>  <a href="index.jsp">Biblioteca</a>
                    </li>
                    <li class="active">
                        <i class="fa fa-file"></i>Biblioteca Virtual
                    </li>
                </ol>
            </div>
        </div>

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
<!-- /.row -->
<div class="row">
    <div class="panel panel-default">

        <div class="panel-body">

            <a  href="add.jsp" class="btn  btn-primary btn-sm fa fa-plus-square-o">Novo</a>
            
        </div>
    </div>
</div>
<div class="row">
    <div class="panel panel-default">
        <form action="Usuario.java" method="post">
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
</div>

</div>

</div>

<script src="../js/bootstrap.min.js"></script>

</body>

</html>