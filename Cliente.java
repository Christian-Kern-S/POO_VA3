import java.util.ArrayList;
import java.util.List;

class Cliente {
  
  private String nome;
  private List<Pedido> pedido = new ArrayList<Pedido>();

    Cliente(String nome) {
        this.nome = nome;
    }
  
  void relatorio() {
   
  }
  
  
  public float dinheiroGasto() {
    return 0;
  }

  
  
}