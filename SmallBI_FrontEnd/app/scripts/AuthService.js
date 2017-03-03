(function () {
  'use strict';

angular.module('SmallBIApp')
  .factory('AuthService', AuthService);

function AuthService ($http, $localStorage, $q) {
  return {
    getToken : function () {
      return $localStorage.token;
    },
    setToken: function (token) {
      $localStorage.token = token;
    },
    signin : function (data) {
      $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login', data).then(
        function (result) {

      }, function () {

        });
    },
    signup : function (data) {
      $http.post('api/signup', data);
    },
    logout : function (data) {
      delete $localStorage.token;
      $q.when();
    }
  };
}
})();
