package controllers;

import models.PlanoDeCurso;
import play.mvc.Controller;
import play.mvc.Result;

/*
 * INFORMATION EXPERT : A classe Application é uma classe também controladora só que 
 * esta é responsável apenas por prover os objetos "Result" para
 * o lado cliente;
 *
 *ALTA COESÃO/BAIXO ACOPLAMENTO : A classe Application e a classe 
 */
public class Application extends Controller{
	
	private static PlanoDeCurso planoDeCurso = new PlanoDeCurso();
	
	public static Result index(){
		return ok(views.html.index.render(planoDeCurso.getPeriodos()));
	}
}
