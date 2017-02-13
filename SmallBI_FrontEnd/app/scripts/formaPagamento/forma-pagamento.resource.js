(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('pagamentoResource', pagamentoResource);

  function pagamentoResource(Service) {

    var service = {
      listaFormasPagamento: listaFormasPagamento
    };

    return service;

    function listaFormasPagamento() {
      var url = 'formaPagamento/listar';
      return Service.serviceGet(url);
    }
  }
})();
