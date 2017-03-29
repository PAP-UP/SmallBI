(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('cuboResource', cuboResource);

  function cuboResource($http) {

    var service = {
      listaCubo: listaCubo,
      insereCubo: insereCubo
    };

    return service;

    function listaCubo() {
      return $http.get("http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/cubo/listar");
    }

    function insereCubo(dataParam) {

      return $http({
        url: "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/cubo/adicionar",
        method : "POST",
        data :  dataParam,
        headers: {'Content-Type': 'application/json'}
      });
    }
  }
})();
