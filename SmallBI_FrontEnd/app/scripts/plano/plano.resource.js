(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('planoResource', planoResource);

  function planoResource(Service) {

    var service = {
      listaPlanos: listaPlanos,
	    inserePlano:inserePlano,
	    alteraPlano: alteraPlano,
      getPlanoById: getPlanoById,
	    deletePlano: deletePlano
    };

    return service;

    function listaPlanos() {
      var url = 'plano/listar';
      return Service.serviceGet(url);
    }

	function inserePlano(dataParam) {
      var url = 'plano/adicionar';
      return Service.servicePost(dataParam, url);
	}

	function alteraPlano(dataParam) {
		  var url = 'plano/alterar';
		  return Service.servicePost(dataParam, url);
	}

	function getPlanoById(param) {
      var url = 'plano/getById/';
      return Service.serviceGetById(param, url);
	}

	function deletePlano(param) {
      var url = 'plano/deletar/';
      return Service.serviceDelete(url + param);
	}
  }
})();
