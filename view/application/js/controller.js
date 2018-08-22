(function (){
    angular
        .module('app', [])
        .controller('XmlController'
        , ['$scope', '$http', function($scope, $http){

      var viewModel = this;
      var baseUrl = 

      $http.get('http://localhost:8079/curso').
      then(function(response) {
        viewModel.greeting = response.data;
      });
      console.log(viewModel.greeting);       
    }]);


})();
    