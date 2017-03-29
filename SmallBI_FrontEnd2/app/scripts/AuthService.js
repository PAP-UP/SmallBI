(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('AuthService', AuthService);

  function AuthService($http, $q, $cookies) {
    return {
      getToken : function () {
        // return $q(function (resolve, reject) {
        //   $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/checarToken', $cookies.token).then(
        //     function (result) {
        //       resolve(result);
        //     }, function (response) {
        //       reject(response);
        //     });
        // });
      },
      // setToken: function (token) {
      //   $localStorage.token = token;
      // },
      signin: function (data) {
        return $q(function (resolve, reject) {
          $http.post('http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/usuario/login', data).then(
            function (result) {
              resolve(result);
              $cookies = result.data;
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
