import java.util.ArrayList;
import java.util.List;

class Pedido{
  
  int idPedido;
  Entregador entregador;
  String tipoEntregador;
  Produto produtos;
  List<Produto> produto = new ArrayList<Produto>();
  float calcularTotal;

 int valor;
  String Produto1;
  String Produto2;
  String Produto3;
  
    Pedido(int idPedido,String tipoEntregador,String Produto1,String Produto2,String Produto3,int valor){
      this.idPedido = idPedido;
      this.tipoEntregador = tipoEntregador;
      this.Produto1 = Produto1;
      this.Produto2 = Produto2;
      this.Produto3 = Produto3;
      this.valor = valor;
    }
  void exibirPedido(){

  };

  void calcularTotal(){

    
  }
  
}