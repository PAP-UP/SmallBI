(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('AuthService', AuthService);

  function AuthService($http, $q, $cookies, $cookieStore) {
    return {
      getToken : function (param) {
        if($cookieStore.get('success')) {
          var obj = {};
          obj.token = $cookieStore.get('TOKEN');
          obj.idPerfil = $cookieStore.get('idPerfil');
          obj.url = param;
          return $q(function (resolve, reject) {
            $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/authenticationVerify', obj).then(
            //$http.post('http://localhost:8080/SmallBI_WebService/rest/usuario/authenticationVerify', obj).then(
              function (result) {
                if(result.data.isValidToken && result.data.isValidAccess) {
                  resolve(result);
                }else {
                  reject(result);
                }
              }, function (response) {
                reject(response);
              });
          });
        }else {
          return false;
        }

      },
      // setToken: function (token) {
      //   $localStorage.token = token;
      // },
      signin: function (data) {
        return $q(function (resolve, reject) {
          $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login', data).then(
          //$http.post('http://localhost:8080/SmallBI_WebService/rest/usuario/login', data).then(
            function (result) {
              resolve(result);
              $cookieStore.put('idUsuario', result.data.idUsuario);
              $cookieStore.put('idCliente', result.data.idCliente);
              $cookieStore.put('TOKEN', result.data.token);
              $cookieStore.put('userName', result.data.nome);
              $cookieStore.put('success', result.data.success);
              $cookieStore.put('idPerfil', result.data.idPerfil);
            }, function (response) {
              reject(response);
            });
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
