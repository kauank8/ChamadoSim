package controller;

import Objects.Clientes;
import br.com.kauanpaulino.filaObject.FilaObject;

public class FilaController {
	static int x=0;
	
	public FilaController() {
	}
	
	public FilaObject Inserirfila(FilaObject fila ,Object c) {
		fila.insert(c);
		return fila;
	}
	
	
	public void chamado(FilaObject fila, FilaObject filaPrioritaria) {
		boolean status = filaPrioritaria.isEmpty();
		int y=0;
		if(!status) {
			if(x<3) {
				try {
					Clientes c = (Clientes) filaPrioritaria.remove();
					System.out.println(c);
					
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				x++;
				}
			if(x==3) {
				try {
					Clientes c = (Clientes) fila.remove();
					System.out.println(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				x=0;
			}
		}
		else {
			boolean status2 = fila.isEmpty();
			if(!status2) {
				try {
					Clientes c = (Clientes) fila.remove();
					System.out.println(c);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else {
				System.out.println("Não há senhas a ser chamadas");
			}
		}
	
		
	}
	
}
