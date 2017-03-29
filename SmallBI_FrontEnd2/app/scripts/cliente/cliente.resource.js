(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('clienteResource', clienteResource);

  function clienteResource(Service) {

    var service = {
      listaCliente: listaCliente,
      insereCliente: insereCliente,
      alteraCliente: alteraCliente,
      getClienteById: getClienteById,
      deleteCliente: deleteCliente
    };

    return service;

    function listaCliente() {
      var url = 'cliente/listar';
      return Service.serviceGet(url);
    }

    function insereCliente(dataParam) {
      var url = 'cliente/adicionar';
      return Service.servicePost(dataParam, url);
    }

    function alteraCliente(dataParam) {
      var url = 'cliente/alterar';
      return Service.servicePost(dataParam, url);
    }

    function getClienteById(param) {
      var url = 'cliente/getById/';
      return Service.serviceGetById(param, url);
    }

    function deleteCliente(param) {
      var url = 'cliente/deletar/';
      return Service.serviceDelete(param, url);
    }
  }
})();
