(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('ramoResource', ramoResource);

  function ramoResource(Service) {

    var service = {
      listaRamos: listaRamos,
      insereRamo:insereRamo,
      alteraRamo: alteraRamo,
      getRamoById: getRamoById,
      deleteRamo: deleteRamo
    };

    return service;

    function listaRamos() {
      var url = 'ramoAtividade/listar';
      return Service.serviceGet(url);
    }

    function insereRamo(dataParam) {
      var url = 'ramoAtividade/adicionar';
      return Service.servicePost(dataParam, url);
    }

    function alteraRamo(dataParam) {
      var url = 'ramoAtividade/alterar';
      return Service.servicePost(dataParam, url);
    }

    function getRamoById(param) {
      var url = 'ramoAtividade/getById/';
      return Service.serviceGetById(param, url);
    }

    function deleteRamo(param) {
      var url = 'ramoAtividade/deletar/';
      return Service.serviceDelete(param, url);
    }
  }
})();
