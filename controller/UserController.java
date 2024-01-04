package com.sas.controller;

import java.util.List;

import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sas.service.EvangelismsService;
import com.sas.service.CalctdsuiService;
import com.sas.service.CalctService;
import com.sas.model.Calctb;
import com.sas.model.Calctd;
import com.sas.service.CalctbService;
import com.sas.service.CalctdService;
import com.sas.model.Calct;
import com.sas.model.Calctdsui;
import com.sas.model.Evangelisms;


@Controller	
public class UserController {

	

EvangelismsService evangelismsService;
CalctdsuiService calctdsuiService;
CalctService calctService;
CalctbService calctbService;
CalctdService calctdService;


public UserController(EvangelismsService evangelismsService, CalctService calctService,
		CalctdsuiService calctdsuiService, CalctbService calctbService, CalctdService calctdService) {
	this.evangelismsService = evangelismsService;
	this.calctdsuiService = calctdsuiService;
	this.calctService = calctService;
	this.calctService = calctService;
	this.calctbService = calctbService;
}

	
	

	
	 @RequestMapping(value = {"/dashboard2"}, method = RequestMethod.GET)
	    public String homePagepostasks(Model model, 
	 	   		 @Param("keyword") String keyword) {
	 	   	 List<Evangelisms> listEvangelismss = evangelismsService.getAllEvangelismss(keyword);
	 	   	 model.addAttribute("listEvangelismss", listEvangelismss);
	 	   	 model.addAttribute("keyword", keyword);
	 	   	model.addAttribute("evangelismss",evangelismsService.getAll());
	        return "user/dashboard";
	    }

	 
	 
