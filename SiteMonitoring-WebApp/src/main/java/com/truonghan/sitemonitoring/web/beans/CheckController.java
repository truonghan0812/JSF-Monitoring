package com.truonghan.sitemonitoring.web.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.omg.PortableInterceptor.ServerIdHelper;

import lombok.Getter;
import lombok.Setter;

import com.truonghan.sitemonitoring.backend.model.Check;
import com.truonghan.sitemonitoring.backend.services.CheckService;

@Getter
@Setter
// @Component(value="CheckController")
@ManagedBean
@ViewScoped
public class CheckController implements Serializable {

	private static final long serialVersionUID = 1L;

	// @Autowired
	@ManagedProperty("#{checkServiceImpl}")
	private CheckService service;

	private List<Check> checks;

	private Check check = new Check();

	@PostConstruct
	public void loadChecks() {
		checks = service.findAll();
	}

	public void Save() {
		service.save(check);
		check = new Check();
		loadChecks();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Save successful!", null));
	}
	public void remove(Check check){
		service.delete(check);
		loadChecks();
		FacesContext.getCurrentInstance().addMessage(
				null,
				new FacesMessage(FacesMessage.SEVERITY_INFO,
						"Removed successful!", null));
	}
	public void clear(){
		check = new Check();
	}

}
