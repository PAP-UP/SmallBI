(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('estadoResource', estadoResource);

  function estadoResource(Service) {

    var service = {
      listaEstado: listaEstado
    };

    return service;

    function listaEstado() {
      var url = 'estado/listar';
      return Service.serviceGet(url);
    }
  }
})();
