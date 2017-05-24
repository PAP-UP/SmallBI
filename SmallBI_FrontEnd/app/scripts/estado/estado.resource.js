(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('estadoResource', estadoResource);

  function estadoResource(Service) {

    var service = {
      listaEstado: listaEstado,
      getCidadeByIdEstado: getCidadeByIdEstado
    };

    return service;

    function listaEstado() {
      var url = 'estado/listar';
      return Service.serviceGet(url);
    }

    function getCidadeByIdEstado(obj) {
      var url = 'cidade/listarByIdEstado';
      return Service.servicePost(obj, url);
    }
  }
})();
