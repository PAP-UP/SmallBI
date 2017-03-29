(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('funcaoResource', funcaoResource);

  function funcaoResource(Service) {

    var service = {
      listaFuncoes: listaFuncoes,
	  insereFuncao:insereFuncao,
	  alteraFuncao: alteraFuncao,
	  getFuncaoById: getFuncaoById,
	  deleteFuncao: deleteFuncao
    };

    return service;

    function listaFuncoes() {
      var url = 'funcao/listar';
      return Service.serviceGet(url);
    }
	
	function insereFuncao(dataParam) {
      var url = 'funcao/adicionar';
      return Service.servicePost(dataParam, url);
	}

	function alteraFuncao(dataParam) {
		  var url = 'funcao/alterar';
		  return Service.servicePost(dataParam, url);
	}
	
	function getFuncaoById(param) {
      var url = 'funcao/getById/';
      return Service.serviceGetById(param, url);
	}
	
	function deleteFuncao(param) {
      var url = 'funcao/deletar/';
      return Service.serviceDelete(param, url);
	}
  }
})();
