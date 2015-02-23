package com.truonghan.sitemonitoring.web.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="controller")
public class Controller {

	public String index(){
		return "Hello world";
	}
}
