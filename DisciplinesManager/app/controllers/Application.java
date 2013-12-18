package controllers;

import models.Disciplina;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

public class Application extends Controller{
	
	//private static Form<Disciplina> taskForm = Form.form(Disciplina.class);
	
	public static Result index(){
		return ok();
	}
}
