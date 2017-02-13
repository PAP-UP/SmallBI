(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('planoResource', planoResource);

  function planoResource(Service) {

    var service = {
      listaPlanos: listaPlanos
    };

    return service;

    function listaPlanos() {
      var url = 'plano/listar';
      return Service.serviceGet(url);
    }
  }
})();
