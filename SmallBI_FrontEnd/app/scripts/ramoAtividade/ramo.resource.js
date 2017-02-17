(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('ramoResource', ramoResource);

  function ramoResource(Service) {

    var service = {
      listaRamos: listaRamos
    };

    return service;

    function listaRamos() {
      var url = 'ramoAtividade/listar';
      return Service.serviceGet(url);
    }
  }
})();
