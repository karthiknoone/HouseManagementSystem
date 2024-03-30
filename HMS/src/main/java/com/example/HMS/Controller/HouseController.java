/**
 * 
 */
package com.example.HMS.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.HMS.Models.House;
import com.example.HMS.Repository.HmsRepository;

/**
 * @author karthik
 *
 */
// which acts connecting request from website to back-end code
// and also performs the operation based on web request 

	//karthik
@Controller
public class HouseController {

	ModelAndView mv = new ModelAndView();
	@Autowired
	HmsRepository houserepo  ;

	/*
	 * @RequestMapping("home") public String home() { return "home.html"; }
	 */
	@RequestMapping("home")
	public ModelAndView home() {

		mv.setViewName("home.html");
		return mv;
	}

	@RequestMapping("add") // In html we need to add action type name here
	public ModelAndView add() {
		mv.setViewName("addNewHouse.html"); // by clicking add button it moves to the html page
		return mv;
	}

	@RequestMapping("addhouse")
	public ModelAndView addNewHouse(House house) {

		houserepo.save(house);
		mv.setViewName("home.html");
		return mv;

	}

	@RequestMapping("view")
	public String view(Model model) {
		// model.setViewName("viewHouse.html");

		Iterable<House> houseiterable = houserepo.findAll();

		// List<House> newHouse = new ArrayList<House>();
		// for(House eachHouse:houseiterable)
		// {
		// newHouse.add(eachHouse);
		// System.out.println("eachHouse ======>"+eachHouse);
		// }

		model.addAttribute("houses", houseiterable);
		return "viewHouse.html";
	}

	@RequestMapping("editHouse")

	public ModelAndView editHouse(House house) {
		houserepo.save(house);
		mv.setViewName("editHouse.html");
		return mv;
	}

	@RequestMapping("deleteHouse")

	public ModelAndView deleteHouse(House house) {
		Optional<House> selectHouse = houserepo.findById(house.getHno());
		houserepo.delete(selectHouse.get()); //
		mv.setViewName("viewHouse.html");
		;
		return home();
	}

	@RequestMapping("search")
	public ModelAndView searchbyID(Integer id) {
		House housefound = houserepo.findById(id).orElse(new House());

		mv.addObject(housefound);
		System.out.println("housefound");
		mv.setViewName("searchResults.html");
		return mv;
	}


}


