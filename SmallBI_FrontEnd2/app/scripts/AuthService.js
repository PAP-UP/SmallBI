(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('AuthService', AuthService);

  function AuthService($http, $q, $cookies) {
    return {
      getToken : function () {
        return $cookies.token;
      },
      // setToken: function (token) {
      //   $localStorage.token = token;
      // },
      signin: function (data) {
        $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login', data).then(
          function (result) {
            $cookies = result;
            // $cookies.token = result.token;
            // $cookies.user_id = result.idUsuario;
            // $cookies.client_id = result.idCliente;
            console.log(result);
          }, function (resolve) {
            console.log(resolve);
          });
      },
      signup: function (data) {
        $http.post('api/signup', data);
      },
      logout: function (data) {
        delete $localStorage.token;
        $q.when();
      }
    };
  }
})();
