(function (){
    angular
        .module('app', [])
        .controller('XmlController'
        ,['$scope', '$http', function($scope, $http){

      var viewModel = this;
      viewModel.curso = {}

      viewModel.escolherDisciplina = escolherDisciplina;
      viewModel.disciplinaEscolhida = {};
      viewModel.editando = false;

      function escolherDisciplina(disciplina){
        viewModel.editando = true;
        viewModel.disciplinaEscolhida = disciplina;
      }
      
      $http.get('http://localhost:8079/curso').then(function(response) {
        viewModel.curso = response.data;
        console.log(viewModel.curso);
      }, function(err) {
        console.log("Deu Ruim", err);
      });  
      
      console.log("entrou", viewModel.curso);
    }]);



})();

