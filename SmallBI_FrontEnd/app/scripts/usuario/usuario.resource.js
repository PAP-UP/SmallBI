(function () {
	'use strict';

	angular.module('SmallBIApp')
		.factory('usuarioResource', usuarioResource);

	function usuarioResource(Service) {

		var service = {
			listaUsuario: listaUsuario,
			insereUsuario: insereUsuario,
      alteraUsuario: alteraUsuario,
			getUserById: getUserById,
      deleteUser: deleteUser
		};

		return service;

		function listaUsuario() {
			var url = 'usuario/listar';
			return Service.serviceGet(url);
		}

			function insereUsuario(dataParam) {
         var url = 'usuario/adicionar';
         return Service.servicePost(dataParam, url);
		}

    function alteraUsuario(dataParam) {
      var url = 'usuario/alterar';
      return Service.servicePost(dataParam, url);
    }

		function getUserById(param) {
		  var url = 'usuario/getById/';
			return Service.serviceGetById(param, url);
		}

    function deleteUser(param) {
      var url = 'usuario/deletar/';
      return Service.serviceDelete(param, url);
    }
	}
})();
