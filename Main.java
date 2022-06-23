class Main {
  public static void main(String[] args) {
    Cliente cliente = new Cliente("Christian");
    
    Pedido pedido1 = new Pedido(1,"Entregador de Moto","Arroz","Feijão", "Macarrão", 31);

    Pedido pedido2 = new Pedido(1,"Entregador de Drone","Queijo","Faca", "Frnago", 91);

    Pedido pedido3 = new Pedido(1,"Entregador de Bike","Prato","manga", "Galinha", 44);


  System.out.println(cliente);  
  System.out.println(pedido1);
    System.out.println(pedido2);
    System.out.println(pedido3);
    
  
    
    
  }

  
}