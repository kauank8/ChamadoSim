package view;

import javax.swing.JOptionPane;

import Objects.Clientes;
import br.com.kauanpaulino.filaObject.FilaObject;
import controller.FilaController;

public class main {

	public static void main(String[] args) {
		
		FilaObject fila = new FilaObject();
		FilaObject filaPrioritarios = new FilaObject();
		FilaController Fcontroller = new FilaController();
		int opc=0;
		
		while(opc!=9) {
			Clientes c = new Clientes();
			opc = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir senha fila\n2-Inserir senha fila prioritaria\n3-Chamar Atendimento\n9-Finalizar servicos"));
			switch(opc) {
			case 1: 
					c.senha=Integer.parseInt(JOptionPane.showInputDialog("Insira a senha"));
					c.Nome=(JOptionPane.showInputDialog("Insira o nome do cliente"));
					fila = Fcontroller.Inserirfila(fila,c);	
					break;
			case 2: 
					c.senha= Integer.parseInt(JOptionPane.showInputDialog("Insira a senha"));
					c.Nome=(JOptionPane.showInputDialog("Insira o nome do cliente"));
					filaPrioritarios=Fcontroller.Inserirfila(filaPrioritarios,c);
					break;
			case 3: Fcontroller.chamado(fila, filaPrioritarios);		
					break;
			case 9: JOptionPane.showMessageDialog(null,"Serviços finalizado");
					break;
			default: JOptionPane.showMessageDialog(null,"Opção invalida");	
					break;
					
			}
		}
	}

}
