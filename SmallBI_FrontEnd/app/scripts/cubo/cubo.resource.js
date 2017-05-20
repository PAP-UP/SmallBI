(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('cuboResource', cuboResource);

  function cuboResource(Service) {

    var service = {
      listaCubo: listaCubo,
      analisarCubo: analisarCubo,
      listaCuboAll: listaCuboAll
    };

    return service;

    function listaCubo(param) {
      var url = 'cubo/listarByIdCliente';
      return Service.servicePost(param, url);
    }
    function analisarCubo(id) {
      var url = 'cubo/analisar';
      return Service.servicePost(id, url);
    }

    function listaCuboAll() {
      var url = 'cubo/listar';
      return Service.serviceGet(url);
    }
  }
})();