	  @RequestMapping(value = {"/dashboard"}, method = RequestMethod.GET)
	    public String Home(){
	        return "user/dashboard";
	    }
	     
	  
	  
	  
	  
	  
	  
	  
	  
	  


@RequestMapping(value = {"/quad"}, method = RequestMethod.GET)
public String quad(){
return "user/quad/quad";
}

		          
								          
								          
								          
								          
								          
								          



@RequestMapping(value = {"/indili"}, method = RequestMethod.GET)
public String indi(){
return "user/indi/indi";
}


@RequestMapping(value = {"/indi"}, method = RequestMethod.GET)
public String inditasks(Model model, 
@Param("keyword") String keyword) {
List<Calctdsui> listCalctdsuis = calctdsuiService.getAllCalctdsuis(keyword);
model.addAttribute("listCalctdsuis", listCalctdsuis);
model.addAttribute("keyword", keyword);
model.addAttribute("calctdsuis",calctdsuiService.getAll());
return "user/indi/simp";
}




@RequestMapping(value = {"/indi/new"}, method = RequestMethod.GET)
public String indicreatetaskForm(Model model) {
Calctdsui calctdsui = new Calctdsui();
model.addAttribute("calctdsui",calctdsui);
return "user/indi/create_simp";
}



@RequestMapping(value = {"/indi"}, method = RequestMethod.POST)
public String indisavetask(@ModelAttribute("calctdsui") Calctdsui calctdsui) {
calctdsuiService.saveCalctdsui(calctdsui);
return "redirect:/indi?keyword=TypeYourUserID";
}


@RequestMapping(value = {"/indi/edit/{id}"}, method = RequestMethod.GET)
public String indiedittaskForm(@PathVariable Long id, Model model) {
model.addAttribute("calctdsui", calctdsuiService.getCalctdsuiById(id));
return "user/indi/edit_simp";
}


@RequestMapping(value = {"/indi/{id}"}, method = RequestMethod.POST)
public String indiupdatetask(@PathVariable Long id, 
@ModelAttribute("calctdsui") Calctdsui calctdsui,
Model model) {
//get RESULT from database by id
Calctdsui existingCalctdsui = calctdsuiService.getCalctdsuiById(id);
existingCalctdsui.setId(id);
existingCalctdsui.setRollNo(calctdsui.getRollNo());
existingCalctdsui.setS1(calctdsui.getS1());
existingCalctdsui.setS2(calctdsui.getS2());
existingCalctdsui.setS3(calctdsui.getS3());
existingCalctdsui.setS4(calctdsui.getS4());
existingCalctdsui.setS5(calctdsui.getS5());
existingCalctdsui.setS6(calctdsui.getS6());
existingCalctdsui.setS7(calctdsui.getS7());
existingCalctdsui.setS8(calctdsui.getS8());
existingCalctdsui.setS9(calctdsui.getS9());
existingCalctdsui.setS10(calctdsui.getS10());
existingCalctdsui.setS11(calctdsui.getS11());
existingCalctdsui.setS12(calctdsui.getS12());
existingCalctdsui.setS13(calctdsui.getS13());
existingCalctdsui.setS14(calctdsui.getS14());
existingCalctdsui.setS15(calctdsui.getS15());
existingCalctdsui.setS16(calctdsui.getS16());
existingCalctdsui.setS17(calctdsui.getS17());
existingCalctdsui.setS18(calctdsui.getS18());
existingCalctdsui.setS19(calctdsui.getS19());
existingCalctdsui.setS20(calctdsui.getS20());
existingCalctdsui.setS21(calctdsui.getS21());
existingCalctdsui.setS22(calctdsui.getS22());
existingCalctdsui.setS23(calctdsui.getS23());
existingCalctdsui.setS24(calctdsui.getS24());
existingCalctdsui.setS25(calctdsui.getS25());
existingCalctdsui.setS26(calctdsui.getS26());
existingCalctdsui.setS27(calctdsui.getS27());
existingCalctdsui.setS28(calctdsui.getS28());
existingCalctdsui.setS29(calctdsui.getS29());
existingCalctdsui.setS30(calctdsui.getS30());
existingCalctdsui.setS31(calctdsui.getS31());
existingCalctdsui.setS32(calctdsui.getS32());
existingCalctdsui.setS33(calctdsui.getS33());
existingCalctdsui.setS34(calctdsui.getS34());
existingCalctdsui.setS35(calctdsui.getS35());






//save updated Calctdsu object 
calctdsuiService.updateCalctdsui(existingCalctdsui);
return "redirect:/indi";
}

//handler method to handle delete calc request

@RequestMapping(value = {"/indi/{id}"}, method = RequestMethod.GET)
public String inditask(@PathVariable Long id) {
calctdsuiService.deleteCalctdsuiById(id);
return "redirect:/indi";
}














@RequestMapping(value = {"/indiri"}, method = RequestMethod.GET)
public String riinditasks(Model model, 
@Param("keyword") String keyword) {
List<Calctdsui> listCalctdsuis = calctdsuiService.getAllCalctdsuis(keyword);
model.addAttribute("listCalctdsuis", listCalctdsuis);
model.addAttribute("keyword", keyword);
model.addAttribute("calctdsuis",calctdsuiService.getAll());
return "user/indi/simpri";
}




@RequestMapping(value = {"/indiri/new"}, method = RequestMethod.GET)
public String riindicreatetaskForm(Model model) {
Calctdsui calctdsui = new Calctdsui();
model.addAttribute("calctdsui",calctdsui);
return "user/indi/create_simpri";
}



@RequestMapping(value = {"/indiri"}, method = RequestMethod.POST)
public String riindisavetask(@ModelAttribute("calctdsui") Calctdsui calctdsui) {
calctdsuiService.saveCalctdsui(calctdsui);
return "redirect:/indiri?keyword=TypeYourUserID";
}




@RequestMapping(value = {"/indiri/{id}"}, method = RequestMethod.GET)
public String riinditask(@PathVariable Long id) {
calctdsuiService.deleteCalctdsuiById(id);
return "redirect:/indiri";
}

   
   
   
   







@RequestMapping(value = {"/adindi"}, method = RequestMethod.GET)
public String adinditasks(Model model, 
@Param("keyword") String keyword) {
List<Calctdsui> listCalctdsuis = calctdsuiService.getAllCalctdsuis(keyword);
model.addAttribute("listCalctdsuis", listCalctdsuis);
model.addAttribute("keyword", keyword);
model.addAttribute("calctdsuis",calctdsuiService.getAll());
return "user/indi/simpad";
}




@RequestMapping(value = {"/adindi/new"}, method = RequestMethod.GET)
public String adindicreatetaskForm(Model model) {
Calctdsui calctdsui = new Calctdsui();
model.addAttribute("calctdsui",calctdsui);
return "user/indi/create_simpad";
}



@RequestMapping(value = {"/adindi"}, method = RequestMethod.POST)
public String adindisavetask(@ModelAttribute("calctdsui") Calctdsui calctdsui) {
calctdsuiService.saveCalctdsui(calctdsui);
return "redirect:/adindi?keyword=TypeYourUserID";
}




@RequestMapping(value = {"/adindi/{id}"}, method = RequestMethod.GET)
public String adinditask(@PathVariable Long id) {
calctdsuiService.deleteCalctdsuiById(id);
return "redirect:/adindi";
}

   
   









@RequestMapping(value = {"/adindiri"}, method = RequestMethod.GET)
public String riadinditasks(Model model, 
@Param("keyword") String keyword) {
List<Calctdsui> listCalctdsuis = calctdsuiService.getAllCalctdsuis(keyword);
model.addAttribute("listCalctdsuis", listCalctdsuis);
model.addAttribute("keyword", keyword);
model.addAttribute("calctdsuis",calctdsuiService.getAll());
return "user/indi/simpadri";
}




@RequestMapping(value = {"/adindiri/new"}, method = RequestMethod.GET)
public String riadindicreatetaskForm(Model model) {
Calctdsui calctdsui = new Calctdsui();
model.addAttribute("calctdsui",calctdsui);
return "user/indi/create_simpadri";
}



@RequestMapping(value = {"/adindiri"}, method = RequestMethod.POST)
public String riadindisavetask(@ModelAttribute("calctdsui") Calctdsui calctdsui) {
calctdsuiService.saveCalctdsui(calctdsui);
return "redirect:/adindiri?keyword=TypeYourUserID";
}




@RequestMapping(value = {"/adindiri/{id}"}, method = RequestMethod.GET)
public String riadinditask(@PathVariable Long id) {
calctdsuiService.deleteCalctdsuiById(id);
return "redirect:/adindiri";
}

   
   
   
   








@RequestMapping(value = {"/adindibb"}, method = RequestMethod.GET)
public String bbadinditasks(Model model, 
@Param("keyword") String keyword) {
List<Calctdsui> listCalctdsuis = calctdsuiService.getAllCalctdsuis(keyword);
model.addAttribute("listCalctdsuis", listCalctdsuis);
model.addAttribute("keyword", keyword);
model.addAttribute("calctdsuis",calctdsuiService.getAll());
return "user/indi/simpadbb";
}




@RequestMapping(value = {"/adindibb/new"}, method = RequestMethod.GET)
public String bbadindicreatetaskForm(Model model) {
Calctdsui calctdsui = new Calctdsui();
model.addAttribute("calctdsui",calctdsui);
return "user/indi/create_simpadbb";
}




@RequestMapping(value = {"/adindibb"}, method = RequestMethod.POST)
public String bbadindisavetask(@ModelAttribute("calctdsui") Calctdsui calctdsui) {
calctdsuiService.saveCalctdsui(calctdsui);
return "redirect:/adindibb?keyword=TypeYourUserID";
}




@RequestMapping(value = {"/adindibb/{id}"}, method = RequestMethod.GET)
public String bbadinditask(@PathVariable Long id) {
calctdsuiService.deleteCalctdsuiById(id);
return "redirect:/adindibb";
}

   
   















@RequestMapping(value = {"/calctrig"}, method = RequestMethod.GET)
public String trig(){
   return "user/trig/trig";
}


@RequestMapping(value = {"/calct"}, method = RequestMethod.GET)
	public String calcttasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calct";
   }




   @RequestMapping(value = {"/calct/new"}, method = RequestMethod.GET)
   public String calctcreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calct";
   }
   
   

   @RequestMapping(value = {"/calct"}, method = RequestMethod.POST)
   public String calctsavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calct?keyword=TypeYourUserID";
	 }
   

   @RequestMapping(value = {"/calct/edit/{id}"}, method = RequestMethod.GET)
   public String calctedittaskForm(@PathVariable Long id, Model model) {
		 model.addAttribute("calct", calctService.getCalctById(id));
		 return "user/trig/edit_calct";
		 }


   @RequestMapping(value = {"/calct/{id}"}, method = RequestMethod.POST)
   public String calctupdatetask(@PathVariable Long id, 
		 	@ModelAttribute("calct") Calct calct,
		 	Model model) {
//get RESULT from database by id
 	  Calct existingCalct = calctService.getCalctById(id);
existingCalct.setId(id);
existingCalct.setRollNo(calct.getRollNo());
existingCalct.setS1(calct.getS1());
existingCalct.setS2(calct.getS2());
existingCalct.setS3(calct.getS3());
existingCalct.setS4(calct.getS4());
existingCalct.setS5(calct.getS5());
existingCalct.setS6(calct.getS6());
existingCalct.setS7(calct.getS7());
existingCalct.setS8(calct.getS8());
existingCalct.setS9(calct.getS9());
existingCalct.setS10(calct.getS10());
existingCalct.setS11(calct.getS11());
existingCalct.setS12(calct.getS12());
existingCalct.setS13(calct.getS13());
existingCalct.setS14(calct.getS14());
existingCalct.setS15(calct.getS15());
existingCalct.setS16(calct.getS16());
existingCalct.setS17(calct.getS17());
existingCalct.setS18(calct.getS18());
existingCalct.setS19(calct.getS19());
existingCalct.setS20(calct.getS20());
existingCalct.setS21(calct.getS21());
existingCalct.setS22(calct.getS22());
existingCalct.setS23(calct.getS23());
existingCalct.setS24(calct.getS24());
existingCalct.setS25(calct.getS25());
existingCalct.setS26(calct.getS26());
existingCalct.setS27(calct.getS27());
existingCalct.setS28(calct.getS28());
existingCalct.setS29(calct.getS29());
existingCalct.setS30(calct.getS30());
existingCalct.setS31(calct.getS31());
existingCalct.setS32(calct.getS32());
existingCalct.setS33(calct.getS33());
existingCalct.setS34(calct.getS34());
existingCalct.setS35(calct.getS35());
existingCalct.setS36(calct.getS36());
existingCalct.setS37(calct.getS37());
existingCalct.setS38(calct.getS38());
existingCalct.setS39(calct.getS39());
existingCalct.setS40(calct.getS40());
existingCalct.setS41(calct.getS41());
existingCalct.setS42(calct.getS42());
existingCalct.setS43(calct.getS43());
existingCalct.setS44(calct.getS44());
existingCalct.setS45(calct.getS45());
existingCalct.setS46(calct.getS46());
existingCalct.setS47(calct.getS47());
existingCalct.setS48(calct.getS48());
existingCalct.setS49(calct.getS49());
existingCalct.setS50(calct.getS50());




//save updated Calct object 
calctService.updateCalct(existingCalct);
   return "redirect:/calct";
   }

   //handler method to handle delete calc request

   @RequestMapping(value = {"/calct/{id}"}, method = RequestMethod.GET)
   public String calcttask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calct";
   }
   
   
   
   @RequestMapping(value = {"/calcted"}, method = RequestMethod.GET)
	public String calctedtasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calcted";
   }
   
   
   @RequestMapping(value = {"/calcted/new"}, method = RequestMethod.GET)
   public String calctedcreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calcted";
   }
   
   @RequestMapping(value = {"/calcted"}, method = RequestMethod.POST)
   public String calctedsavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calcted?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calcted/{id}"}, method = RequestMethod.GET)
   public String calctedtask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calcted";
   }
   
   
   
   
   @RequestMapping(value = {"/calctede"}, method = RequestMethod.GET)
	public String calctedetasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctede";
   }
   
   
   @RequestMapping(value = {"/calctede/new"}, method = RequestMethod.GET)
   public String calctedecreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctede";
   }
   
   @RequestMapping(value = {"/calctede"}, method = RequestMethod.POST)
   public String calctedesavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctede?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctede/{id}"}, method = RequestMethod.GET)
   public String calctedetask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctede";
   }
   
   
   
   @RequestMapping(value = {"/calcthe"}, method = RequestMethod.GET)
	public String calcthetasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calcthe";
   }
   
   
   @RequestMapping(value = {"/calcthe/new"}, method = RequestMethod.GET)
   public String calcthecreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calcthe";
   }
   
   @RequestMapping(value = {"/calcthe"}, method = RequestMethod.POST)
   public String calcthesavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calcthe?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calcthe/{id}"}, method = RequestMethod.GET)
   public String calcthetask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calcthe";
   }
   
   
   
   
   
   @RequestMapping(value = {"/calctad"}, method = RequestMethod.GET)
	public String calctadtasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctad";
   }
   
   
   @RequestMapping(value = {"/calctad/new"}, method = RequestMethod.GET)
   public String calctadcreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctad";
   }
   
   @RequestMapping(value = {"/calctad"}, method = RequestMethod.POST)
   public String calctadsavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctad?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctad/{id}"}, method = RequestMethod.GET)
   public String calctadtask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctad";
   }
   
   
   

   
   @RequestMapping(value = {"/calctedhy"}, method = RequestMethod.GET)
	public String calctedhytasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctedhy";
   }
   
   
   @RequestMapping(value = {"/calctedhy/new"}, method = RequestMethod.GET)
   public String calctedhycreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctedhy";
   }
   
   @RequestMapping(value = {"/calctedhy"}, method = RequestMethod.POST)
   public String calctedhysavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctedhy?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctedhy/{id}"}, method = RequestMethod.GET)
   public String calctedhytask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctedhy";
   }
   
   
   
   
   
   
   
   @RequestMapping(value = {"/calctsi"}, method = RequestMethod.GET)
	public String calctsitasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctsi";
   }
   
   
   @RequestMapping(value = {"/calctsi/new"}, method = RequestMethod.GET)
   public String calctsicreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctsi";
   }
   
   @RequestMapping(value = {"/calctsi"}, method = RequestMethod.POST)
   public String calctsisavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctsi?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctsi/{id}"}, method = RequestMethod.GET)
   public String calctsitask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctsi";
   }
   
   
   
   
   
   
   
  
   
   
   @RequestMapping(value = {"/calctsia"}, method = RequestMethod.GET)
	public String calctsiatasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctsia";
   }
   
   
   @RequestMapping(value = {"/calctsia/new"}, method = RequestMethod.GET)
   public String calctsiacreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctsia";
   }
   
   @RequestMapping(value = {"/calctsia"}, method = RequestMethod.POST)
   public String calctsiasavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctsia?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctsia/{id}"}, method = RequestMethod.GET)
   public String calctsiatask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctsia";
   }
   
   
   
   
   
   
   
   
   @RequestMapping(value = {"/calctco"}, method = RequestMethod.GET)
	public String calctcotasks(Model model, 
	   		 @Param("keyword") String keyword) {
	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
	   	 model.addAttribute("listCalcts", listCalcts);
	   	 model.addAttribute("keyword", keyword);
	   	model.addAttribute("calcts",calctService.getAll());
     	return "user/trig/calctco";
   }
   
   
   @RequestMapping(value = {"/calctco/new"}, method = RequestMethod.GET)
   public String calctcocreatetaskForm(Model model) {
 	  Calct calct = new Calct();
	 	model.addAttribute("calct",calct);
	 	return "user/trig/create_calctco";
   }
   
   @RequestMapping(value = {"/calctco"}, method = RequestMethod.POST)
   public String calctcosavetask(@ModelAttribute("calct") Calct calct) {
 	  calctService.saveCalct(calct);
	 return "redirect:/calctco?keyword=TypeYourUserID";
	 }
   

   
   @RequestMapping(value = {"/calctco/{id}"}, method = RequestMethod.GET)
   public String calctcotask(@PathVariable Long id) {
 	  calctService.deleteCalctById(id);
	 return "redirect:/calctco";
   }
   
   
   
   
   
   

   
   
   
   

   @RequestMapping(value = {"/calctside"}, method = RequestMethod.GET)
  	public String calctsidetasks(Model model, 
  	   		 @Param("keyword") String keyword) {
  	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
  	   	 model.addAttribute("listCalcts", listCalcts);
  	   	 model.addAttribute("keyword", keyword);
  	   	model.addAttribute("calcts",calctService.getAll());
        	return "user/trig/calctside";
      }

      @RequestMapping(value = {"/calctside/new"}, method = RequestMethod.GET)
      public String calctsidecreatetaskForm(Model model) {
    	  Calct calct = new Calct();
  	 	model.addAttribute("calct",calct);
  	 	return "user/trig/create_calctside";
      }

      @RequestMapping(value = {"/calctside"}, method = RequestMethod.POST)
      public String calctsidesavetask(@ModelAttribute("calct") Calct calct) {
    	  calctService.saveCalct(calct);
  	 return "redirect:/calctside?keyword=TypeYourUserID";
  	 }
      

      @RequestMapping(value = {"/calctside/edit/{id}"}, method = RequestMethod.GET)
      public String calctsideedittaskForm(@PathVariable Long id, Model model) {
  		 model.addAttribute("calct", calctService.getCalctById(id));
  		 return "user/trig/edit_calctside";
  		 }


      @RequestMapping(value = {"/calctside/{id}"}, method = RequestMethod.POST)
      public String calctsideupdatetask(@PathVariable Long id, 
  		 	@ModelAttribute("calct") Calct calct,
  		 	Model model) {
   //get RESULT from database by id
    	  Calct existingCalct = calctService.getCalctById(id);
   existingCalct.setId(id);
   existingCalct.setRollNo(calct.getRollNo());
   existingCalct.setS1(calct.getS1());
   existingCalct.setS2(calct.getS2());
   existingCalct.setS3(calct.getS3());
   existingCalct.setS4(calct.getS4());
   existingCalct.setS5(calct.getS5());
   existingCalct.setS6(calct.getS6());
   existingCalct.setS7(calct.getS7());
   existingCalct.setS8(calct.getS8());
   existingCalct.setS9(calct.getS9());
   existingCalct.setS10(calct.getS10());
   existingCalct.setS11(calct.getS11());
   existingCalct.setS12(calct.getS12());
   existingCalct.setS13(calct.getS13());
   existingCalct.setS14(calct.getS14());
   existingCalct.setS15(calct.getS15());
   existingCalct.setS16(calct.getS16());
   existingCalct.setS17(calct.getS17());
   existingCalct.setS18(calct.getS18());
   existingCalct.setS19(calct.getS19());
   existingCalct.setS20(calct.getS20());
   existingCalct.setS21(calct.getS21());
   existingCalct.setS22(calct.getS22());
   existingCalct.setS23(calct.getS23());
   existingCalct.setS24(calct.getS24());
   existingCalct.setS25(calct.getS25());
   existingCalct.setS26(calct.getS26());
   existingCalct.setS27(calct.getS27());
   existingCalct.setS28(calct.getS28());
   existingCalct.setS29(calct.getS29());
   existingCalct.setS30(calct.getS30());
   existingCalct.setS31(calct.getS31());
   existingCalct.setS32(calct.getS32());
   existingCalct.setS33(calct.getS33());
   existingCalct.setS34(calct.getS34());
   existingCalct.setS35(calct.getS35());
   existingCalct.setS36(calct.getS36());
   existingCalct.setS37(calct.getS37());
   existingCalct.setS38(calct.getS38());
   existingCalct.setS39(calct.getS39());
   existingCalct.setS40(calct.getS40());
   existingCalct.setS41(calct.getS41());
   existingCalct.setS42(calct.getS42());
   existingCalct.setS43(calct.getS43());
   existingCalct.setS44(calct.getS44());
   existingCalct.setS45(calct.getS45());
   existingCalct.setS46(calct.getS46());
   existingCalct.setS47(calct.getS47());
   existingCalct.setS48(calct.getS48());
   existingCalct.setS49(calct.getS49());
   existingCalct.setS50(calct.getS50());




   //save updated Calct object 
   calctService.updateCalct(existingCalct);
      return "redirect:/calctside";
      }

      //handler method to handle delete calc request

      @RequestMapping(value = {"/calctside/{id}"}, method = RequestMethod.GET)
      public String calctsidetask(@PathVariable Long id) {
    	  calctService.deleteCalctById(id);
  	 return "redirect:/calctside";
      }
      
      
      
      
      

      
      
      
      

      @RequestMapping(value = {"/calcthyp"}, method = RequestMethod.GET)
     	public String calcthyptasks(Model model, 
     	   		 @Param("keyword") String keyword) {
     	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
     	   	 model.addAttribute("listCalcts", listCalcts);
     	   	 model.addAttribute("keyword", keyword);
     	   	model.addAttribute("calcts",calctService.getAll());
           	return "user/trig/calcthyp";
         }

         @RequestMapping(value = {"/calcthyp/new"}, method = RequestMethod.GET)
         public String calcthypcreatetaskForm(Model model) {
       	  Calct calct = new Calct();
     	 	model.addAttribute("calct",calct);
     	 	return "user/trig/create_calcthyp";
         }
         
         

         @RequestMapping(value = {"/calcthyp"}, method = RequestMethod.POST)
         public String calcthypsavetask(@ModelAttribute("calct") Calct calct) {
       	  calctService.saveCalct(calct);
     	 return "redirect:/calcthyp?keyword=TypeYourUserID";
     	 }
         

         @RequestMapping(value = {"/calcthyp/edit/{id}"}, method = RequestMethod.GET)
         public String calcthypedittaskForm(@PathVariable Long id, Model model) {
     		 model.addAttribute("calct", calctService.getCalctById(id));
     		 return "user/trig/edit_calcthyp";
     		 }


         @RequestMapping(value = {"/calcthyp/{id}"}, method = RequestMethod.POST)
         public String calcthypupdatetask(@PathVariable Long id, 
     		 	@ModelAttribute("calct") Calct calct,
     		 	Model model) {
      //get RESULT from database by id
       	  Calct existingCalct = calctService.getCalctById(id);
      existingCalct.setId(id);
      existingCalct.setRollNo(calct.getRollNo());
      existingCalct.setS1(calct.getS1());
      existingCalct.setS2(calct.getS2());
      existingCalct.setS3(calct.getS3());
      existingCalct.setS4(calct.getS4());
      existingCalct.setS5(calct.getS5());
      existingCalct.setS6(calct.getS6());
      existingCalct.setS7(calct.getS7());
      existingCalct.setS8(calct.getS8());
      existingCalct.setS9(calct.getS9());
      existingCalct.setS10(calct.getS10());
      existingCalct.setS11(calct.getS11());
      existingCalct.setS12(calct.getS12());
      existingCalct.setS13(calct.getS13());
      existingCalct.setS14(calct.getS14());
      existingCalct.setS15(calct.getS15());
      existingCalct.setS16(calct.getS16());
      existingCalct.setS17(calct.getS17());
      existingCalct.setS18(calct.getS18());
      existingCalct.setS19(calct.getS19());
      existingCalct.setS20(calct.getS20());
      existingCalct.setS21(calct.getS21());
      existingCalct.setS22(calct.getS22());
      existingCalct.setS23(calct.getS23());
      existingCalct.setS24(calct.getS24());
      existingCalct.setS25(calct.getS25());
      existingCalct.setS26(calct.getS26());
      existingCalct.setS27(calct.getS27());
      existingCalct.setS28(calct.getS28());
      existingCalct.setS29(calct.getS29());
      existingCalct.setS30(calct.getS30());
      existingCalct.setS31(calct.getS31());
      existingCalct.setS32(calct.getS32());
      existingCalct.setS33(calct.getS33());
      existingCalct.setS34(calct.getS34());
      existingCalct.setS35(calct.getS35());
      existingCalct.setS36(calct.getS36());
      existingCalct.setS37(calct.getS37());
      existingCalct.setS38(calct.getS38());
      existingCalct.setS39(calct.getS39());
      existingCalct.setS40(calct.getS40());
      existingCalct.setS41(calct.getS41());
      existingCalct.setS42(calct.getS42());
      existingCalct.setS43(calct.getS43());
      existingCalct.setS44(calct.getS44());
      existingCalct.setS45(calct.getS45());
      existingCalct.setS46(calct.getS46());
      existingCalct.setS47(calct.getS47());
      existingCalct.setS48(calct.getS48());
      existingCalct.setS49(calct.getS49());
      existingCalct.setS50(calct.getS50());




      //save updated Calctp object 
      calctService.updateCalct(existingCalct);
         return "redirect:/calcthyp";
         }

         //handler method to handle delete calctp request

         @RequestMapping(value = {"/calcthyp/{id}"}, method = RequestMethod.GET)
         public String calcthyptask(@PathVariable Long id) {
       	  calctService.deleteCalctById(id);
     	 return "redirect:/calcthyp";
         }
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         
         

         
         

         @RequestMapping(value = {"/calctbear"}, method = RequestMethod.GET)
         public String just(){
             return "user/bear/bearnew";
         }


          @RequestMapping(value = {"/calctbjust"}, method = RequestMethod.GET)
         	public String calctbjusttasks(Model model, 
         	   		 @Param("keyword") String keyword) {
         	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
         	   	 model.addAttribute("listCalctbs", listCalctbs);
         	   	 model.addAttribute("keyword", keyword);
         	   	model.addAttribute("calctbs",calctbService.getAll());
               	return "user/bear/just";
             }
          
          
          

             @RequestMapping(value = {"/calctbjust/new"}, method = RequestMethod.GET)
             public String calctbjustcreatetaskForm(Model model) {
           	  Calctb calctb = new Calctb();
         	 	model.addAttribute("calctb",calctb);
         	 	return "user/bear/create_just";
             }
             
             

             @RequestMapping(value = {"/calctbjust"}, method = RequestMethod.POST)
             public String calctbjustsavetask(@ModelAttribute("calctb") Calctb calctb) {
           	  calctbService.saveCalctb(calctb);
         	 return "redirect:/calctbjust?keyword=TypeYourUserID";
         	 }
             

             @RequestMapping(value = {"/calctbjust/edit/{id}"}, method = RequestMethod.GET)
             public String calctbjustedittaskForm(@PathVariable Long id, Model model) {
         		 model.addAttribute("calctb", calctbService.getCalctbById(id));
         		 return "user/bear/edit_calct";
         		 }


             @RequestMapping(value = {"/calctbjust/{id}"}, method = RequestMethod.POST)
             public String calctbjustupdatetask(@PathVariable Long id, 
         		 	@ModelAttribute("calctb") Calctb calctb,
         		 	Model model) {
          //get RESULT from database by id
           	  Calctb existingCalctb = calctbService.getCalctbById(id);
          existingCalctb.setId(id);
          existingCalctb.setRollNo(calctb.getRollNo());
          existingCalctb.setS1(calctb.getS1());
          existingCalctb.setS2(calctb.getS2());
          existingCalctb.setS3(calctb.getS3());
          existingCalctb.setS4(calctb.getS4());
          existingCalctb.setS5(calctb.getS5());
          existingCalctb.setS6(calctb.getS6());
          existingCalctb.setS7(calctb.getS7());
          existingCalctb.setS8(calctb.getS8());
          existingCalctb.setS9(calctb.getS9());
          existingCalctb.setS10(calctb.getS10());
          existingCalctb.setS11(calctb.getS11());
          existingCalctb.setS12(calctb.getS12());
          existingCalctb.setS13(calctb.getS13());
          existingCalctb.setS14(calctb.getS14());
          existingCalctb.setS15(calctb.getS15());
          existingCalctb.setS16(calctb.getS16());
          existingCalctb.setS17(calctb.getS17());
          existingCalctb.setS18(calctb.getS18());
          existingCalctb.setS19(calctb.getS19());
          existingCalctb.setS20(calctb.getS20());
          existingCalctb.setS21(calctb.getS21());
          existingCalctb.setS22(calctb.getS22());
          existingCalctb.setS23(calctb.getS23());
          existingCalctb.setS24(calctb.getS24());
          existingCalctb.setS25(calctb.getS25());
          existingCalctb.setS26(calctb.getS26());
          existingCalctb.setS27(calctb.getS27());
          existingCalctb.setS28(calctb.getS28());
          existingCalctb.setS29(calctb.getS29());
          existingCalctb.setS30(calctb.getS30());
          existingCalctb.setS31(calctb.getS31());
          existingCalctb.setS32(calctb.getS32());
          existingCalctb.setS33(calctb.getS33());
          existingCalctb.setS34(calctb.getS34());
          existingCalctb.setS35(calctb.getS35());
          existingCalctb.setS36(calctb.getS36());
          existingCalctb.setS37(calctb.getS37());
          existingCalctb.setS38(calctb.getS38());
          existingCalctb.setS39(calctb.getS39());
          existingCalctb.setS40(calctb.getS40());
          existingCalctb.setS41(calctb.getS41());
          existingCalctb.setS42(calctb.getS42());
          existingCalctb.setS43(calctb.getS43());
          existingCalctb.setS44(calctb.getS44());
          existingCalctb.setS45(calctb.getS45());
          existingCalctb.setS46(calctb.getS46());
          existingCalctb.setS47(calctb.getS47());
          existingCalctb.setS48(calctb.getS48());
          existingCalctb.setS49(calctb.getS49());
          existingCalctb.setS50(calctb.getS50());




          //save updated Calctbjust object 
          calctbService.updateCalctb(existingCalctb);
             return "redirect:/calctbjust";
             }

             //handler method to handle delete calc request

             @RequestMapping(value = {"/calctbjust/{id}"}, method = RequestMethod.GET)
             public String calctbjusttask(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbjust";
             }
             
             
             
             
             
             
             
             
             

             @RequestMapping(value = {"/calctbjustse"}, method = RequestMethod.GET)
            	public String calctbjustsetasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/justse";
                }
             
             
             

                @RequestMapping(value = {"/calctbjustse/new"}, method = RequestMethod.GET)
                public String calctbjustsecreatetaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_justse";
                }
                
                

                @RequestMapping(value = {"/calctbjustse"}, method = RequestMethod.POST)
                public String calctbjustsesavetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbjustse?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbjustse/{id}"}, method = RequestMethod.GET)
             public String calctbjustsetask(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbjustse";
             }
             
             
             
             

             @RequestMapping(value = {"/calctbjustnw"}, method = RequestMethod.GET)
            	public String calctbjustnwtasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/justnw";
                }
             
             
             

                @RequestMapping(value = {"/calctbjustnw/new"}, method = RequestMethod.GET)
                public String calctbjustnwcreatetaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_justnw";
                }
                
                

                @RequestMapping(value = {"/calctbjustnw"}, method = RequestMethod.POST)
                public String calctbjustnwsavetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbjustnw?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbjustnw/{id}"}, method = RequestMethod.GET)
             public String calctbjustnwtask(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbjustnw";
             }
             
             
             
             
             
             


             @RequestMapping(value = {"/calctbjustsw"}, method = RequestMethod.GET)
            	public String calctbjustswtasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/justsw";
                }
             
             
             

                @RequestMapping(value = {"/calctbjustsw/new"}, method = RequestMethod.GET)
                public String calctbjustswcreatetaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_justsw";
                }
                
                

                @RequestMapping(value = {"/calctbjustsw"}, method = RequestMethod.POST)
                public String calctbjustswsavetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbjustsw?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbjustsw/{id}"}, method = RequestMethod.GET)
             public String calctbjustswtask(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbjustsw";
             }
             
             
             

             @RequestMapping(value = {"/calctbdeg9"}, method = RequestMethod.GET)
            	public String calctbdeg9tasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/deg9";
                }
             
             
             

                @RequestMapping(value = {"/calctbdeg9/new"}, method = RequestMethod.GET)
                public String calctbdeg9createtaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_deg9";
                }
                
                

                @RequestMapping(value = {"/calctbdeg9"}, method = RequestMethod.POST)
                public String calctbdeg9savetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbdeg9?keyword=TypeYourUserID";
            	 }
                
                
                
                @RequestMapping(value = {"/calctbdeg9/{id}"}, method = RequestMethod.GET)
                public String calctbdeg9task(@PathVariable Long id) {
              	  calctbService.deleteCalctbById(id);
            	 return "redirect:/calctbdeg9";
                }
                
                
             
             
             
             
             
             
             @RequestMapping(value = {"/calctbdeg18"}, method = RequestMethod.GET)
            	public String calctbdeg18tasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/deg18";
                }
             
             
             

                @RequestMapping(value = {"/calctbdeg18/new"}, method = RequestMethod.GET)
                public String calctbdeg18createtaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_deg18";
                }
                
                

                @RequestMapping(value = {"/calctbdeg18"}, method = RequestMethod.POST)
                public String calctbdeg18savetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbdeg18?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbdeg18/{id}"}, method = RequestMethod.GET)
             public String calctbdeg18task(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbdeg18";
             }
             
             
             
             
             
             

             
             @RequestMapping(value = {"/calctbdeg27"}, method = RequestMethod.GET)
            	public String calctbdeg27tasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/deg27";
                }
             
             
             

                @RequestMapping(value = {"/calctbdeg27/new"}, method = RequestMethod.GET)
                public String calctbdeg27createtaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_deg27";
                }
                
                

                @RequestMapping(value = {"/calctbdeg27"}, method = RequestMethod.POST)
                public String calctbdeg27savetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbdeg27?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbdeg27/{id}"}, method = RequestMethod.GET)
             public String calctbdeg27task(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbdeg27";
             }
             
             
             
             
             
             
             

             
             @RequestMapping(value = {"/calctbdeg36"}, method = RequestMethod.GET)
            	public String calctbdeg36tasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/deg36";
                }
             
             
             

                @RequestMapping(value = {"/calctbdeg36/new"}, method = RequestMethod.GET)
                public String calctbdeg36createtaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_deg36";
                }
                
                

                @RequestMapping(value = {"/calctbdeg36"}, method = RequestMethod.POST)
                public String calctbdeg36savetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbdeg36?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbdeg36/{id}"}, method = RequestMethod.GET)
             public String calctbdeg36task(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbdeg36";
             }
             
             
             
             
             
             

             @RequestMapping(value = {"/calctbprodeg"}, method = RequestMethod.GET)
            	public String calctbprodegtasks(Model model, 
            	   		 @Param("keyword") String keyword) {
            	   	 List<Calctb> listCalctbs = calctbService.getAllCalctbs(keyword);
            	   	 model.addAttribute("listCalctbs", listCalctbs);
            	   	 model.addAttribute("keyword", keyword);
            	   	model.addAttribute("calctbs",calctbService.getAll());
                  	return "user/bear/prodeg";
                }
             
             
             

                @RequestMapping(value = {"/calctbprodeg/new"}, method = RequestMethod.GET)
                public String calctbprodegcreatetaskForm(Model model) {
              	  Calctb calctb = new Calctb();
            	 	model.addAttribute("calctb",calctb);
            	 	return "user/bear/create_prodeg";
                }
                
                

                @RequestMapping(value = {"/calctbprodeg"}, method = RequestMethod.POST)
                public String calctbprodegsavetask(@ModelAttribute("calctb") Calctb calctb) {
              	  calctbService.saveCalctb(calctb);
            	 return "redirect:/calctbprodeg?keyword=TypeYourUserID";
            	 }
                
             
             
             
             @RequestMapping(value = {"/calctbprodeg/{id}"}, method = RequestMethod.GET)
             public String calctbprodegtask(@PathVariable Long id) {
           	  calctbService.deleteCalctbById(id);
         	 return "redirect:/calctbprodeg";
             }
             
             
             

	          
             
             
             
             
             
             
             
             
             
             
             
             
             
             
             

             
             

             @RequestMapping(value = {"/calctstat"}, method = RequestMethod.GET)
             public String stat(){
                 return "user/stat/stat";
             }


              @RequestMapping(value = {"/calctd"}, method = RequestMethod.GET)
             	public String calctdtasks(Model model, 
             	   		 @Param("keyword") String keyword) {
             	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
             	   	 model.addAttribute("listCalctds", listCalctds);
             	   	 model.addAttribute("keyword", keyword);
             	   	model.addAttribute("calctds",calctdService.getAll());
                   	return "user/stat/ungrouped/freq";
                 }
              
              
              

                 @RequestMapping(value = {"/calctd/new"}, method = RequestMethod.GET)
                 public String calctdcreatetaskForm(Model model) {
               	  Calctd calctd = new Calctd();
             	 	model.addAttribute("calctd",calctd);
             	 	return "user/stat/ungrouped/create_freq";
                 }
                 
                 

                 @RequestMapping(value = {"/calctd"}, method = RequestMethod.POST)
                 public String calctdsavetask(@ModelAttribute("calctd") Calctd calctd) {
               	  calctdService.saveCalctd(calctd);
             	 return "redirect:/calctd?keyword=TypeYourUserID";
             	 }
                 

                 @RequestMapping(value = {"/calctd/edit/{id}"}, method = RequestMethod.GET)
                 public String calctdedittaskForm(@PathVariable Long id, Model model) {
             		 model.addAttribute("calctd", calctdService.getCalctdById(id));
             		 return "user/stat/ungrouped/edit_freq";
             		 }


                 @RequestMapping(value = {"/calctd/{id}"}, method = RequestMethod.POST)
                 public String calctdupdatetask(@PathVariable Long id, 
             		 	@ModelAttribute("calctd") Calctd calctd,
             		 	Model model) {
              //get RESULT from database by id
               	  Calctd existingCalctd = calctdService.getCalctdById(id);
              existingCalctd.setId(id);
              existingCalctd.setRollNo(calctd.getRollNo());
              existingCalctd.setS1(calctd.getS1());
              existingCalctd.setS2(calctd.getS2());
              existingCalctd.setS3(calctd.getS3());
              existingCalctd.setS4(calctd.getS4());
              existingCalctd.setS5(calctd.getS5());
              existingCalctd.setS6(calctd.getS6());
              existingCalctd.setS7(calctd.getS7());
              existingCalctd.setS8(calctd.getS8());
              existingCalctd.setS9(calctd.getS9());
              existingCalctd.setS10(calctd.getS10());
              existingCalctd.setS11(calctd.getS11());
              existingCalctd.setS12(calctd.getS12());
              existingCalctd.setS13(calctd.getS13());
              existingCalctd.setS14(calctd.getS14());
              existingCalctd.setS15(calctd.getS15());
              existingCalctd.setS16(calctd.getS16());
              existingCalctd.setS17(calctd.getS17());
              existingCalctd.setS18(calctd.getS18());
              existingCalctd.setS19(calctd.getS19());
              existingCalctd.setS20(calctd.getS20());
              existingCalctd.setS21(calctd.getS21());
              existingCalctd.setS22(calctd.getS22());
              existingCalctd.setS23(calctd.getS23());
              existingCalctd.setS24(calctd.getS24());
              existingCalctd.setS25(calctd.getS25());
              existingCalctd.setS26(calctd.getS26());
              existingCalctd.setS27(calctd.getS27());
              existingCalctd.setS28(calctd.getS28());
              existingCalctd.setS29(calctd.getS29());
              existingCalctd.setS30(calctd.getS30());
              existingCalctd.setS31(calctd.getS31());
              existingCalctd.setS32(calctd.getS32());
              existingCalctd.setS33(calctd.getS33());
              existingCalctd.setS34(calctd.getS34());
              existingCalctd.setS35(calctd.getS35());
              existingCalctd.setS36(calctd.getS36());
              existingCalctd.setS37(calctd.getS37());
              existingCalctd.setS38(calctd.getS38());
              existingCalctd.setS39(calctd.getS39());
              existingCalctd.setS40(calctd.getS40());
              existingCalctd.setS41(calctd.getS41());
              existingCalctd.setS42(calctd.getS42());
              existingCalctd.setS43(calctd.getS43());
              existingCalctd.setS44(calctd.getS44());
              existingCalctd.setS45(calctd.getS45());
              existingCalctd.setS46(calctd.getS46());
              existingCalctd.setS47(calctd.getS47());
              existingCalctd.setS48(calctd.getS48());
              existingCalctd.setS49(calctd.getS49());
              existingCalctd.setS50(calctd.getS50());
              existingCalctd.setS51(calctd.getS51());
              existingCalctd.setS52(calctd.getS52());
              existingCalctd.setS53(calctd.getS53());
              existingCalctd.setS54(calctd.getS54());
              existingCalctd.setS55(calctd.getS55());
              existingCalctd.setS56(calctd.getS56());
              existingCalctd.setS57(calctd.getS57());
              existingCalctd.setS58(calctd.getS58());
              existingCalctd.setS59(calctd.getS59());
              existingCalctd.setS60(calctd.getS60());
              existingCalctd.setS61(calctd.getS61());
              existingCalctd.setS62(calctd.getS62());
              existingCalctd.setS63(calctd.getS63());
              existingCalctd.setS64(calctd.getS64());
              existingCalctd.setS65(calctd.getS65());
              existingCalctd.setS66(calctd.getS66());
              existingCalctd.setS67(calctd.getS67());
              existingCalctd.setS68(calctd.getS68());
              existingCalctd.setS69(calctd.getS69());
              existingCalctd.setS70(calctd.getS70());
              existingCalctd.setS71(calctd.getS71());
              existingCalctd.setS72(calctd.getS72());
              existingCalctd.setS73(calctd.getS73());
              existingCalctd.setS74(calctd.getS74());
              existingCalctd.setS75(calctd.getS75());
              existingCalctd.setS76(calctd.getS76());
              existingCalctd.setS77(calctd.getS77());
              existingCalctd.setS78(calctd.getS78());
              existingCalctd.setS79(calctd.getS79());
              existingCalctd.setS80(calctd.getS80());
              existingCalctd.setS81(calctd.getS81());
              existingCalctd.setS82(calctd.getS82());
              existingCalctd.setS83(calctd.getS83());
              existingCalctd.setS84(calctd.getS84());
              existingCalctd.setS85(calctd.getS85());
              existingCalctd.setS86(calctd.getS86());
              existingCalctd.setS87(calctd.getS87());
              existingCalctd.setS88(calctd.getS88());
              existingCalctd.setS89(calctd.getS89());
              existingCalctd.setS90(calctd.getS90());
              existingCalctd.setS91(calctd.getS91());
              existingCalctd.setS92(calctd.getS92());
              existingCalctd.setS93(calctd.getS93());
              existingCalctd.setS94(calctd.getS94());
              existingCalctd.setS95(calctd.getS95());
              existingCalctd.setS96(calctd.getS96());
              existingCalctd.setS97(calctd.getS97());
              existingCalctd.setS98(calctd.getS98());
              existingCalctd.setS99(calctd.getS99());
              existingCalctd.setS100(calctd.getS100());
              existingCalctd.setS101(calctd.getS101());
              existingCalctd.setS102(calctd.getS102());
              existingCalctd.setS103(calctd.getS103());
              existingCalctd.setS104(calctd.getS104());
              existingCalctd.setS105(calctd.getS105());
              existingCalctd.setS106(calctd.getS106());
              existingCalctd.setS107(calctd.getS107());
              existingCalctd.setS108(calctd.getS108());
              existingCalctd.setS109(calctd.getS109());
              existingCalctd.setS110(calctd.getS110());
              existingCalctd.setS111(calctd.getS111());
              existingCalctd.setS112(calctd.getS112());
              existingCalctd.setS113(calctd.getS113());
              existingCalctd.setS114(calctd.getS114());
              existingCalctd.setS115(calctd.getS115());
              existingCalctd.setS116(calctd.getS116());
              existingCalctd.setS117(calctd.getS117());
              existingCalctd.setS118(calctd.getS118());
              existingCalctd.setS119(calctd.getS119());
              existingCalctd.setS120(calctd.getS120());
              existingCalctd.setS121(calctd.getS121());
              existingCalctd.setS122(calctd.getS122());
              existingCalctd.setS123(calctd.getS123());
              existingCalctd.setS124(calctd.getS124());
              existingCalctd.setS125(calctd.getS125());
              existingCalctd.setS126(calctd.getS126());
              existingCalctd.setS127(calctd.getS127());
              existingCalctd.setS128(calctd.getS128());
              existingCalctd.setS129(calctd.getS129());
              existingCalctd.setS130(calctd.getS130());
              existingCalctd.setS131(calctd.getS131());
              existingCalctd.setS132(calctd.getS132());
              existingCalctd.setS133(calctd.getS133());
              existingCalctd.setS134(calctd.getS134());
              existingCalctd.setS135(calctd.getS135());
              existingCalctd.setS136(calctd.getS136());
              existingCalctd.setS137(calctd.getS137());
              existingCalctd.setS138(calctd.getS138());
              existingCalctd.setS139(calctd.getS139());
              existingCalctd.setS140(calctd.getS140());
              existingCalctd.setS141(calctd.getS141());
              existingCalctd.setS142(calctd.getS142());
              existingCalctd.setS143(calctd.getS143());
              existingCalctd.setS144(calctd.getS144());
              existingCalctd.setS145(calctd.getS145());
              existingCalctd.setS146(calctd.getS146());
              existingCalctd.setS147(calctd.getS147());
              existingCalctd.setS148(calctd.getS148());
              existingCalctd.setS149(calctd.getS149());
              existingCalctd.setS150(calctd.getS150());
              existingCalctd.setS151(calctd.getS151());
              existingCalctd.setS152(calctd.getS152());
              existingCalctd.setS153(calctd.getS153());
              existingCalctd.setS154(calctd.getS154());
              existingCalctd.setS155(calctd.getS155());
              existingCalctd.setS156(calctd.getS156());
              existingCalctd.setS157(calctd.getS157());
              existingCalctd.setS158(calctd.getS158());
              existingCalctd.setS159(calctd.getS159());
              existingCalctd.setS160(calctd.getS160());
              existingCalctd.setS161(calctd.getS161());
              existingCalctd.setS162(calctd.getS162());
              existingCalctd.setS163(calctd.getS163());
              existingCalctd.setS164(calctd.getS164());
              existingCalctd.setS165(calctd.getS165());
              existingCalctd.setS166(calctd.getS166());
              existingCalctd.setS167(calctd.getS167());
              existingCalctd.setS168(calctd.getS168());
              existingCalctd.setS169(calctd.getS169());
              existingCalctd.setS170(calctd.getS170());
              existingCalctd.setS171(calctd.getS171());
              existingCalctd.setS172(calctd.getS172());
              existingCalctd.setS173(calctd.getS173());
              existingCalctd.setS174(calctd.getS174());
              existingCalctd.setS175(calctd.getS175());
              existingCalctd.setS176(calctd.getS176());
              existingCalctd.setS177(calctd.getS177());
              existingCalctd.setS178(calctd.getS178());
              existingCalctd.setS179(calctd.getS179());
              existingCalctd.setS180(calctd.getS180());
              existingCalctd.setS181(calctd.getS181());
              existingCalctd.setS182(calctd.getS182());
              existingCalctd.setS183(calctd.getS183());
              existingCalctd.setS184(calctd.getS184());
              existingCalctd.setS185(calctd.getS185());
              existingCalctd.setS186(calctd.getS186());
              existingCalctd.setS187(calctd.getS187());
              existingCalctd.setS188(calctd.getS188());
              existingCalctd.setS189(calctd.getS189());
              existingCalctd.setS190(calctd.getS190());
              existingCalctd.setS191(calctd.getS191());
              existingCalctd.setS192(calctd.getS192());
              existingCalctd.setS193(calctd.getS193());
              existingCalctd.setS194(calctd.getS194());
              existingCalctd.setS195(calctd.getS195());
              existingCalctd.setS196(calctd.getS196());
              existingCalctd.setS197(calctd.getS197());
              existingCalctd.setS198(calctd.getS198());
              existingCalctd.setS199(calctd.getS199());
              existingCalctd.setS200(calctd.getS200());
              




              //save updated Calctd object 
              calctdService.updateCalctd(existingCalctd);
                 return "redirect:/calctd";
                 }

                 //handler method to handle delete calc request

                 @RequestMapping(value = {"/calctd/{id}"}, method = RequestMethod.GET)
                 public String calctdtask(@PathVariable Long id) {
               	  calctdService.deleteCalctdById(id);
             	 return "redirect:/calctd";
                 }
                 
                 
                 
                 
                 
                 
                 
                 
                 @RequestMapping(value = {"/calctdfreqless"}, method = RequestMethod.GET)
                	public String calctdfreqlesstasks(Model model, 
                	   		 @Param("keyword") String keyword) {
                	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                	   	 model.addAttribute("listCalctds", listCalctds);
                	   	 model.addAttribute("keyword", keyword);
                	   	model.addAttribute("calctds",calctdService.getAll());
                      	return "user/stat/ungrouped/freqless";
                    }
                 
                 
                 

                    @RequestMapping(value = {"/calctdfreqless/new"}, method = RequestMethod.GET)
                    public String calctdlesscreatetaskForm(Model model) {
                  	  Calctd calctd = new Calctd();
                	 	model.addAttribute("calctd",calctd);
                	 	return "user/stat/ungrouped/create_freqless";
                    }
                    
                    

                    @RequestMapping(value = {"/calctdfreqless"}, method = RequestMethod.POST)
                    public String calctdfreqlesssavetask(@ModelAttribute("calctd") Calctd calctd) {
                  	  calctdService.saveCalctd(calctd);
                	 return "redirect:/calctdfreqless?keyword=TypeYourUserID";
                	 }
                    
                    
                    @RequestMapping(value = {"/calctdfreqless/{id}"}, method = RequestMethod.GET)
                    public String calctdfreqlesstask(@PathVariable Long id) {
                  	  calctdService.deleteCalctdById(id);
                	 return "redirect:/calctdfreqless";
                    }
                    
                    
                 
                 
                 
                 
                 
                 
                 
                 

                 @RequestMapping(value = {"/calctdmede"}, method = RequestMethod.GET)
                	public String calctdmedetasks(Model model, 
                	   		 @Param("keyword") String keyword) {
                	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                	   	 model.addAttribute("listCalctds", listCalctds);
                	   	 model.addAttribute("keyword", keyword);
                	   	model.addAttribute("calctds",calctdService.getAll());
                      	return "user/stat/ungrouped/mede";
                    }
                 
                 
                 

                    @RequestMapping(value = {"/calctdmede/new"}, method = RequestMethod.GET)
                    public String calctdmedecreatetaskForm(Model model) {
                  	  Calctd calctd = new Calctd();
                	 	model.addAttribute("calctd",calctd);
                	 	return "user/stat/ungrouped/create_mede";
                    }
                    
                    

                    @RequestMapping(value = {"/calctdmede"}, method = RequestMethod.POST)
                    public String calctdmedesavetask(@ModelAttribute("calctd") Calctd calctd) {
                  	  calctdService.saveCalctd(calctd);
                	 return "redirect:/calctdmede?keyword=TypeYourUserID";
                	 }
                    
                    
                    @RequestMapping(value = {"/calctdmede/{id}"}, method = RequestMethod.GET)
                    public String calctdmedetask(@PathVariable Long id) {
                  	  calctdService.deleteCalctdById(id);
                	 return "redirect:/calctdmede";
                    }
                    
                    
                    
                    @RequestMapping(value = {"/calctdvar"}, method = RequestMethod.GET)
                   	public String calctdvartasks(Model model, 
                   	   		 @Param("keyword") String keyword) {
                   	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                   	   	 model.addAttribute("listCalctds", listCalctds);
                   	   	 model.addAttribute("keyword", keyword);
                   	   	model.addAttribute("calctds",calctdService.getAll());
                         	return "user/stat/ungrouped/var";
                       }
                    
                    
                    

                       @RequestMapping(value = {"/calctdvar/new"}, method = RequestMethod.GET)
                       public String calctdvarcreatetaskForm(Model model) {
                     	  Calctd calctd = new Calctd();
                   	 	model.addAttribute("calctd",calctd);
                   	 	return "user/stat/ungrouped/create_var";
                       }
                       
                       

                       @RequestMapping(value = {"/calctdvar"}, method = RequestMethod.POST)
                       public String calctdvarsavetask(@ModelAttribute("calctd") Calctd calctd) {
                     	  calctdService.saveCalctd(calctd);
                   	 return "redirect:/calctdvar?keyword=TypeYourUserID";
                   	 }
                       
                       
                       @RequestMapping(value = {"/calctdvar/{id}"}, method = RequestMethod.GET)
                       public String calctdvartask(@PathVariable Long id) {
                     	  calctdService.deleteCalctdById(id);
                   	 return "redirect:/calctdvar";
                       }
                       
                    
                    
                    
                    
                    
                    
                    

                    @RequestMapping(value = {"/calctdmedeless"}, method = RequestMethod.GET)
                   	public String calctdmedelesstasks(Model model, 
                   	   		 @Param("keyword") String keyword) {
                   	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                   	   	 model.addAttribute("listCalctds", listCalctds);
                   	   	 model.addAttribute("keyword", keyword);
                   	   	model.addAttribute("calctds",calctdService.getAll());
                         	return "user/stat/ungrouped/medeless";
                       }
                    
                    
                    

                       @RequestMapping(value = {"/calctdmedeless/new"}, method = RequestMethod.GET)
                       public String calctdmedelesscreatetaskForm(Model model) {
                     	  Calctd calctd = new Calctd();
                   	 	model.addAttribute("calctd",calctd);
                   	 	return "user/stat/ungrouped/create_medeless";
                       }
                       
                       

                       @RequestMapping(value = {"/calctdmedeless"}, method = RequestMethod.POST)
                       public String calctdmedelesssavetask(@ModelAttribute("calctd") Calctd calctd) {
                     	  calctdService.saveCalctd(calctd);
                   	 return "redirect:/calctdmedeless?keyword=TypeYourUserID";
                   	 }
                       
                       
                       @RequestMapping(value = {"/calctdmedeless/{id}"}, method = RequestMethod.GET)
                       public String calctdmedelesstask(@PathVariable Long id) {
                     	  calctdService.deleteCalctdById(id);
                   	 return "redirect:/calctdmedeless";
                       }
                    
                       
                       
                       

                       @RequestMapping(value = {"/calctdmeta"}, method = RequestMethod.GET)
                      	public String calctdmetatasks(Model model, 
                      	   		 @Param("keyword") String keyword) {
                      	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                      	   	 model.addAttribute("listCalctds", listCalctds);
                      	   	 model.addAttribute("keyword", keyword);
                      	   	model.addAttribute("calctds",calctdService.getAll());
                            	return "user/stat/grouped/meta";
                          }
                       
                       
                       

                          @RequestMapping(value = {"/calctdmeta/new"}, method = RequestMethod.GET)
                          public String calctdmetacreatetaskForm(Model model) {
                        	  Calctd calctd = new Calctd();
                      	 	model.addAttribute("calctd",calctd);
                      	 	return "user/stat/grouped/create_meta";
                          }
                          
                          

                          @RequestMapping(value = {"/calctdmeta"}, method = RequestMethod.POST)
                          public String calctdmetasavetask(@ModelAttribute("calctd") Calctd calctd) {
                        	  calctdService.saveCalctd(calctd);
                      	 return "redirect:/calctdmeta?keyword=TypeYourUserID";
                      	 }
                          
                          
                          @RequestMapping(value = {"/calctdmeta/{id}"}, method = RequestMethod.GET)
                          public String calctdmetatask(@PathVariable Long id) {
                        	  calctdService.deleteCalctdById(id);
                      	 return "redirect:/calctdmeta";
                          }
                          
                          
                          
                          
                          

                          @RequestMapping(value = {"/calctdmedmeta"}, method = RequestMethod.GET)
                         	public String calctdmedmetatasks(Model model, 
                         	   		 @Param("keyword") String keyword) {
                         	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                         	   	 model.addAttribute("listCalctds", listCalctds);
                         	   	 model.addAttribute("keyword", keyword);
                         	   	model.addAttribute("calctds",calctdService.getAll());
                               	return "user/stat/grouped/medmeta";
                             }
                          
                          
                          

                             @RequestMapping(value = {"/calctdmedmeta/new"}, method = RequestMethod.GET)
                             public String calctdmedmetacreatetaskForm(Model model) {
                           	  Calctd calctd = new Calctd();
                         	 	model.addAttribute("calctd",calctd);
                         	 	return "user/stat/grouped/create_medmeta";
                             }
                             
                             

                             @RequestMapping(value = {"/calctdmedmeta"}, method = RequestMethod.POST)
                             public String calctdmedmetasavetask(@ModelAttribute("calctd") Calctd calctd) {
                           	  calctdService.saveCalctd(calctd);
                         	 return "redirect:/calctdmedmeta?keyword=TypeYourUserID";
                         	 }
                             
                             
                             @RequestMapping(value = {"/calctdmedmeta/{id}"}, method = RequestMethod.GET)
                             public String calctdmedmetatask(@PathVariable Long id) {
                           	  calctdService.deleteCalctdById(id);
                         	 return "redirect:/calctdmedmeta";
                             }
                             
                       
                             
                             
                             @RequestMapping(value = {"/calctdstdta"}, method = RequestMethod.GET)
                         	public String calctdstdtatasks(Model model, 
                         	   		 @Param("keyword") String keyword) {
                         	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                         	   	 model.addAttribute("listCalctds", listCalctds);
                         	   	 model.addAttribute("keyword", keyword);
                         	   	model.addAttribute("calctds",calctdService.getAll());
                               	return "user/stat/grouped/stdta";
                             }
                          
                          
                          

                             @RequestMapping(value = {"/calctdstdta/new"}, method = RequestMethod.GET)
                             public String calctdstdtacreatetaskForm(Model model) {
                           	  Calctd calctd = new Calctd();
                         	 	model.addAttribute("calctd",calctd);
                         	 	return "user/stat/grouped/create_stdta";
                             }
                             
                             

                             @RequestMapping(value = {"/calctdstdta"}, method = RequestMethod.POST)
                             public String calctdstdtasavetask(@ModelAttribute("calctd") Calctd calctd) {
                           	  calctdService.saveCalctd(calctd);
                         	 return "redirect:/calctdstdta?keyword=TypeYourUserID";
                         	 }
                             
                             
                             @RequestMapping(value = {"/calctdstdta/{id}"}, method = RequestMethod.GET)
                             public String calctdstdtatask(@PathVariable Long id) {
                           	  calctdService.deleteCalctdById(id);
                         	 return "redirect:/calctdstdta";
                             }
                             
                             
                             
                             
                             
                             
                             @RequestMapping(value = {"/calctdmedstdta"}, method = RequestMethod.GET)
                         	public String calctdmedstdtatasks(Model model, 
                         	   		 @Param("keyword") String keyword) {
                         	   	 List<Calctd> listCalctds = calctdService.getAllCalctds(keyword);
                         	   	 model.addAttribute("listCalctds", listCalctds);
                         	   	 model.addAttribute("keyword", keyword);
                         	   	model.addAttribute("calctds",calctdService.getAll());
                               	return "user/stat/grouped/medstdta";
                             }
                          
                          
                          

                             @RequestMapping(value = {"/calctdmedstdta/new"}, method = RequestMethod.GET)
                             public String calctdmedstdtacreatetaskForm(Model model) {
                           	  Calctd calctd = new Calctd();
                         	 	model.addAttribute("calctd",calctd);
                         	 	return "user/stat/grouped/create_medstdta";
                             }
                             
                             

                             @RequestMapping(value = {"/calctdmedstdta"}, method = RequestMethod.POST)
                             public String calctdmedstdtasavetask(@ModelAttribute("calctd") Calctd calctd) {
                           	  calctdService.saveCalctd(calctd);
                         	 return "redirect:/calctdmedstdta?keyword=TypeYourUserID";
                         	 }
                             
                             
                             @RequestMapping(value = {"/calctdmedstdta/{id}"}, method = RequestMethod.GET)
                             public String calctdmedstdtatask(@PathVariable Long id) {
                           	  calctdService.deleteCalctdById(id);
                         	 return "redirect:/calctdmedstdta";
                             }
                             
                       
                       
                       
                             
                             
                             
                             @RequestMapping(value = {"/calctcosidea"}, method = RequestMethod.GET)
                           	public String calctcosideatasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosidea";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosidea/new"}, method = RequestMethod.GET)
                               public String calctcosideacreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosidea";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosidea"}, method = RequestMethod.POST)
                               public String calctcosideasavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosidea?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosidea/{id}"}, method = RequestMethod.GET)
                             public String calctcosideatask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosidea";
                             }



                             @RequestMapping(value = {"/calctcosanga"}, method = RequestMethod.GET)
                           	public String calctcosangatasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosanga";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosanga/new"}, method = RequestMethod.GET)
                               public String calctcosangacreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosanga";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosanga"}, method = RequestMethod.POST)
                               public String calctcosangasavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosanga?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosanga/{id}"}, method = RequestMethod.GET)
                             public String calctcosangatask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosanga";
                             }



                             
                             
                             
                             
                             
                             @RequestMapping(value = {"/calctcosideb"}, method = RequestMethod.GET)
                           	public String calctcosidebtasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosideb";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosideb/new"}, method = RequestMethod.GET)
                               public String calctcosidebcreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosideb";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosideb"}, method = RequestMethod.POST)
                               public String calctcosidebsavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosideb?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosideb/{id}"}, method = RequestMethod.GET)
                             public String calctcosidebtask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosideb";
                             }
                             
                             
                             
                             @RequestMapping(value = {"/calctcosangb"}, method = RequestMethod.GET)
                           	public String calctcosangbtasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosangb";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosangb/new"}, method = RequestMethod.GET)
                               public String calctcosangbcreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosangb";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosangb"}, method = RequestMethod.POST)
                               public String calctcosangbsavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosangb?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosangb/{id}"}, method = RequestMethod.GET)
                             public String calctcosangbtask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosangb";
                             }



                             
                             
                             
                             
                             @RequestMapping(value = {"/calctcosidec"}, method = RequestMethod.GET)
                           	public String calctcosidectasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosidec";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosidec/new"}, method = RequestMethod.GET)
                               public String calctcosideccreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosidec";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosidec"}, method = RequestMethod.POST)
                               public String calctcosidecsavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosidec?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosidec/{id}"}, method = RequestMethod.GET)
                             public String calctcosidectask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosidec";
                             }
                             
                             
                             
                             
                             
                             
                             

                             @RequestMapping(value = {"/calctcosangc"}, method = RequestMethod.GET)
                           	public String calctcosangctasks(Model model, 
                           	   		 @Param("keyword") String keyword) {
                           	   	 List<Calct> listCalcts = calctService.getAllCalcts(keyword);
                           	   	 model.addAttribute("listCalcts", listCalcts);
                           	   	 model.addAttribute("keyword", keyword);
                           	   	model.addAttribute("calcts",calctService.getAll());
                                 	return "user/trig/calctcos/calctcosangc";
                               }
                            
                            
                            

                               @RequestMapping(value = {"/calctcosangc/new"}, method = RequestMethod.GET)
                               public String calctcosangccreatetaskForm(Model model) {
                             	  Calct calct = new Calct();
                           	 	model.addAttribute("calct",calct);
                           	 	return "user/trig/calctcos/create_calctcosangc";
                               }
                               
                               

                               @RequestMapping(value = {"/calctcosangc"}, method = RequestMethod.POST)
                               public String calctcosangcsavetask(@ModelAttribute("calct") Calct calct) {
                             	  calctService.saveCalct(calct);
                           	 return "redirect:/calctcosangc?keyword=TypeYourUserID";
                           	 }
                             
                             @RequestMapping(value = {"/calctcosangc/{id}"}, method = RequestMethod.GET)
                             public String calctcosangctask(@PathVariable Long id) {
                           	  calctService.deleteCalctById(id);
                         	 return "redirect:/calctcosangc";
                             }


   
	   
}
