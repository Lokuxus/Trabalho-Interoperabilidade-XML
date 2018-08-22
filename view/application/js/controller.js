(function (){
    angular
        .module('app', [])
        .controller('XmlController'
        , ['$scope', '$http', function($scope, $http){

      var viewModel = this;

      
      $http.get('http://localhost:8079/curso').then(function(response) {
        viewModel.curso = response.data;
      }, function(err) {
        console.log("Deu Ruim", err);
      });            
    }]);


})();
    