(function () {
  'use strict';

  angular.module('SmallBIApp')
    .factory('Service', Service);

  function Service($http) {

    //var baseUrl = "http://backend.smallbi.com.br:18080/SmallBI_WebService/rest/";
    var baseUrl = "http://localhost:8080/SmallBI_WebService/rest/";

    var service = {
      serviceGet: serviceGet,
      servicePost: servicePost,
      serviceGetById: serviceGetById,
      serviceDelete: serviceDelete
    };
    return service;


    function serviceGet(url) {
      return $http.get(baseUrl + url);
    }

    function servicePost(dataParam, url) {
      return $http({
        url: baseUrl + url,
        method : "POST",
        data :  dataParam,
        headers: {'Content-Type': 'application/json'}
      });
    }

    function serviceGetById(param, url) {
      return $http.get(baseUrl + url + param);
    }

    function serviceDelete(param, url) {
      return $http.delete(baseUrl + url + param);
    }
  }
})();
