(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('AuthService', AuthService);

  function AuthService($http, $q, $cookies, $cookieStore) {
    return {
      getToken : function (url) {
        if($cookieStore.get('cookie')) {
          var obj = {};
          var param = $cookieStore.get('cookie');
          obj.token = param.token;
          obj.idPerfil = param.idPerfil;
          obj.url = url;
          return $q(function (resolve, reject) {
            $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/authenticationVerify', obj).then(
            //$http.post('http://localhost:8080/SmallBI_WebService/rest/usuario/authenticationVerify', obj).then(
              function (result) {
                if(result.data.isValidToken && result.data.isValidAccess) {
                  resolve();
                }else {
                  reject();
                }
              });
          });
        }else {
          return $q.reject();
        }
      },

      signin: function (data) {
        return $q(function (resolve, reject) {
          $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login', data).then(
          //$http.post('http://localhost:8080/SmallBI_WebService/rest/usuario/login', data).then(
            function (result) {
              if(result.data.success) {
                $cookieStore.put('cookie', result.data);
                resolve(result);
              }else {
                reject();
              }
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
