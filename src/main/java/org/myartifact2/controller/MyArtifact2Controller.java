package org.myartifact2.controller;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

@Controller(value = "myArtifact2Controller")
@RequestMapping(value = "VIEW")
public class MyArtifact2Controller {
	@RenderMapping()
    public ModelAndView homePage(RenderRequest request, RenderResponse response) {
        ModelAndView ret = new ModelAndView("view");
        ret.addObject("mytitle", "MyArtifact2 Spring!!");
        return ret;
	}
}
