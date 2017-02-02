(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('funcaoResource', funcaoResource);

  function funcaoResource($http) {

    var service = {
      listaFuncao: listaFuncao
    };

    return service;

    function listaFuncao() {
      return $http.get("http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/funcao/listar");
    }

    // function insereUsuario(dataParam) {
    //   return $http({
    //     url: "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/adicionar",
    //     method : "POST",
    //     data :  dataParam,
    //     headers: {'Content-Type': 'application/json'}
    //   });
    // }
  }
})();
