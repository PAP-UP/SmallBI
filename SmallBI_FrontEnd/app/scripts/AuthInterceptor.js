// (function () {
//   'use strict';
//
// angular.module('SmallBIApp')
//   .factory('AuthInterceptor', AuthInterceptor)
//   .config(function($httpProvider) {
//     $httpProvider.interceptors.push('AuthInterceptor');
//   });
//
// function AuthInterceptor ($location, AuthService, $q) {
//   return {
//     request: function(config) {
//       config.headers = config.headers || {};
//
//       if (AuthService.getToken()) {
//         config.headers['Authorization'] = 'Bearer ' + AuthService.getToken();
//       }
//
//       return config;
//     },
//
//     responseError: function(response) {
//       if (response.status === 401 || response.status === 403) {
//         $location.path('/signin');
//       }
//
//       return $q.reject(response);
//     }
//   }
// }
// })();
