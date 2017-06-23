(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('assistenteController', assistenteController);

  function assistenteController($scope) {

    // var vm = this;

    $scope.myInterval = 3000;
    $scope.noWrapSlides = false;
    $scope.active = 0;
    $scope.slides = [
      {
        title: 'Esse assistente é dividido em duas partes: I - Coleta, II - Modelagem',
        text1: 'Coleta: Nesta primeira etapa lhe auxiliaremos a buscar as informações que serão analisadas, a busca pode ser realizada através de arquivos CSV (Arquivos Texto), arquivos XLSX (Microsoft Excel), tabelas de banco de dados ou consultas nestes mesmos bancos de dados.',
        text2: 'Modelagem: Está segunda etapa é subdivida em 3 fases: Nomeação do Cubo, Especificação das Dimensões, Especificação das Métricas.'
      },
      {
        title: 'Coleta de arquivos CSV ou XLSX',
        text1: '1 - Coletas de arquivos CSV ou XLSX: Quando realizada a coleta através de arquivos CSV é necessário selecionar o caractere que separa as colunas, o mais comum é separa-los por ";". Após selecionado o arquivo é necessário escolher o formato de cada coluna do seu arquivo, por exemplo: Caso a coluna A contenha informações do tipo numérico inteiro, deverá ser selecionado essa opção na caixa de seleção acima. Dentre as opções da caixa de seleção temos ainda (Inteiro, Real, V/F (Verdadeiro/Falso), Caractere (Apenas um caractere), Texto, Data (dd/MM/yyyy, dd-MM-yyyy, MM-dd-yyyy e yyyy-MM-dd) e Não Importar). Essa configuração é realizada na tabela de visualização dos dados, após terminado o ajuste é necessário fazer a validação dos tipos de dados escolhidos, clicando no botão correspondente e após isso clicar em salvar tabela, nomeando o nome da tabela e a chave que a ligará com as tabelas a serem importadas em seguida.',
      },
      {
        title: 'Coleta de arquivos CSV ou XLSX',
        image: 'images/logo.png'
      },
      {
        title: 'Coleta de bancos de dados',
        text1: '2 - Coleta de bancos de dados: Nesta opção pode ser realizada a coleta de um banco de dados, os aceitos são MySQL, PostgreSQL ou Microsoft SQL Server. Para fazer a coleta é necessário ter em mãos os dados para acesso ao banco que são: nome ou ip do servidor de banco de dados, nome do banco de dados, nome do usuário, senha e porta de conexão. Após o preenchimento dessas informações e no caso da conexão realizada, pode-se escolher entre buscar uma tabela ou executar uma consulta. Após utilizar qualquer uma desta opções você será levado a tela de visualização dos dados. Terminado a coleta é necessário fazer a validação dos tipos de dados escolhidos, clicando no botão correspondente e após isso clicar em salvar tabela, nomeando o nome da tabela e a chave que a ligará com as tabelas a serem importadas em seguida.',
      },
      {
        title: 'Coleta de bancos de dados',
        image: 'images/logo.png'
      },
      {
        title: 'Coleta - Visualização da importação',
        image: 'images/logo.png'
      },
      {
        title: 'Modelagem - Nomeação do Cubo',
        text1: '1 - Nomeação do Cubo: Aqui deve ser escolhido o nome que será dado ao cubo (coleção de informações que serão analisadas), e definição da Tabela Fato (Tabela que contém as métricas - dados quantitativos).'
      },
      {
        title: 'Modelagem - Nomeação do Cubo',
        image: 'images/logo.png'
      },
      {
        title: 'Modelagem - Especificação das Dimensões',
        text1: '2 - Especificação das Dimensões: As dimensões podem ser escolhidas para estarem nos eixos (X ou Y) conforme o cenário a ser analisado. As dimensões contêm dados qualitativos.'
      },
      {
        title: 'Modelagem - Especificação das Dimensões',
        image: 'images/logo.png'
      },
      {
        title: 'Modelagem - Especificação da Métricas',
        text1: '3 - Especificação da Métricas: São os valores que estarão da área do gráfico. As métricas contêm os dados quantitativos.'
      },
      {
        title: 'Modelagem - Especificação da Métricas',
        image: 'images/logo.png'
      },
      {
        title: 'Modelagem - Visualização da modelagem',
        image: 'images/logo.png'
      },

    ];

  }
})();
