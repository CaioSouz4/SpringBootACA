function carregaAno(){
	var ini = 1900;
	var fim = 2017;
	var options = "";
		for(var aux = ini ; aux <=fim; aux++){
  			options += "<option>"+ aux +"</option>";
		}
	document.getElementById("ano").innerHTML = options;
}
	
function carregaDia(){
	var dia = 1;
	var max = 31;
	var options = "";
		for(var aux=dia; aux<=max; aux++){
  			options += "<option>"+ aux +"</option>";
		}
	document.getElementById("dia").innerHTML = options;
}