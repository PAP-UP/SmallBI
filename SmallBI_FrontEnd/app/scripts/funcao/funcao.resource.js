(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('funcaoResource', funcaoResource);

  function funcaoResource(Service) {

    var service = {
      listaFuncao: listaFuncao
    };

    return service;

    function listaFuncao() {
      var url = 'funcao/listar';
      return Service.serviceGet(url);
    }
  }
})();
