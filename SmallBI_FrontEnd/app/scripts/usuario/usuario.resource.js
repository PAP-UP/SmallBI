(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('usuarioResource', usuarioResource);

  function usuarioResource($http) {

    var service = {
      listaUsuario: listaUsuario,
      insereUsuario: insereUsuario
    };

    return service;

    function listaUsuario() {
      return $http.get("http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/listar");
    }

    function insereUsuario(dataParam) {

   return $http({
        url: "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/adicionar",
        method : "POST",
        data :  dataParam,
        headers: {'Content-Type': 'application/json'}
      });
    }
  }
})();
