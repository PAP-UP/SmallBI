(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('perfilResource', perfilResource);

  function perfilResource(Service) {

    var service = {
      listaPerfil: listaPerfil,
      inserePerfil: inserePerfil,
      alteraPerfil: alteraPerfil,
      getPerfilById: getPerfilById,
      deletePerfil: deletePerfil
    };

    return service;

    function listaPerfil() {
      var url = 'perfil/listar';
      return Service.serviceGet(url);
    }

    function inserePerfil(dataParam) {
      var url = 'perfil/adicionar';
      return Service.servicePost(dataParam, url);
    }

    function alteraPerfil(dataParam) {
      var url = 'perfil/alterar';
      return Service.servicePost(dataParam, url);
    }

    function getPerfilById(param) {
      var url = 'perfil/getById/';
      return Service.serviceGetById(param, url);
    }

    function deletePerfil(param) {
      var url = 'perfil/deletar/';
      return Service.serviceDelete(param, url);
    }
  }
})();
