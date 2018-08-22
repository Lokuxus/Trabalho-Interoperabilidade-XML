(function (){
    angular
        .module('app', [])
        .controller('XmlController'
        , ['$scope', '$http', function($scope, $http){

      var viewModel = this;
      var baseUrl = 'http://localhost:8079/curso'

      
      $http.get(baseUrl).then(function(response) {
        viewModel.curso = response.data;
      }, function(err) {
        console.log(err);
      });            
    }]);


})();
    