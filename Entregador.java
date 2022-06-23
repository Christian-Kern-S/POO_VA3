abstract class Entregador{

  String nome;
  int idade;
  EntregadorDeBike entregadorDeBike;
  EntregadorDeMoto entregadorDeMoto;
  EntregadorDeDrone entregadorDeDrone;
  Loja loja;
  int tipoEntrega;

 void TempoDeEntrega(){
      
    if (tipoEntrega == 1){
      loja.distancia = loja.distancia * entregadorDeBike.multi;
      }
      if (tipoEntrega == 2){
      loja.distancia = loja.distancia * entregadorDeMoto.multi;
      }

      if (tipoEntrega == 3){
      loja.distancia = loja.distancia * entregadorDeDrone.multi;
      }
  };

  
}