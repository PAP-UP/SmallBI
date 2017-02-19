(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('pagamentoResource', pagamentoResource);

  function pagamentoResource(Service) {

    var service = {
      listaFormasPagamento: listaFormasPagamento,
      inserePagamento: inserePagamento,
      alteraPagamento: alteraPagamento,
      getPagamentoById: getPagamentoById,
      deletePagamento: deletePagamento
    };

    return service;

    function listaFormasPagamento() {
      var url = 'formaPagamento/listar';
      return Service.serviceGet(url);
    }

    function inserePagamento(dataParam) {
      var url = 'formaPagamento/adicionar';
      return Service.servicePost(dataParam, url);
    }

    function alteraPagamento(dataParam) {
      var url = 'formaPagamento/alterar';
      return Service.servicePost(dataParam, url);
    }

    function getPagamentoById(param) {
      var url = 'formaPagamento/getById/';
      return Service.serviceGetById(param, url);
    }

    function deletePagamento(param) {
      var url = 'formaPagamento/deletar/';
      return Service.serviceDelete(param, url);
    }

  }
})();
