package main;

import dao.ControllerProjetos;
import dao.ControllerInfoProjeto;
import dao.ControllerParticipantes;

public class StartApp {

	public static void main(String[] args) {
		
		ControllerProjetos projetos = new ControllerProjetos();
		ControllerParticipantes participantes= new ControllerParticipantes();
		ControllerInfoProjeto info = new ControllerInfoProjeto();
		
		projetos.createProjeto();
		participantes.createParticipante();
		info.createInfoProjeto();
		
		projetos.deleteProjeto();
		participantes.deleteParticipantes();
		info.deleteInfoProjeto();
		
		projetos.updateConta();
		participantes.updateParticipantes();
		info.updateInfoProjeto();
		
		projetos.findByIdConta();
		participantes.findByIdParticipantes();
		info.findByInfoProjeto();
				
		

	}
}
