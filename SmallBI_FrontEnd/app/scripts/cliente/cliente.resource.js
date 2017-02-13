(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('clienteResource', clienteResource);

  function clienteResource(Service) {

    var service = {
      listaCliente: listaCliente,
      insereCliente: insereCliente
      // alteraUsuario: alteraUsuario,
      // getUserById: getUserById,
      // deleteUser: deleteUser
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
    //
    // function alteraUsuario(dataParam) {
    //   var url = 'usuario/alterar';
    //   return Service.servicePost(dataParam, url);
    // }
    //
    // function getUserById(param) {
    //   var url = 'usuario/getById/';
    //   return Service.serviceGetById(param, url);
    // }
    //
    // function deleteUser(param) {
    //   var url = 'usuario/deletar/';
    //   return Service.serviceDelete(param, url);
    // }
  }
})();
