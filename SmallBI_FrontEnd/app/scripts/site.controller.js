(function () {
  'use strict';

  angular.module('SmallBIApp')
    .controller('indexController', indexController);

  function indexController($state) {
    var vm = this;

    angular.extend(vm, {
      showModalEntrar: showModalEntrar
    })

    function showModalEntrar() {
      $('#modalLogin').modal('show');
    }
  }
})();
